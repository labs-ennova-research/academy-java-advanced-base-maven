package com.ennova_research.academy.basemaven.together;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Base64;
import java.util.Date;
import java.util.Map;

import org.apache.log4j.Logger;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;

/**
 * @author Alberto Ielpo
 */
public class Main {
	
	final static Logger logger = Logger.getLogger(Main.class);
	
	public static void main(String[] args) {
		logger.info(new Date().getTime());
	}
	
	public static void main7(String[] args) {
		ReadService readService = new ReadServiceDatabaseImpl();
		ReadService readService2 = new ReadServiceCloudImpl();
		
		logger.info(readService.getUserId("myId"));
		logger.info(readService2.getUserId("myId"));
	}
	
	public static void main6(String[] args) {
		Quadrilatero quadrato = new Quadrato(10);
		Quadrilatero rettangolo = new Rettangolo(10,15);
		logger.info(quadrato.anglesSum());
		logger.info(rettangolo.anglesSum());
	}
	
	public static void main5(String[] args) {
		String str = "ciao.Come va?";
		String coded = Base64.getEncoder().encodeToString(str.getBytes());
		System.out.println(coded);
		
		byte[] decoded = Base64.getDecoder().decode(coded.getBytes());
		System.out.println(new String(decoded));
	}
	
	public static void main4(String[] args) {
		ObjectMapper mapper = new ObjectMapper();
		ObjectNode user = mapper.createObjectNode();
		ObjectNode data = mapper.createObjectNode();
		data.put("name", 35);
		data.put("attr", true);
		
		user.put("name", "Alberto");
		user.put("surname", "Ielpo");
		user.set("data", data);
		
		try {
			
			Files.write(
					Paths.get("C:/logs/test3.json"), 
					mapper.writerWithDefaultPrettyPrinter().writeValueAsString(user).getBytes());
		
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
	
	
	public static void main3(String[] args) {
		//chiamo database
		TestJson database = new TestJson();
		database.name = "Alberto";
		database.surname = "Ielpo";		
		database.data.name = 35;
		database.data.attr = true;
	
		//chiamata al cliente
		/**
		 * ...
		 */
		
		//il cliente riceve
		ObjectMapper mapper = new ObjectMapper();
		try {
			
			String strDatabase = mapper.writeValueAsString(database);
			Files.write(Paths.get("C:/logs/test2.json"), strDatabase.getBytes());
			System.out.println("writed...");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main2(String[] args) {
		byte[] content;
		try {
			content = Files.readAllBytes(Paths.get("C:/logs/test.json"));
			String strContent = new String(content);
			ObjectMapper mapper = new ObjectMapper();
			Map<String, Object> myObject = mapper.readValue(strContent, Map.class);
			Object data = myObject.get("data");
			
			
			System.out.println(((Map)data).get("attr"));
			
			
			TestJson testJsonObject = mapper.readValue(strContent, TestJson.class);
			
			
			System.out.println(testJsonObject.data.attr);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
