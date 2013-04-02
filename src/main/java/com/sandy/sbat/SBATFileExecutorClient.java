package com.sandy.sbat;

import java.io.File;

public class SBATFileExecutorClient {

	public static void main(String[] args) {
		SBATExecutor sbatExecutor = new SBATExecutor();
//		sbatExecutor.execute(new File("src/main/resources/test.txt"));
		sbatExecutor.execute(new File("src/main/resources/fileUpload.txt"));
	}
}