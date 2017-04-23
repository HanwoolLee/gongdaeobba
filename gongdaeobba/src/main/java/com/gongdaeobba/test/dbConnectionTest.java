package com.gongdaeobba.test;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.MongoTemplate;

public class dbConnectionTest {
	private MongoTemplate mongoTemplate;
	
	public dbConnectionTest () {
		String mongoContextPath = "config/spring/context-mongo.xml";
		AbstractApplicationContext ctx = new ClassPathXmlApplicationContext(mongoContextPath);
		
		mongoTemplate = (MongoTemplate) ctx.getBean("mongoTemplate");
	}
	
	 public static void main(String[] args) {
		 dbConnectionTest mongoTest = new dbConnectionTest();
		 System.out.println(mongoTest.mongoTemplate);
		 mongoTest.insertTestData();
	 }
	private void insertTestData () {
		MongoTestVO testVO = new MongoTestVO();
        testVO.setName("둘리!!");
        testVO.setAddress("고길동 집 1억년전 어딘가...");

        mongoTemplate.insert(testVO, "book");
	}
	
	private class MongoTestVO {
		@Id
		private String id;
		
		private String name;
		private String address;
		
		 public String getId() {
	            return id;
	        }
	 
	        public void setId(String id) {
	            this.id = id;
	        }
	 
	        public String getName() {
	        	return name;
	        }
	 
	        public void setName(String name) {
	            this.name = name;
	        }
	 
	        public String getAddress() {
	            return address;
	        }
	 
	        public void setAddress(String address) {
	            this.address = address;
	        }
	}
}