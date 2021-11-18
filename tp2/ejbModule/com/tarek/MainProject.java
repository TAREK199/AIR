package com.tarek;

import javax.ejb.Stateless;


/**
 * Session Bean implementation class MainProject
 */

@Stateless
public class MainProject implements MainProjectLocal,MainProjectRemote {

	
	@Override
	public String helloWorld() {
		// TODO Auto-generated method stub
		return "Hello World";
	}

}
