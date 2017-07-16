package com.gongdaeobba.service;
import com.gongdaeobba.dao.cpu;
import com.gongdaeobba.dao.mainboard;
import com.gongdaeobba.dao.ram;


public class mainCombProcess {
	private String str;
	public  String combinations (cpu cpu, mainboard mb, ram ram) {
		// �����纰 ���� ���μ���
		if (!conformityEstimate(cpu.chipset, mb.chipsetCpu)) { str = "cpu�� ���κ��尣�� ȣȯ�� ���� �ʴ� �����Դϴ�.";  
			if (!chooseRam(cpu.supprot_ddr, mb.memoryCase, ram.spec)) {str = "cpu�� ���κ��尣�� ȣȯ�� ���� �ʴ� �����Դϴ�."; return str; }
			return str;
		}
		str = "���ռ���";
		printResult (str);
		return str;
	}
	//Ĩ�� ȣȯ ���
	public boolean conformityEstimate (String cpuChipset, String mbChipset)  {
		if (cpuChipset !=  mbChipset) { System.out.println("Ĩ���� ȣȯ���� �ʴ� �����Դϴ�."); return false;}
		return true;
	}
	public boolean chooseRam (String cpuRam, String mbRam, String cRam) {
		if (cpuRam!=mbRam) {System.out.println("cpu�� ���κ����� ���� ȣȯ���� ���� �����Դϴ�.") ;return false;}
		else if (cpuRam!=cRam) {System.out.println("cpu�� ������ ���� ȣȯ���� ���� �����Դϴ�.") ;return false;}
		else if (cRam!=mbRam) {System.out.println("������ ���� ���κ����� ���� ȣȯ���� ���� �����Դϴ�.") ;return false;}
		return false;
	}
	public void printResult (String str) {
		System.out.println(str);
	}
}
