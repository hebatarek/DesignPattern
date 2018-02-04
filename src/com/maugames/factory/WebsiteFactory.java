package com.maugames.factory;

public class WebsiteFactory {
	
	public Website createWebsite(WebsiteTypes type) {
		switch(type) {
			case BLOG:
				return new Blog();
			case SHOP:
				return new Shop();
			default:
				return null;
		}
	}
}
