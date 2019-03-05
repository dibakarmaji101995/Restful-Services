package com.nt.domain;

import javax.xml.bind.annotation.XmlRootElement;

import lombok.Data;

@Data
@XmlRootElement(name="emp")
public class Employee {
     private int empNo;
     private String empName;
     private String desg;
     private float salary;
}
