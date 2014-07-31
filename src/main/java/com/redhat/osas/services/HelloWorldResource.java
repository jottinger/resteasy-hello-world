package com.redhat.osas.services;

import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("helloworld")
public class HelloWorldResource {

	@GET()
	@Produces("application/json")
	@Path("say")
	public String sayHello() {
	    return "Hello World!";
	}
}
