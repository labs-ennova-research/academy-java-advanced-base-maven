package com.ennova_research.academy.basemaven.together;

import org.apache.log4j.Logger;

import com.ennova_research.academy.basemaven.log.Bean;

public class Log4jTest {
	
	final static Logger logger = Logger.getLogger(Log4jTest.class);
	
	public static void main(String[] args) {
		
		logger.fatal("Questo è un dramma");
		logger.error("Questo è un errore");
		logger.warn("Questo è un warning");
		logger.info("Questo è info");
		logger.debug("Questo è debug");
		logger.trace("Questo è trace...");
		
		new Bean().getBean();
	}
}
