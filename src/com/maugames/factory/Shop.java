package com.maugames.factory;

public class Shop extends Website {
	
	public Shop() {
		super();
	}
	
	@Override
	protected void createWebsite() {
		pages.add(new Search());
		pages.add(new Item());
		pages.add(new Cart());

	}

}
