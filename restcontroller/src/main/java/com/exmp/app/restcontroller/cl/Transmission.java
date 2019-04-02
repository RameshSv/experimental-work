package com.exmp.app.restcontroller.cl;


public class Transmission {
	private String type;

	public Transmission(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return String.format("%s", type);
	}
}
