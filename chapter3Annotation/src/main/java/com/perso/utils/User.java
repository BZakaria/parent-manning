package com.perso.utils;

public class User {

	private String id;
	private String name;
	private boolean canReceiveJunk;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isCanReceiveJunk() {
		return canReceiveJunk;
	}
	public void setCanReceiveJunk(boolean canReceiveJunk) {
		this.canReceiveJunk = canReceiveJunk;
	}
	
}
