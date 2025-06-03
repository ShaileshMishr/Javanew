package com.example.app;

public class Alien {

	private int aid;
	private String Aname;
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	
	
	
	public String getAname() {
		return Aname;
	}
	public void setAname(String aname) {
		Aname = aname;
	}
	@Override
	public String toString() {
		return "Alien [aid=" + aid + ", Aname=" + Aname + "]";
	}
	
	
	
}
