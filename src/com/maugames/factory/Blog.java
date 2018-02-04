package com.maugames.factory;

public class Blog extends Website {

	public Blog() {
		super();
	}

	@Override
	protected void createWebsite() {
		
		pages.add(new Comment());
		pages.add(new Post());
		pages.add(new ContactMe());

	}

}
