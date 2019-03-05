package com.nt.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import com.nt.domain.Employee;

@Path("/emp")
public class EmpResource {
	@GET
	@Produces(value= {"application/xml","application/json"})
	@Path("{empNo}")
     public Employee getEmpDetailsById(@PathParam(value = "empNo") String empNo) {
		System.out.println("Path Parameter value::"+empNo);
    	 Employee emp=null;
    	 //create Employee class object
    	 emp=new Employee();
    	 //set value to emp object fields
    	 emp.setEmpNo(100);
    	 emp.setEmpName("raja");
    	 emp.setDesg("Java Developer");
    	 emp.setSalary(100000);
    	 return emp;
     }//method
}//class
