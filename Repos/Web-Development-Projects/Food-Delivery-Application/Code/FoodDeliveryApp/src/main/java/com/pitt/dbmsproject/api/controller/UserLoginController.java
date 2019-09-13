package com.pitt.dbmsproject.api.controller;

import java.text.ParseException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.pitt.dbmsproject.api.model.UserDetailsResponseVO;
import com.pitt.dbmsproject.api.service.UserDetailsService;
import com.pitt.dbmsproject.api.model.UserDetailsVO;

@RestController
public class UserLoginController {

	@Autowired
	private UserDetailsService userDetailsService;
	
	// GET
	@RequestMapping("/user/getUsers")
	public List<UserDetailsVO> getAllUsers() {
		return userDetailsService.getAllUsers();
	}
	
	// GET
	@RequestMapping("/user/getUserDetails/userName={userName}")
	public UserDetailsVO getUserDetailsByUserName(@PathVariable String userName) {
		return userDetailsService.getUserDetailsByUserName(userName);
	}
	
	// GET
	@RequestMapping("/user/logOutUser/userName={userName}")
	public void logOutUser(@PathVariable String userName) {
		userDetailsService.logOutUser(userName);
	}
	
	// POST Method
	@RequestMapping(method=RequestMethod.POST, value="/user/addUser")
	public void addUser(@RequestBody UserDetailsVO userDetailsVO) throws ParseException{
		userDetailsService.addUser(userDetailsVO);
	}
	
	// POST Method
	@RequestMapping(method=RequestMethod.POST, value="/validateunameandpassword")
	public UserDetailsResponseVO validateUsernameAndPassword(@RequestBody UserDetailsVO userDetailsVO) {
		return userDetailsService.validateUsernameAndPassword(userDetailsVO);
	}
	
	// PUT Method
	@RequestMapping(method=RequestMethod.PUT, value="/user/updateUserDetails/userName={userName}")
	public void updateUserDetails(@PathVariable String userName, @RequestBody UserDetailsVO userDetailsVO) {
		userDetailsService.updateUserDetails(userName, userDetailsVO);
	}
	
	// DELETE
	@RequestMapping(method=RequestMethod.DELETE, value="/user/deleteUsers/userName={userName}")
	public void deleteUser(@PathVariable String userName) {
		userDetailsService.deleteUser(userName);
	}
	
}

