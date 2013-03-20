package com.sandy.sbat;

import java.io.File;

public class SBATFileExecutorClient {

	public static void main(String[] args) {
		SBATExecutor sbatExecutor = new SBATExecutor();
		
//		sbatExecutor.execute(new File("src/main/resources/sbat_metafile.txt"));
//		sbatExecutor.execute(new File("src/main/resources/sbat_text_input_metafile.txt"));
//		sbatExecutor.execute(new File("src/main/resources/sbat_element_click_metafile.txt"));
	    sbatExecutor.execute(new File("src/main/resources/sbat_mouse_hover_metafile.txt"));
	}
}
