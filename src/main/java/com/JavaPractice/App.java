package com.JavaPractice;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
/**
 * Hello world!
 *
 */
public class App 
{
	private static final Logger LOG=LogManager.getLogger(App.class);
    public static void main( String[] args )
    {
    	String message="Hello,World";
    	LOG.debug(message + "Will Be Printed on Debug");
    	LOG.info(message + "Will Be Printed on Info");
    	LOG.warn(message + "Will Be Printed on Warn");
    	LOG.error(message + "Will Be Printed on Error");
    	LOG.fatal(message + "Will Be Printed on Fatal");
        LOG.info("Appending string: {}.",message);
    	System.out.println(message);
    }
}
