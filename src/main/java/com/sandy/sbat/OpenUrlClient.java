package com.sandy.sbat;

import com.sandy.sbat.operation.openurl.OpenUrlSBATRequest;

public class OpenUrlClient {

	public static void main(String[] args) {
		OpenUrlSBATRequest openUrlSBATRequest = new OpenUrlSBATRequest();
		openUrlSBATRequest.initialize("http://yahoo.com");
		openUrlSBATRequest.getCommand().execute(openUrlSBATRequest);
	}
}
