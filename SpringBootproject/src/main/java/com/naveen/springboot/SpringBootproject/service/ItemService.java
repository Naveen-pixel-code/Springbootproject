package com.naveen.springboot.SpringBootproject.service;

import java.util.List;

import com.naveen.springboot.SpringBootproject.model.Item;

public interface ItemService {
	
	Item saveItems(Item item);
	
	List<Item> getAllItems();

}
