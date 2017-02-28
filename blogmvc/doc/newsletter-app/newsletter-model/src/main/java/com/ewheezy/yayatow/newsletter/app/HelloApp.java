package com.ewheezy.yayatow.newsletter.app;

import org.apache.log4j.Logger;

import com.ewheezy.yayatow.newsletter.DateUtil;


public class HelloApp {

	private static Logger LOGGER = Logger.getLogger(HelloApp.class);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		 System.out.println("Hello World! Today is " + DateUtil.getToday());
		 
		 LOGGER.info("Hello World!");
		 LOGGER.info("Hello World! Today is " + DateUtil.getToday());
	}

}
