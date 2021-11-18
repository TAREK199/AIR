package com.client;

import java.util.Properties;

import javax.naming.Context;
import javax.naming.InitialContext;

import com.tarek.MainProjectRemote;

public class Client {
	
	
	 
	public static void main(String args []) {
		try {
			
			Properties p = new Properties();
			p.put(Context.INITIAL_CONTEXT_FACTORY,"org.jnp.interfaces.NamingContextFactory");
			p.put(Context.PROVIDER_URL, "localhost:9990");
			p.put(Context.URL_PKG_PREFIXES,"org.jboss.naming:org.jnp.interfaces");

			InitialContext ctx = new InitialContext(p);
			
			MainProjectRemote helloWorldRemote = (MainProjectRemote) ctx.lookup("MainProject/remote");
			
			System.out.println(helloWorldRemote.helloWorld());
	 
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	

}
