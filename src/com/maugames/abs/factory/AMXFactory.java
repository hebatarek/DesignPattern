package com.maugames.abs.factory;

public class AMXFactory extends AbstractFactoy{

	@Override
	public CreditCard getCard(CardType cardType) {
		switch(cardType) {
		case AMXGOLD: return new AMXGoldCard();
		case AMXSILVER: return new AMXSilverCard();
		default: return null;
		}
	}

}
