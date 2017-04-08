package com.gongdaeobba.crawling;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class Crawling {

	public static void main(String[] args) {
		

		String articleURL = "http://shopping.naver.com/search/category.nhn?cat_id=50000089";   //�Ź���� URL
        Document doc;
        String str=null;
		try {
			doc = Jsoup.connect(articleURL).get();
			Elements ele = doc.select("a.tit");          // ���̵� _article�� div �±� ����
			System.out.println(ele.text());
			
			//str = ele.select("div.goods_info_wrap").select("div.table_css_t2").select("div.table_cell").text();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}     // document ��ü ����.

	}

}
