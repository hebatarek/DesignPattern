package com.maugames.builder;

public class LunchDemo {
	
	public static void main(String[] args) {
		
		LunchOrder.Builder lunchBuilder= new LunchOrder.Builder();
		
		lunchBuilder.setBread("Cizer").setDressing("ransh");
		
		LunchOrder lunchOrder=lunchBuilder.build();
		
		System.out.println("meat option: "+lunchOrder.getMeat());
		
		System.out.println("bread option: "+lunchOrder.getBread());
		
		System.out.println("dressing option: "+lunchOrder.getDressing());
	}
}
