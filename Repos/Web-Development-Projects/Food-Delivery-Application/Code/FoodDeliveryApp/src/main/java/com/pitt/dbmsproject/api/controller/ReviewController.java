package com.pitt.dbmsproject.api.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.pitt.dbmsproject.api.model.ReviewDetailsVO;
import com.pitt.dbmsproject.api.service.ReviewService;

@RestController
@RequestMapping("/review")
public class ReviewController {
	
	@Autowired
	private ReviewService reviewService;
	
	// GET Method
	@RequestMapping("/getAllReviews")
	public List<ReviewDetailsVO> getAllReviews() throws Exception {
		return reviewService.getAllReviews();
	}
	
	// GET Method
	@RequestMapping("/getReviewsByUserName/uname={uname}")
	public List<ReviewDetailsVO> getReviewsByUserName(@PathVariable String uname) throws Exception {
		return reviewService.getReviewsByUserName(uname);
	}
	
	// POST Method
	@RequestMapping(method=RequestMethod.POST, value="/createReview")
	public void createReview(@RequestBody ReviewDetailsVO reviewDetailsVO) {
		reviewService.createReview(reviewDetailsVO);
	}

	// PUT Method
	@RequestMapping(method=RequestMethod.PUT, value="/updateReview/id={id}")
	public void updateReview(@PathVariable int id, @RequestBody ReviewDetailsVO reviewDetailsVO) {
		reviewService.updateReview(id, reviewDetailsVO);
	}

	// DELETE
	@RequestMapping(method=RequestMethod.DELETE, value="deleteReview/id={id}")
	public void deleteReview(@PathVariable int id) {
		reviewService.deleteReview(id);
	}
	
}
