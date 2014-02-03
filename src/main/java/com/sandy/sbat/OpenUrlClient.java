package com.sandy.sbat;

import com.sandy.sbat.common.WebDriverExecutor;
import com.sandy.sbat.operation.initialization.InitializationSBATRequest;
import com.sandy.sbat.operation.openurl.OpenUrlSBATRequest;

public class OpenUrlClient {

	public static void main(String[] args) {
		InitializationSBATRequest initializationSBATRequest = new InitializationSBATRequest();
		initializationSBATRequest.initialize("firefox linux");
		initializationSBATRequest.getCommand().execute(initializationSBATRequest);
		
		OpenUrlSBATRequest openUrlSBATRequest = new OpenUrlSBATRequest();
		openUrlSBATRequest.initialize("http://yahoo.com");
		openUrlSBATRequest.getCommand().execute(openUrlSBATRequest);
		
		WebDriverExecutor.SINGLETON.getWebDriver().quit();
	}
}
