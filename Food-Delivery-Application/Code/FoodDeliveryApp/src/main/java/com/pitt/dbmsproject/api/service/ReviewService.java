package com.pitt.dbmsproject.api.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.pitt.dbmsproject.api.dao.ReviewDetailsDAO;
import com.pitt.dbmsproject.api.entity.RestaurantDetailsEntity;
import com.pitt.dbmsproject.api.entity.ReviewDetailsEntity;
import com.pitt.dbmsproject.api.entity.UserDetailsEntity;
import com.pitt.dbmsproject.api.model.ReviewDetailsVO;

@Service
public class ReviewService {
	
	@Autowired
	private ReviewDetailsDAO reviewDetailsDAO;
	
	@Autowired
	private UserDetailsService userDetailsService;
	
	public List<ReviewDetailsVO> getAllReviews() throws Exception{
		List<ReviewDetailsVO> reviewDetailsVOs = new ArrayList<ReviewDetailsVO>();
		Iterator<ReviewDetailsEntity> iterator = reviewDetailsDAO.findAll().iterator();
		if(null==iterator)
			throw new Exception("No reviews posted yet...");
		while (iterator.hasNext()) {
		//for(ReviewDetailsEntity rvde: rdes) {
			ReviewDetailsEntity rvde = iterator.next();
			ReviewDetailsVO reviewDetailsVO = new ReviewDetailsVO();
			BeanUtils.copyProperties(rvde, reviewDetailsVO);
			populateReviewDetailsVO(rvde, reviewDetailsVO);
			reviewDetailsVOs.add(reviewDetailsVO);
		//}	
		}
		return reviewDetailsVOs;
	}

	public List<ReviewDetailsVO> getReviewsByUserName(String userName) throws Exception {
		List<ReviewDetailsVO> reviewDetailsVOs = new ArrayList<ReviewDetailsVO>();
		Iterator<ReviewDetailsEntity> iterator = reviewDetailsDAO.findReviewDetailsByUserName(userName).iterator();
		if(null==iterator)
			throw new Exception("No reviews posted by this user yet...");
		//for(ReviewDetailsEntity rvde: reviewDetailsDAO.findReviewDetailsByUserName(userName)) {
		while (iterator.hasNext()) {
			ReviewDetailsEntity rvde = iterator.next();
			ReviewDetailsVO reviewDetailsVO = new ReviewDetailsVO();
			BeanUtils.copyProperties(rvde, reviewDetailsVO);
			populateReviewDetailsVO(rvde, reviewDetailsVO);
			reviewDetailsVOs.add(reviewDetailsVO);
		}	
		//}	
		return reviewDetailsVOs;
	}
	
	private void populateReviewDetailsVO(ReviewDetailsEntity rvde, ReviewDetailsVO reviewDetailsVO) {
		reviewDetailsVO.setUserId(rvde.getUserDetailsEntity().getUserId());
		reviewDetailsVO.setUserName(rvde.getUserDetailsEntity().getUserName());
		reviewDetailsVO.setRestaurantId(rvde.getRestaurantDetailsEntity().getRestaurantId());
		reviewDetailsVO.setRestaurantName(rvde.getRestaurantDetailsEntity().getName());
	}
	
	public void createReview(ReviewDetailsVO reviewDetailsVO) {
		
		ReviewDetailsEntity rvde = new ReviewDetailsEntity();
		UserDetailsEntity ude = userDetailsService.findUserDetailsByUserName(reviewDetailsVO.getUserName());
		BeanUtils.copyProperties(reviewDetailsVO, rvde);
		populateReviewDetailsEntity(reviewDetailsVO, rvde);
		rvde.setUserDetailsEntity(ude);
		reviewDetailsDAO.save(rvde);
	}

	private void populateReviewDetailsEntity(ReviewDetailsVO reviewDetailsVO, ReviewDetailsEntity rvde) {
		rvde.setUserDetailsEntity(new UserDetailsEntity(reviewDetailsVO.getUserId()));
		rvde.setRestaurantDetailsEntity(new RestaurantDetailsEntity(reviewDetailsVO.getRestaurantId()));
		//rvde.setItemDetailsEntity(new ItemDetailsEntity(reviewDetailsVO.getItemId()));
	}

	public void updateReview(int reviewId, ReviewDetailsVO reviewDetailsVO) {
		ReviewDetailsEntity reviewDetailsEntity = reviewDetailsDAO.findById(reviewId).get();
		if(reviewDetailsVO.getStars()>=0)
			reviewDetailsEntity.setStars(reviewDetailsVO.getStars());
		if(null!=reviewDetailsVO.getDescription() && !reviewDetailsVO.getDescription().isEmpty())
			reviewDetailsEntity.setDescription(reviewDetailsVO.getDescription());
		
		reviewDetailsDAO.save(reviewDetailsEntity);
	}
	
	@Transactional
	public void deleteReview(int itemId){
		reviewDetailsDAO.deleteById(itemId);
	}

}
