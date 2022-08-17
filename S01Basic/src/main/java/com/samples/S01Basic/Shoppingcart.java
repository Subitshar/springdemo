package com.samples.S01Basic;

public class Shoppingcart {
	private Iteam iteam;

	public Iteam getIteam() {
		return iteam;
	}

	public void setIteam(Iteam iteam) {
		this.iteam = iteam;
	}

	@Override
	public String toString() {
		return "Shoppingcart [iteam=" + iteam + "]";
	}
	
	

}
