package javaee.ejb.client;

import javax.naming.NamingException;

public class CallRemoteEJB {

	public static void main(String[] args) throws NamingException {

		for (int i = 0; i < 300; i++) {
			StudentsThreads myThread = new StudentsThreads("user"+i);
			myThread.start();
		}
		
	}

}
