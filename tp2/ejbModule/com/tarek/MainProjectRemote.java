package com.tarek;


import javax.ejb.Remote;


@Remote
public interface MainProjectRemote {
	public String helloWorld();

}
