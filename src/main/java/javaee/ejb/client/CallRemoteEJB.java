package javaee.ejb.client;

import javax.naming.NamingException;


/**
 * 
 * @author Walid-YAICH
 * 
 * Cette classe crée N threads qui attaquent le serveur en parallele, c'est comme si plusieurs users utilisent
 * le projet serveur en parallele.
 * 
 * 
 */
public class CallRemoteEJB {

	public static void main(String[] args) throws NamingException, InterruptedException {
		int nb_threads = 5;
		for (int index = 0; index < nb_threads; index++) {
			StudentsThreads myThread = new StudentsThreads("user"+index);
			//Thread.sleep(500);
			myThread.start();
		}
		
	}

}
