package com.sandy.sbat;

import java.util.LinkedList;
import java.util.List;

public class SBATExecutorClient {

	public static void main(String[] args) {
		List<Operation> operations =new LinkedList<Operation>();
		System.out.println("Performing operations");
		operations.add(new Operation("openUrl http://yahoo.com"));
		operations.add(new Operation("openUrl snapdeal.com"));
		operations.add(new Operation("openUrl gmail.com"));
		operations.add(new Operation("openUrl google.com"));
		
		(new SBATExecutor()).execute(operations);
		System.out.println("operations performed");
	}
}
