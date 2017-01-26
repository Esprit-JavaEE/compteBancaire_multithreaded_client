package javaee.ejb.client;

import javax.naming.NamingException;


/**
 * 
 * @author Walid-YAICH
 * 
 * Cette classe crée des threads qui attaquent le serveur en parallele, c'est comme si plusieurs users utilisent
 * le projet serveur en parallele.
 * 
 */
public class CallRemoteEJB {

	public static void main(String[] args) throws NamingException, InterruptedException {

		for (int index = 0; index < 20; index++) {
			StudentsThreads myThread = new StudentsThreads("user"+index);
			//Thread.sleep(500);
			myThread.start();
		}
		
	}

}
