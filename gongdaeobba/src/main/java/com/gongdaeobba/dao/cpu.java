package com.gongdaeobba.dao;

public class cpu {
	public String company;
	public String socket;
	public String chipset;
	public String supprot_ddr;
	public int coreCnt;
	public int operationSpeed;
	public int operationSystem; 
	public int power;
	
	
	public int getPower() {
		return power;
	}
	public void setPower(int power) {
		this.power = power;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getSocket() {
		return socket;
	}
	public void setSocket(String socket) {
		this.socket = socket;
	}
	public String getChipset() {
		return chipset;
	}
	public void setChipset(String chipset) {
		this.chipset = chipset;
	}
	public String getSupprot_ddr() {
		return supprot_ddr;
	}
	public void setSupprot_ddr(String supprot_ddr) {
		this.supprot_ddr = supprot_ddr;
	}
	public String getGPU() {
		return GPU;
	}
	public void setGPU(String gPU) {
		GPU = gPU;
	}
	public String GPU;
}
