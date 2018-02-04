package com.maugames.protoType;

public class Demo {
	
	public static void main(String[] args) {
		Registery registery= new Registery();
		
		Movie movie1 = (Movie) registery.createItem("movie");
		movie1.setTitle("t1");
		movie1.setStar("s1");
		System.out.println("movie1: "+movie1);
		System.out.println("movie1 star: "+movie1.getStar());
		System.out.println("movie1 title: "+movie1.getTitle());
		System.out.println("movie1 url: "+movie1.getUrl());
		Movie movie2 = (Movie) registery.createItem("movie");
		movie2.setTitle("t2");
		movie2.setStar("s2");
		System.out.println("movie2: "+movie2);
		System.out.println("movie2 star: "+movie2.getStar());
		System.out.println("movie2 title: "+movie2.getTitle());
		System.out.println("movie2 url: "+movie2.getUrl());
	}
}
