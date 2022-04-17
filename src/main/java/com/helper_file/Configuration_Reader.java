package com.helper_file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Configuration_Reader {
	public static Properties p;
	
	public Configuration_Reader() throws IOException {
		
	File f=new File("C:\\Users\\Abhi\\eclipse-workspace\\Hello World\\Adactin_Project\\src\\main\\java\\com\\helper_file\\Configuration.properties");

	FileInputStream fis=new FileInputStream(f);
	
	p=new Properties();
	p.load(fis);
	}
	
	public String geturl() {
		String url_auto=p.getProperty("url");
		return url_auto;
		
	}
	
	
	
}
