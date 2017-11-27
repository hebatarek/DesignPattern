package com.maugames.singleton;
/**
 * el enum singlton bykon kwis lw kont h use el reflections 
 * 3shn el reflections mmkn t destroy el singlton 
 * 3shn el java bt ensure n el values bt3t el enum tt intialize mra w7da bs
 * kman btkon public accessible 3la mstwa el application
 *  el moshkla n el enum dh fixed type
 * @author hebatarek
 *
 */
public enum EnumSingleton {
	
	INSTANCE;
	
	public static void doSomething() {
		//......
	}
}
