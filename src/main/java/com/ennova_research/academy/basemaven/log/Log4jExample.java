package com.ennova_research.academy.basemaven.log;

import org.apache.log4j.Logger;

/**
 * @author Alberto Ielpo
 */
public class Log4jExample {
	final static Logger logger = Logger.getLogger(Log4jExample.class);
	
	public static void main(String[] args) {
		//BasicConfigurator.configure();	//configure using java
		logger.fatal("This is a fatal message");
		logger.error("This is an error message");
		logger.warn("This is a warning message");
		logger.info("This is an info message");
		logger.debug("This is a debug message");
		logger.trace("This is a trace message");
	}
}
