package com.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertyUtils {

	public static final String currentDir = System.getProperty("user.dir");
	public static String filePath = currentDir + "/src/main/resources/";
	
	public Properties getProperty(String fileName) throws IOException {
	
		FileInputStream fis = null;
		Properties prop = null;
		
		try {
			fis = new FileInputStream(filePath+fileName);
			prop = new Properties();
			prop.load(fis);
		}
		catch(FileNotFoundException fnfe) {
			fnfe.printStackTrace();
		}
		catch(IOException ioe) {
			ioe.printStackTrace();
		}
		finally {
			fis.close();
		}
		System.out.println("url is : " + prop.getProperty("url"));
		System.out.println("username is : " + prop.getProperty("username"));
		System.out.println("password is : " + prop.getProperty("password"));
		//System.out.println("product is : " + prop.getProperty("mobile"));
		return prop;
	}
	
}
