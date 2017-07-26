package com.web.services.customer;

import java.util.HashMap;
import java.util.Map;

import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/customer")
public class Customer {
	private static Map<Integer, String> customerMap = new HashMap<Integer, String>(); 
	private static int index;
	
	public Customer(String name){
		customerMap.put(++index, name);		
	}

	@PUT
	@Produces(MediaType.TEXT_HTML)
	public void add(@PathParam("name") String name){
		customerMap.put(++index, name);		
	}

	public String get(int index){
		return customerMap.get(index);
	}
}
