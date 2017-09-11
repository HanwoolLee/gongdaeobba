<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%
	Runtime rt = Runtime.getRuntime();
	Process p;
	String filePath="D:/hardware.exe";
	
	try{
		p = rt.exec(filePath);
		p.waitFor();
	} catch(Exception e){
		e.printStackTrace();
	}

%>