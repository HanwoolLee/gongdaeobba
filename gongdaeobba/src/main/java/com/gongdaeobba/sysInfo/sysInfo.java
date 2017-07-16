package com.gongdaeobba.sysInfo;

public class sysInfo {
	private String bringSysInf () {
		String SysInfo  = System.getProperty("os.name");
		return SysInfo;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sysInfo test = new sysInfo();
		String prtTest = test. bringSysInf();
		System.out.println(prtTest);
	}

}
