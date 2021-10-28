package com.ennova_research.academy.basemaven.together;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author Alberto Ielpo
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class TestJson {

	public TestJson() {
		this.data = new Data();
	}
	
	public class Data {
		
		public Data() {}
		
		@JsonProperty(value = "name")
		public Integer name;
		
		@JsonProperty(value = "attr")
		public Boolean attr;
	}

	@JsonProperty(value = "name")
	public String name;
	
	@JsonProperty(value = "surname")
	public String surname;
	
	@JsonProperty(value = "data")
	public Data data;


}
