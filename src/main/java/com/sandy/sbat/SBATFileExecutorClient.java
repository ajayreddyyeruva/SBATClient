package com.sandy.sbat;

import java.io.File;

public class SBATFileExecutorClient {

	public static void main(String[] args) {
		SBATExecutor sbatExecutor = new SBATExecutor();
		
		sbatExecutor.execute(new File("src/main/resources/sbat_verify_all_links_metafile.txt"));
	}
}
