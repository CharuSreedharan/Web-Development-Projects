package com.pitt.dbmsproject.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.pitt.dbmsproject.api.model.CuisineDetailsVO;
import com.pitt.dbmsproject.api.model.IDDetailsVO;
import com.pitt.dbmsproject.api.model.SuborderDetailsVO;
import com.pitt.dbmsproject.api.service.SuborderService;

@RestController
@RequestMapping("/cart")
public class CartController {
	
	@Autowired
	private SuborderService suborderService;
	
	// GET Method
	@RequestMapping("/viewCartBySuborderIds")
	public List<SuborderDetailsVO> viewCartBySuborderIds(@RequestBody List<IDDetailsVO> suborderIdList) {
		return suborderService.viewCartBySuborderIds(suborderIdList);
	}
	
	// GET Method
	@RequestMapping("/viewCartByUserName/username={userName}")
	public List<SuborderDetailsVO> viewCartByUserName(@PathVariable String userName) {
		return suborderService.viewCartByUserName(userName);
	}
	
	// POST Method
	@RequestMapping(method=RequestMethod.POST, value="/addToCart")
	public List<SuborderDetailsVO> addToCart(@RequestBody List<SuborderDetailsVO> suborderDetailsVOs) {
		return suborderService.addToCart(suborderDetailsVOs);
	}
	
	// DELETE method
	@RequestMapping(method=RequestMethod.DELETE, value="/deleteCart")
	public void deleteCart(@RequestBody List<IDDetailsVO> suborderIdList) {
		suborderService.deleteCart(suborderIdList);
	}

}
