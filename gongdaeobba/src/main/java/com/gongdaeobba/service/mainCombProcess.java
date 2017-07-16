package com.gongdaeobba.service;
import com.gongdaeobba.dao.cpu;
import com.gongdaeobba.dao.mainboard;
import com.gongdaeobba.dao.ram;


public class mainCombProcess {
	private String str;
	public  String combinations (cpu cpu, mainboard mb, ram ram) {
		// 제조사별 조립 프로세스
		if (!conformityEstimate(cpu.chipset, mb.chipsetCpu)) { str = "cpu와 메인보드간의 호환이 되지 않는 조합입니다.";  
			if (!chooseRam(cpu.supprot_ddr, mb.memoryCase, ram.spec)) {str = "cpu와 메인보드간의 호환이 되지 않는 조합입니다."; return str; }
			return str;
		}
		str = "조합성공";
		printResult (str);
		return str;
	}
	//칩셋 호환 결과
	public boolean conformityEstimate (String cpuChipset, String mbChipset)  {
		if (cpuChipset !=  mbChipset) { System.out.println("칩셋이 호환되지 않는 조합입니다."); return false;}
		return true;
	}
	public boolean chooseRam (String cpuRam, String mbRam, String cRam) {
		if (cpuRam!=mbRam) {System.out.println("cpu와 메인보드의 램이 호환되지 않은 조합입니다.") ;return false;}
		else if (cpuRam!=cRam) {System.out.println("cpu와 선택한 램이 호환되지 않은 조합입니다.") ;return false;}
		else if (cRam!=mbRam) {System.out.println("선택한 램과 메인보드의 램이 호환되지 않은 조합입니다.") ;return false;}
		return false;
	}
	public void printResult (String str) {
		System.out.println(str);
	}
}
