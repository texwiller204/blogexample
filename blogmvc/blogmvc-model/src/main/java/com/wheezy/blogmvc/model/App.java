package com.wheezy.blogmvc.model;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

import com.wheezy.blogmvc.utils.DateUtil;



/**
 * Hello world!
 *
 */
public class App 
{
	
	private static Logger LOGGER2 = Logger.getLogger(App.class);
	private static Logger logger = Logger.getLogger(App.class);
	  
    public static void main( String[] args )
    {
    	DOMConfigurator.configure("log4j.xml");
        logger.info("Test Log");
        System.out.println( "Hello World!" );
        
        LOGGER2.info("Hello World!");
        LOGGER2.info("Hello World! Today is " + DateUtil.getToday());
    }
}
