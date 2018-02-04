package com.maugames.factory;

public class Demo {

	public static void main(String[] args) {
		
		WebsiteFactory websiteFactory=new WebsiteFactory();
		
		Blog blog = (Blog) websiteFactory.createWebsite(WebsiteTypes.BLOG);
		
		Shop shop = (Shop) websiteFactory.createWebsite(WebsiteTypes.SHOP);
		
		System.out.println("blog pages: "+blog.getPages());
		System.out.println("shop pages: "+shop.getPages());
	}

}
