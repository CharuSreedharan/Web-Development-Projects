package com.pitt.dbmsproject.api.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.pitt.dbmsproject.api.model.OrderDetailsVO;
import com.pitt.dbmsproject.api.service.OrderService;

@RestController
@RequestMapping("/order")
public class OrderController {

	@Autowired
	private OrderService orderService;
	
	//@Autowired
    //private DistanceCalculatorControllerInterface distanceCalculatorControllerInterface;
	
	// test
//	@RequestMapping(method=RequestMethod.POST, value="/getTime")
//	public void testDistanceOrder(@RequestBody OrderDetailsVO orderDetailsVO) {
//		int restaurantZipCode = 15260;
//		DistanceVO distanceVO = distanceCalculatorControllerInterface.getDistanceBetweenTwoZipCodes(restaurantZipCode, 
//				orderDetailsVO.getDeliveryAddress().getZipCode());
//		double distance = distanceVO.getDistance();
//		int speed = 30;
//		double time = (distance/speed)*3600*1000;
//		Timestamp newTimestamp = new Timestamp(System.currentTimeMillis());;
//		newTimestamp.setTime(System.currentTimeMillis() + (long)time);
//		
//		System.out.println("Distance: "+distance);
//		System.out.println("Time: "+time/(3600*1000));
//		System.out.println("NewTimestamp: "+newTimestamp);
//	}
	
	// GET Method
	@RequestMapping("/getAllOrders")
	public List<OrderDetailsVO> getAllOrders() {
		return orderService.getAllOrders();
	}
	
	// GET Method
	@RequestMapping("/getOrdersByUserName/uname={uname}")
	public List<OrderDetailsVO> getOrdersByUserName(@PathVariable String uname) {
		return orderService.getOrdersByUserName(uname);
	}
	
	// POST Method
	@RequestMapping(method=RequestMethod.POST, value="/createOrder")
	public void createOrder(@RequestBody OrderDetailsVO orderDetailsVO) throws Exception {
		orderService.createOrder(orderDetailsVO);
	}
	
//	// GET
//	@RequestMapping("/user/getUsers")
//	public List<UserDetailsVO> getAllUsers() {
//		return userDetailsService.getAllUsers();
//	}
//	
//	// DELETE
//	@RequestMapping(method=RequestMethod.DELETE, value="/user/deleteUsers/userName={userName}")
//	public void deleteUser(@PathVariable String userName) {
//		userDetailsService.deleteUser(userName);
//	}
	
}

