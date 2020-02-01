package com.home.training.security;

import java.io.File;
import java.nio.file.Files;
import java.util.Arrays;
import java.util.List;

public class GetSecrets {

	public String GetPassword (String dbName) throws Exception{
		ClassLoader classLoader = new GetSecrets().getClass().getClassLoader();
		File file = new File(classLoader.getResource("application.secrets").getFile());
		String content = new String(Files.readAllBytes(file.toPath()));
		
		List<String> lines   = Arrays.asList(content.split("\\R"));
		String secretLine  = "";
		for(String text:lines) {
			if (text.startsWith(dbName))
			{secretLine = text;}
	    };
		String[] fields1 = secretLine.split("\\.");
		String[] fields2 = fields1[fields1.length-1].split("=");
		
		return fields2[fields2.length-1];
	}
	
}
