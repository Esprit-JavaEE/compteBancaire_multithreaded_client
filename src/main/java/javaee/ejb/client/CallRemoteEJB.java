package javaee.ejb.client;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import javaee.ejb.CompteBancaireRemote;


public class CallRemoteEJB {

	public static void main(String[] args) throws NamingException {

		for (int i = 0; i < 10; i++) {
			MyThread myThread = new MyThread();
			myThread.start();
		}
		
	}

}
