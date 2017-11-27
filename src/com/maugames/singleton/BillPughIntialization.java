package com.maugames.singleton;
/*
 * el approach dh kwis 3shn el memory w multi-thread
 * el singleton helper msh htkon loaded fi el memory 
 * 3'ir lw el client 3ml call ll getInstance method
 */
public class BillPughIntialization {
	
	private BillPughIntialization() {}
	
	private static class SingletonHelper{
		private static final BillPughIntialization instance=new BillPughIntialization(); 
	}
	
	public static BillPughIntialization getInstance() {
		return SingletonHelper.instance;
	}
}
