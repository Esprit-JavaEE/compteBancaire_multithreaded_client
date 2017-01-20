package javaee.ejb.client;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import javaee.ejb.CompteBancaireRemote;

public class CallRemoteEJB {

	public static void main(String[] args) throws NamingException {

		String jndiName="ejb_stateless_stateful/CompteBancaire!javaee.ejb.CompteBancaireRemote";
		Context context = new InitialContext();
		CompteBancaireRemote proxy=(CompteBancaireRemote) context.lookup(jndiName);
		System.out.println(proxy.versement("WalidYAICH", 5000));
		System.out.println(proxy.versement("WalidYAICH", 2000));
	}

}
