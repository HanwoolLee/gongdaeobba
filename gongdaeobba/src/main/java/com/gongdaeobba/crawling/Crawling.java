package com.gongdaeobba.crawling;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class Crawling {

	public static void main(String[] args) {
	
		String articleURL = "http://prod.danawa.com/info/?pcode=4576834&cate=112753";   //신문기사 URL
		Document doc;
		String str=null;
		try {
			doc = Jsoup.connect(articleURL).get();
			Elements ele = doc.select("div");          // 아이디가 _article인 div 태그 선택
			Object[] list = ele.toArray();
			for	(int i=0;i<list.length;i++)	{
				String t = list[i].toString();
				String a = t.substring(t.indexOf("\">")+2, t.indexOf("</div>"));
				System.out.println(a);
			}
			System.out.println(ele.text());
			
			//str = ele.select("div.goods_info_wrap").select("div.table_css_t2").select("div.table_cell").text();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}     // document 객체 생성.
	}
}
