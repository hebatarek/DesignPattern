package com.maugames.protoType;

import java.util.HashMap;
import java.util.Map;

public class Registery {
	
	public Map<String,Item> items=new HashMap<>();
	
	public Registery() {
		loadItems();
	}
	
	private void loadItems() {
		items.put("movie", new Movie());
		items.put("book", new Book());
	}
	
	public Item createItem(String type) {
		Item item=null;
		try {
			item=(Item)items.get(type).clone();
		}catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return item;
	}
}
