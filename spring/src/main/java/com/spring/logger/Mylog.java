package com.spring.logger;

import java.util.logging.Level;
import java.util.logging.LogRecord;
import java.util.logging.Logger;

public class Mylog {
public static void main(String[] args) {
	Logger logger = Logger.getLogger(Mylog.class.getName());
	logger.log(Level.INFO,"This is Message1");
	logger.log(Level.WARNING,"This is another Message");
	logger.log(Level.SEVERE, "This is severe Message:{0}", "Pram1");
	logger.log(Level.SEVERE, "This is severe Message:{0} {1}",new Object[] {"Pram1","Pram2"});
	logger.log(Level.SEVERE, "This is severe Message:{0} {1} {2}",new Object[] {"Pram1","Pram2","Pram3"});
    logger.log(Level.SEVERE, "Logging:", new RuntimeException("Error"));
    
    
    LogRecord record = new LogRecord(Level.INFO,"This is an Information");
    logger.log(record);
    
    LogRecord record1 = new LogRecord(Level.INFO,"This is an another Information");
    logger.log(record1);

}
}
