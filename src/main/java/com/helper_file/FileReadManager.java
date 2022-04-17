package com.helper_file;

import java.io.IOException;

public class FileReadManager {
	public FileReadManager() {
		

}
	public static FileReadManager getInstance_FRM() {
		FileReadManager helper=new FileReadManager();
		return helper;

	}
	
	public Configuration_Reader getInstance_CR() throws IOException {
	Configuration_Reader reader=new Configuration_Reader();
	return reader;
	
	
	
}}