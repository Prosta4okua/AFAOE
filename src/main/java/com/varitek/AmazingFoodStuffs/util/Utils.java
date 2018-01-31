package com.varitek.AmazingFoodStuffs.util;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import com.varitek.AmazingFoodStuffs.Reference;

public class Utils {
	
	private static Logger logger;
	
	public static Logger getLogger() {
		
		if(logger == null) {
			logger = LogManager.getFormatterLogger(Reference.MOD_ID);
		}
		return logger;
	}

}
