package com.gongdaeobba.test;

import java.util.ArrayList;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;


public class dbConnectionTest {
	private MongoTemplate mongoTemplate;
	
	public dbConnectionTest () {
		String mongoContextPath = "config/spring/context-mongo.xml";
		AbstractApplicationContext ctx = new ClassPathXmlApplicationContext(mongoContextPath);
		
		mongoTemplate = (MongoTemplate) ctx.getBean("mongoTemplate");
	}
	
	 public static void main(String[] args) {
		 dbConnectionTest mongoTest = new dbConnectionTest();
		 mongoTest.findData();
		 
	 }
	public void findData () {
		Query query = Query.query(Criteria.where("BRAND").is("INTEL"));
		ArrayList<Object> ret  = (ArrayList<Object>) mongoTemplate.find(query, Object.class, "GDOB_CPU_LIST");
		for (int i=0;  i < ret.size(); i++) {
			System.out.println(ret.get(i));
		}
	}
}