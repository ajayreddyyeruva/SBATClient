package com.sandy.sbat;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class SBATFileExecutorClient {
    
	public static void main(String[] args) {
		SBATExecutor sbatExecutor = new SBATExecutor();
		File file = new File(System.getProperty("user.dir")+"/src/main/resources/simpleFlow");
		InputStream in = null;
        try {
            in = new FileInputStream(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
		sbatExecutor.execute(in);
	}
	
}