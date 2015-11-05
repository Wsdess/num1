package models;

import play.modules.mongo.MongoEntity;
import play.modules.mongo.MongoModel;

@MongoEntity
public class Usuario extends MongoModel {
	public String name;
	public String User;
	public int attemps;
        
 
	
}
