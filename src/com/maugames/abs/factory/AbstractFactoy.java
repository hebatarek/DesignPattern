package com.maugames.abs.factory;

public abstract class AbstractFactoy {

	public static AbstractFactoy getFactory(int score) {
		if(score > 360) return new AMXFactory() ;
		else return new VisaFactory();
	}
	
	public abstract CreditCard getCard(CardType cardType);
}
