package com.maugames.factory;

import java.util.ArrayList;
import java.util.List;

public abstract class Website {
	protected List<Page> pages=new ArrayList<>();

	/**
	 * @return the pages
	 */
	public List<Page> getPages() {
		return pages;
	}
	
	public Website() {
		createWebsite();
	}

	protected abstract void createWebsite() ;
	
	
}
