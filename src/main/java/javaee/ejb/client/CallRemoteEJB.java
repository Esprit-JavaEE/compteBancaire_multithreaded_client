package javaee.ejb.client;

import javax.naming.NamingException;

public class CallRemoteEJB {

	public static void main(String[] args) throws NamingException, InterruptedException {

		for (int index = 0; index < 20; index++) {
			StudentsThreads myThread = new StudentsThreads("user"+index);
			//Thread.sleep(500);
			myThread.start();
		}
		
	}

}
