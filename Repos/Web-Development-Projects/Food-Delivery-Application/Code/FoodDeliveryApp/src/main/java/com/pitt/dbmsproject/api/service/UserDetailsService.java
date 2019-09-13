package com.pitt.dbmsproject.api.service;

import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pitt.dbmsproject.api.dao.AddressDetailsDAO;
import com.pitt.dbmsproject.api.dao.UserDetailsDAO;
import com.pitt.dbmsproject.api.entity.AddressEntity;
import com.pitt.dbmsproject.api.entity.ItemDetailsEntity;
import com.pitt.dbmsproject.api.entity.UserDetailsEntity;
import com.pitt.dbmsproject.api.model.AddressVO;
import com.pitt.dbmsproject.api.model.UserDetailsResponseVO;
import com.pitt.dbmsproject.api.model.UserDetailsVO;
import org.springframework.beans.BeanUtils;

@Service
public class UserDetailsService {
	
	@Autowired
	private UserDetailsDAO userDetailsDAO;
	
	@Autowired
	private AddressDetailsDAO addressDetailsDAO;
	
	public UserDetailsResponseVO validateUsernameAndPassword(UserDetailsVO userDetailsVO) {
		String userName = userDetailsVO.getUserName();
		String password = userDetailsVO.getPassword();
		int userType = userDetailsVO.getUserType();
		UserDetailsResponseVO userDetailsResponseVO = new UserDetailsResponseVO();
		UserDetailsEntity userDetailsEntity = userDetailsDAO.findByUserNameIgnoreCase(userName);
		if(null==userDetailsEntity)
			userDetailsResponseVO.setUserNameMessage("Invalid Username");
		else {
			userDetailsResponseVO.setUserNameMessage("Valid Username");
			if(!password.equals(userDetailsEntity.getPassword())) 
				userDetailsResponseVO.setPasswordMessage("Invalid Password");
			else {
				userDetailsResponseVO.setPasswordMessage("Valid Password");
				if(userType!=userDetailsEntity.getUserType())
					userDetailsResponseVO.setUserTypeMessage("Invalid User Type");
				else
					userDetailsResponseVO.setUserTypeMessage("Valid User Type");
				userDetailsEntity.setLoginStatus(1);
				userDetailsDAO.save(userDetailsEntity);
			}
		}
		return userDetailsResponseVO;
	}
	
	public List<UserDetailsVO> getAllUsers(){
		List<UserDetailsVO> userDetailsVOs = new ArrayList<UserDetailsVO>();
		for(UserDetailsEntity ude: userDetailsDAO.findAll()) {
			AddressVO addressVO = new AddressVO();
			//System.out.println("Address: "+ude.getAddressEntity().getAddressId());
			UserDetailsVO userDetailsVO = new UserDetailsVO();
			BeanUtils.copyProperties(ude, userDetailsVO);
			BeanUtils.copyProperties(ude.getAddressEntity(), addressVO);
			userDetailsVO.setAddressDetails(addressVO);
			userDetailsVOs.add(userDetailsVO);
		}	
		return userDetailsVOs;
	}
	
	public UserDetailsVO getUserDetailsByUserName(String userName) {
		UserDetailsEntity ude = userDetailsDAO.findByUserNameIgnoreCase(userName);
		AddressVO addressVO = new AddressVO();
		UserDetailsVO userDetailsVO = new UserDetailsVO();
		BeanUtils.copyProperties(ude, userDetailsVO);
		BeanUtils.copyProperties(ude.getAddressEntity(), addressVO);
		userDetailsVO.setAddressDetails(addressVO);
		return userDetailsVO;
	}
	
	public void logOutUser(String userName) {
		if(null!=userName) {
			UserDetailsEntity ude = userDetailsDAO.findByUserNameIgnoreCase(userName);
			ude.setLoginStatus(0);
			userDetailsDAO.save(ude);
		}
	}
	
	@Transactional
	public void deleteUser(String userName) {
		userDetailsDAO.deleteByUserNameIgnoreCase(userName);
	}
	
	public void addUser(UserDetailsVO userDetailsVO) throws ParseException {
		UserDetailsEntity ude = new UserDetailsEntity();
		AddressEntity ae = new AddressEntity();
		//SimpleDateFormat formatter1 = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");  
		//String currDate = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss").format(formatter1.parse(userDetailsVO.getJoinedOn()));
		//ude.setJoinedOn(Timestamp.valueOf(currDate));
		BeanUtils.copyProperties(userDetailsVO, ude);
		BeanUtils.copyProperties(userDetailsVO.getAddressDetails(), ae);
		ude.setJoinedOn(null);
		AddressEntity addressEntity = addressDetailsDAO.save(ae);
		ude.setAddressEntity(addressEntity);
		ude.setUserName(userDetailsVO.getUserName().toLowerCase());
		if(userDetailsVO.getUserType()==1)
			ude.setMemberType(null);
		userDetailsDAO.save(ude);
	}

	public void updateUserDetails(String userName, UserDetailsVO userDetailsVO) {
		UserDetailsEntity userDetailsEntity = userDetailsDAO.findByUserNameIgnoreCase(userName);
		AddressEntity ae=null;
//		if(null!=userDetailsVO.getUserName() && !userDetailsVO.getUserName().isEmpty())
//			userDetailsEntity.setUserName(userDetailsVO.getUserName());
		if(null!=userDetailsVO.getPassword() && !userDetailsVO.getPassword().isEmpty())
			userDetailsEntity.setPassword(userDetailsVO.getPassword());
		if(null!=userDetailsVO.getFullName() && !userDetailsVO.getFullName().isEmpty())
			userDetailsEntity.setFullName(userDetailsVO.getFullName());
		if(userDetailsVO.getMemberType()>=0)
			userDetailsEntity.setMemberType(userDetailsVO.getMemberType());
		if(null!=userDetailsVO.getEmail() && !userDetailsVO.getEmail().isEmpty())
			userDetailsEntity.setEmail(userDetailsVO.getEmail());
		if(null!=userDetailsVO.getContactNumber() && !userDetailsVO.getContactNumber().isEmpty())
			userDetailsEntity.setContactNumber(userDetailsVO.getContactNumber());
		if(null!=userDetailsVO.getAddressDetails()) {
			if(null!=userDetailsVO.getAddressDetails().getAddress() && !userDetailsVO.getAddressDetails().getAddress().isEmpty() ||
					userDetailsVO.getAddressDetails().getZipCode()>=0) {
				ae = addressDetailsDAO.findById(userDetailsVO.getAddressDetails().getAddressId()).get();
				if(null!=userDetailsVO.getAddressDetails().getAddress() && !userDetailsVO.getAddressDetails().getAddress().isEmpty())
					ae.setAddress(userDetailsVO.getAddressDetails().getAddress());
				if(userDetailsVO.getAddressDetails().getZipCode()>=0)
					ae.setZipCode(userDetailsVO.getAddressDetails().getZipCode());
			}
		}	
		addressDetailsDAO.save(ae);
		userDetailsDAO.save(userDetailsEntity);
	}

	public UserDetailsEntity findUserDetailsByUserName(String userName) {
		return userDetailsDAO.findByUserNameIgnoreCase(userName);
	}
	
	public UserDetailsEntity findUserDetailsByUserId(int userId) {
		return userDetailsDAO.findById(userId).get();
	}
}
