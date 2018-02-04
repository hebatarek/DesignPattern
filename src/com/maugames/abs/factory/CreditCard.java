package com.maugames.abs.factory;

public abstract class CreditCard {
	private String cardNo;
	private String sNo;
	/**
	 * @return the cardNo
	 */
	public String getCardNo() {
		return cardNo;
	}
	/**
	 * @param cardNo the cardNo to set
	 */
	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}
	/**
	 * @return the sNo
	 */
	public String getsNo() {
		return sNo;
	}
	/**
	 * @param sNo the sNo to set
	 */
	public void setsNo(String sNo) {
		this.sNo = sNo;
	}
}
