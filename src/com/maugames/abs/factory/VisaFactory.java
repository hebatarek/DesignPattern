package com.maugames.abs.factory;

public class VisaFactory extends AbstractFactoy{

	public CreditCard getCard(CardType cardType) {
		switch(cardType) {
		case VISABLACK: return new VisaBlackCard();
		case VISAGOLD: return new VisaGoldCard();
		default: return null;
		}
	}

}
