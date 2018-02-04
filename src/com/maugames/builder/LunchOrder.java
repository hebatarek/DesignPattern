package com.maugames.builder;

public class LunchOrder {
	
	private String meat;
	private String bread;
	private String dressing;
	
	public static class Builder{
		private String meat;
		private String bread;
		private String dressing;
		
		public LunchOrder build() {
			return new LunchOrder(this);
		}

		/**
		 * @param meat the meat to set
		 */
		public Builder setMeat(String meat) {
			this.meat = meat;
			return this;
		}
		/**
		 * @param bread the bread to set
		 */
		public Builder setBread(String bread) {
			this.bread = bread;
			return this;
		}
		/**
		 * @param dressing the dressing to set
		 */
		public Builder setDressing(String dressing) {
			this.dressing = dressing;
			return this;
		}
	}
	
	
	private LunchOrder(Builder builder) {
		this.meat=builder.meat;
		this.bread=builder.bread;
		this.dressing=builder.dressing;
	}


	/**
	 * @return the meat
	 */
	public String getMeat() {
		return meat;
	}

	/**
	 * @return the bread
	 */
	public String getBread() {
		return bread;
	}

	/**
	 * @return the dressing
	 */
	public String getDressing() {
		return dressing;
	}
	
	

}
