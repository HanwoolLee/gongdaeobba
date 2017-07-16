package com.gongdaeobba.dao;

public class mainboard {
	/*
			-- 메인보드 속성
			-- 작성자: 이한울		-- 날짜: 2017-07-16
			company:					제조회사
			socket:						소켓
			chipsetCompany		칩셋제조사
			chipsetCpu				칩셋cpu
			memoryCase			메모리종류
			memorySpeed			메모리속도
			memoryPs					
			pciExpress3_0_x_16
			pciExpress_x_16
			pciExpress3_0_x_8
			pciExpress_x8

	 */
	public String company;
	public String socket;
	public String chipsetCompany;
	public String chipsetCpu;
	public String memoryCase;
	public String memorySpeed;
	public String memoryPs;
	public int pciExpress3_0_x_16;
	public int pciExpress_x_16;
	public int pciExpress3_0_x_8;
	public int pciExpress_x8;
	public int power;
	public int size;
	
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
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
	public String getChipsetCompany() {
		return chipsetCompany;
	}
	public void setChipsetCompany(String chipsetCompany) {
		this.chipsetCompany = chipsetCompany;
	}
	public String getChipsetCpu() {
		return chipsetCpu;
	}
	public void setChipsetCpu(String chipsetCpu) {
		this.chipsetCpu = chipsetCpu;
	}
	public String getMemoryCase() {
		return memoryCase;
	}
	public void setMemoryCase(String memoryCase) {
		this.memoryCase = memoryCase;
	}
	public String getMemorySpeed() {
		return memorySpeed;
	}
	public void setMemorySpeed(String memorySpeed) {
		this.memorySpeed = memorySpeed;
	}
	public String getMemoryPs() {
		return memoryPs;
	}
	public void setMemoryPs(String memoryPs) {
		this.memoryPs = memoryPs;
	}
	public int getPciExpress3_0_x_16() {
		return pciExpress3_0_x_16;
	}
	public void setPciExpress3_0_x_16(int pciExpress3_0_x_16) {
		this.pciExpress3_0_x_16 = pciExpress3_0_x_16;
	}
	public int getPciExpress_x_16() {
		return pciExpress_x_16;
	}
	public void setPciExpress_x_16(int pciExpress_x_16) {
		this.pciExpress_x_16 = pciExpress_x_16;
	}
	public int getPciExpress3_0_x_8() {
		return pciExpress3_0_x_8;
	}
	public void setPciExpress3_0_x_8(int pciExpress3_0_x_8) {
		this.pciExpress3_0_x_8 = pciExpress3_0_x_8;
	}
	public int getPciExpress_x8() {
		return pciExpress_x8;
	}
	public void setPciExpress_x8(int pciExpress_x8) {
		this.pciExpress_x8 = pciExpress_x8;
	}
	public int getPciExpress3_0_x_4() {
		return pciExpress3_0_x_4;
	}
	public void setPciExpress3_0_x_4(int pciExpress3_0_x_4) {
		this.pciExpress3_0_x_4 = pciExpress3_0_x_4;
	}
	public int getPciExpress_x_4() {
		return pciExpress_x_4;
	}
	public void setPciExpress_x_4(int pciExpress_x_4) {
		this.pciExpress_x_4 = pciExpress_x_4;
	}
	public int getPciExpress3_0_x1() {
		return pciExpress3_0_x1;
	}
	public void setPciExpress3_0_x1(int pciExpress3_0_x1) {
		this.pciExpress3_0_x1 = pciExpress3_0_x1;
	}
	public int getPciExpress_x_1() {
		return pciExpress_x_1;
	}
	public void setPciExpress_x_1(int pciExpress_x_1) {
		this.pciExpress_x_1 = pciExpress_x_1;
	}
	public String getSataCase() {
		return sataCase;
	}
	public void setSataCase(String sataCase) {
		this.sataCase = sataCase;
	}
	public String getFormFactor() {
		return formFactor;
	}
	public void setFormFactor(String formFactor) {
		this.formFactor = formFactor;
	}
	public String getUsbPort() {
		return usbPort;
	}
	public void setUsbPort(String usbPort) {
		this.usbPort = usbPort;
	}
	public int pciExpress3_0_x_4;
	public int pciExpress_x_4;
	public int pciExpress3_0_x1;
	public int pciExpress_x_1;
	public String sataCase;
	public String formFactor;
	public String usbPort;
}
