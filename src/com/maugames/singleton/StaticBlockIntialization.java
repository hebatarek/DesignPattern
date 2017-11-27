package com.maugames.singleton;

public class StaticBlockIntialization {
	
	private static StaticBlockIntialization instance;
	
	private StaticBlockIntialization() {};
	
	static {
		try {
			instance=new StaticBlockIntialization();
		}catch (Exception e) {
			throw new RuntimeException("this error happen in instance creation");
		}
	}
	
	public static StaticBlockIntialization getInstance() {
		return instance;
	}
}
