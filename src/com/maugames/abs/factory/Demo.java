package com.maugames.abs.factory;

public class Demo {

	public static void main(String[] args) {
		VisaFactory visaFactory=(VisaFactory) AbstractFactoy.getFactory(300);
		System.out.println(visaFactory.getClass());
		VisaGoldCard visaGoldCard=(VisaGoldCard) visaFactory.getCard(CardType.VISAGOLD);
		System.out.println(visaGoldCard.getClass());
		VisaBlackCard visaBlackCard=(VisaBlackCard) visaFactory.getCard(CardType.VISABLACK);
		System.out.println(visaBlackCard.getClass());
	}

}
