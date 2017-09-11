package com.ajaes.gongdaeobba.controller;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import java.net.URLConnection;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DownloadAndExec
 */
@WebServlet("/DownloadAndExec.do")
public class DownloadAndExecController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DownloadAndExecController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		processRequest(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		processRequest(request,response);
	}
	
	
	protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		
		String type = request.getParameter("action");
		String[] arr= new String[2];
		if(type.equals("downnexec")) {
			
			if(download()==true) {
				exec();
				arr = read();
			} else {
				System.out.println("Fail");
				arr[0] = "";
				arr[1] = "";
			}
			

			//System.out.println("!!!!!!!!!!!!!!!!");
			
		}

		request.setAttribute("cpu", arr[0]);
		request.setAttribute("graphic", arr[1]);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("/print.jsp");
		dispatcher.forward(request, response);
	}
	
	private boolean download() {
		
		OutputStream outStream = null;
		InputStream is=null;
		try {
			String filePath = "http://localhost:8080/gongdaeobba_2/program/";
			String fileName="hardware.exe";
			URL url = new URL(filePath+fileName);
			outStream = new BufferedOutputStream(new FileOutputStream("D:/"+fileName));
			URLConnection uCon = url.openConnection();
			is = uCon.getInputStream();
			byte[] buf = new byte[1024];
			int byteRead;
			int byteWritten=0;
			while((byteRead = is.read(buf))!=-1) {
				outStream.write(buf, 0, byteRead);
				byteWritten+=byteRead;
			}
			is.close();
			outStream.close();
			
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			
		} 
		
		return false;

	}
	
	private void exec() {
		
		Runtime rt = Runtime.getRuntime();
		Process p;
		String filePath="D:/hardware.exe";
		
		try{
			p = rt.exec(filePath);
			p.waitFor();
		} catch(Exception e){
			e.printStackTrace();
		}
		
	}


	private String[] read() {
		
		String[] arr = new String[2];
		
		String s="";
		String buffer="";
		try {
			BufferedReader in = new BufferedReader(new FileReader("D:/info.txt"));
			
			while ((s = in.readLine()) != null) {
				buffer=s;
			}
			in.close();
	
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		System.out.println(buffer.substring(0, buffer.indexOf("Hz")+2));
		System.out.println(buffer.substring(buffer.indexOf("Hz")+2,buffer.length()));
		arr[0] = buffer.substring(0, buffer.indexOf("Hz")+2);
		arr[1] = buffer.substring(buffer.indexOf("Hz")+2,buffer.length());
		
		return arr;
		
	}

	

}
