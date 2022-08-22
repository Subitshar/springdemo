package com.samples.S01Basic;

public class Scores {
	private int maths;
	private int chemistry;
	private int physics;
	public int getMaths() {
		return maths;
	}
	public void setMaths(int maths) {
		this.maths = maths;
	}
	public int getChemistry() {
		return chemistry;
	}
	public void setChemistry(int chemistry) {
		this.chemistry = chemistry;
	}
	public int getPhysics() {
		return physics;
	}
	public void setPhysics(int physics) {
		this.physics = physics;
	}
	@Override
	public String toString() {
		return "Scores [maths=" + maths + ", chemistry=" + chemistry + ", physics=" + physics + "]";
	}
	

}
