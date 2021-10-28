package com.ennova_research.academy.basemaven.log;

import org.apache.log4j.Logger;

public class Bean {

	final static Logger logger = Logger.getLogger(Bean.class);
	
	public void getBean() {
		logger.info("get bean...");
	}
}
