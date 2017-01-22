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
			//Deux executions signifie 2 clients differents !
			String jndiName="ejb_stateless_stateful/CompteBancaire!javaee.ejb.CompteBancaireRemote";
			Context context = new InitialContext();
			CompteBancaireRemote proxy=(CompteBancaireRemote) context.lookup(jndiName);
			System.out.println("appel 1 : " + proxy.versement(studentName, 20)); //Le client demande un versement
			System.out.println("appel 2 : " +proxy.retrait(studentName, 10));    //Le client demande un retrait
			System.out.println("appel 3 : " +proxy.versement(studentName, 10));  //Le client demande un versement
			System.out.println("appel 4 : " +proxy.retrait(studentName, 10));    //Le client demande un retrait
			//Solde finale = 10
			
		} catch (NamingException e) {
			e.printStackTrace();
		}
		
	}

}