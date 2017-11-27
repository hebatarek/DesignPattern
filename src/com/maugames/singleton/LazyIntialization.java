package com.maugames.singleton;

/*
 * moshkltoh anoh ynf3 bs m3a el single thread 
 * lkn fi el multi-thread msh hynf3 awl kam thread 
 * mmkn y create aktr mn instance 
 * el mohm dh msh approach kwis m3a el multi-thread
 */
public class LazyIntialization {
	
	private static LazyIntialization instance;
	
	private LazyIntialization() {};
	
	public static LazyIntialization getInstance() {
		if(instance==null)
			instance=new LazyIntialization();
		
		return instance;
	}
}
