package com.pitt.dbmsproject.api.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.pitt.dbmsproject.api.model.ItemDetailsVO;
import com.pitt.dbmsproject.api.service.ItemService;

@RestController
public class ItemController {
	
	@Autowired
	private ItemService itemService;
	
	// GET Method
	@RequestMapping("/restaurant/{restId}/cuisine/{cuisineId}/item/getItem")
	public List<ItemDetailsVO> getItemsByCuisineId(@PathVariable int restId, 
			@PathVariable int cuisineId) {
		return itemService.getItemsByRestaurantIdAndCuisineId(restId, cuisineId);
	}
	
	// GET Method
	@RequestMapping("/restaurant/getMostEconomicalItemsByRestId/restId={restId}&price={price}")
	public List<ItemDetailsVO> getMostEconomicalItemsUnderPriceByRestId(@PathVariable int restId, 
			@PathVariable int price) {
		return itemService.getMostEconomicalItemsUnderPriceByRestId(restId, price);
	}
	
	// POST Method
	@RequestMapping(method=RequestMethod.POST, value="/restaurant/{restId}/cuisine/{cuisineId}"
			+ "/item/addItem")
	public void createItem(@PathVariable int restId, @PathVariable int cuisineId, 
			@RequestBody ItemDetailsVO itemDetailsVO) {
		itemService.createItem(restId, cuisineId, itemDetailsVO);
	}
	
	// PUT Method
	@RequestMapping(method=RequestMethod.PUT, value="/item/updateItem/itemID={itemId}")
	public void updateItem(@PathVariable int itemId, 
			@RequestBody ItemDetailsVO itemDetailsVO) {
		itemService.updateItem(itemId, itemDetailsVO);
	}

	// DELETE method
	@RequestMapping(method=RequestMethod.DELETE, value="/item/deleteItem/itemID={itemId}")
	public void deleteItem(@PathVariable int itemId) {
		itemService.deleteItem(itemId);
	}
	
}

