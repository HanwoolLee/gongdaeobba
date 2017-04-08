package com.gongdaeobba.dao;




import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Controller;
/**
 * Handles requests for the application home page.
 */
@Controller
public class MongoDAO {

	private MongoTemplate mongoTemplate;
	public void setMongoTemplate(MongoTemplate mongoTemplate)	{
		this.mongoTemplate = mongoTemplate;
	}
	
	public void insertTestVO(){
		mongoTemplate.insert("1");
	}
}
