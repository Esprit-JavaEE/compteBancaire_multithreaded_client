package javaee.ejb.client;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import javaee.ejb.CompteBancaireRemote;

public class StudentsThreads extends Thread {
	
	private String studentName;
	
	public StudentsThreads(String studentName) {
		this.studentName = studentName;
	}
	
	@Override
	public void run() {
		
		try {
			String jndiName="ejb_stateless_stateful/CompteBancaire!javaee.ejb.CompteBancaireRemote";
			Context context = new InitialContext();
			CompteBancaireRemote proxy=(CompteBancaireRemote) context.lookup(jndiName);
			System.out.println(proxy.versement(studentName, 100));
			System.out.println(proxy.versement(studentName, 50));
			System.out.println(proxy.versement(studentName, 20));
			System.out.println(proxy.retrait(studentName, 170));



			
		} catch (NamingException e) {
			e.printStackTrace();
		}
		
	}

}