package com.nt.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;


@Path("/welcome")
public class WishMessageGeneratorResource {
	public WishMessageGeneratorResource() {
		System.out.println("WishMessageGeneratorResource.WishMessageGeneratorResource()");
	}
	
	//http://localhost:3030/JAX-RS-RESFUL-APP/rest/welcome
	@GET
    public String wishMessageGenerate() {
    	return "Welcome to Restful services.....!!!!";
    }//method
}//class
