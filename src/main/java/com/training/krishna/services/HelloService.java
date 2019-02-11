package com.training.krishna.services;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;


@Path("/hello")
public class HelloService {
	
	
	@GET
	@Path("{pathParam}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response sayHello(@PathParam("pathParam") String param) {
		
	  String name = "Hello + MR. "+ param;
	  
	  List<String> names= new ArrayList<String>();
	  names.add("Rama");
	  names.add("XYZ");
	  names.add("ABC");
	  
		
	  return Response.status(200).entity(names).build();
		
	}
	@PUT
	@Path("{pathParam}")
	@Consumes
	public Response update(@PathParam("pathParam") String param) {
		
	  String name = "Hello + MR. "+ param;
		
	  return Response.status(200).entity(name).build();
		
	}

}
