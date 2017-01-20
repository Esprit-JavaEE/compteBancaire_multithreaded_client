package javaee.ejb.client;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import javaee.ejb.CompteBancaireRemote;

public class MyThread extends Thread {
	
	@Override
	public void run() {
		
		try {
			String jndiName="ejb_stateless_stateful/CompteBancaire!javaee.ejb.CompteBancaireRemote";
			Context context = new InitialContext();
			CompteBancaireRemote proxy=(CompteBancaireRemote) context.lookup(jndiName);
			System.out.println(proxy.versement("WalidYAICH", 100));
			System.out.println(proxy.versement("Mariem", 20));
			System.out.println(proxy.versement("Tasnim", 20));
			System.out.println(proxy.versement("Mohamed", 20));

			
		} catch (NamingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}