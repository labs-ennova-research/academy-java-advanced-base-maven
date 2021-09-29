package com.ennova_research.academy.basemaven.example.json;

import java.util.UUID;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;

/**
 * @author Alberto Ielpo
 */
public class UsingJson {

	/**
	 * Create an object node
	 * @return
	 * @throws JsonProcessingException
	 */
	private static ObjectNode createObjectNode() throws JsonProcessingException {
		ObjectMapper mapper = new ObjectMapper();
		ObjectNode user = mapper.createObjectNode();
		user.put("id", (int) Math.floor(Math.random()*10000));
		user.put("uuid", UUID.randomUUID().toString());
	    return user;
	}
	
	/**
	 * Create a node array
	 * @return
	 * @throws JsonProcessingException
	 */
	private static ArrayNode createArrayNode() throws JsonProcessingException {
		ObjectMapper mapper = new ObjectMapper();
		ArrayNode users = mapper.createArrayNode();
		users.add(UsingJson.createObjectNode());
		users.add(UsingJson.createObjectNode());
		return users;
	}
	
	/**
	 * Pretty print a json object
	 * @param value
	 * @return json stringified
	 * @throws JsonProcessingException
	 */
	private static String prettyPrint(Object value) throws JsonProcessingException {
		ObjectMapper mapper = new ObjectMapper();
	    String json = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(value);
	    System.out.println(json);
	    return json;
	}
	
	/**
	 * Parse a json string
	 * @param json
	 * @throws JsonProcessingException
	 */
	private static void parseJson(String json) throws JsonProcessingException {
		ObjectMapper mapper = new ObjectMapper();
		var res = mapper.readValue(json, Object.class);	//define here the output
		System.out.println(res);
	}
	
	public static void main(String[] args) throws JsonProcessingException {
		var a = UsingJson.createObjectNode();
		var b = UsingJson.createArrayNode();
		var j1 = UsingJson.prettyPrint(a);
		UsingJson.parseJson(j1);
		System.out.println("***************");
		var j2 = UsingJson.prettyPrint(b);
		UsingJson.parseJson(j2);
	}
}
