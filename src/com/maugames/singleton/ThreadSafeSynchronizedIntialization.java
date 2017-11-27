package com.maugames.singleton;
/*
 * el approach dh kwis m3a el multi-thread 
 * bs moshkltoh anoh decrease el performance 3shn el synchronized method
 */
public class ThreadSafeSynchronizedIntialization {
	
	private static ThreadSafeSynchronizedIntialization instance;
	
	private ThreadSafeSynchronizedIntialization() {};
	
	public static synchronized ThreadSafeSynchronizedIntialization getInstance() {
		if(instance==null)
			instance=new ThreadSafeSynchronizedIntialization();
		return instance;
	}
}
