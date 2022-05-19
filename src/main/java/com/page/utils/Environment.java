package com.page.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Environment {
	public static String getAppUrl() throws FileNotFoundException {
		String baseDir = System.getProperty("user.dir");
		System.out.println("Base Dir: " + baseDir);
		FileInputStream fis = new FileInputStream(baseDir + "/src/main/resources/environment.properties");
		Properties prop = new Properties();
		String value = "";
		try {
			prop.load(fis);
			value = prop.getProperty("app_url");
		} catch (IOException e) {
			e.printStackTrace();
		}
		return value;
	}

}
