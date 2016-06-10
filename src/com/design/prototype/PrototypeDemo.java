package com.design.prototype;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class PrototypeDemo{  
    public static void main(String[] args) throws IOException {  
         
       BufferedReader br =new BufferedReader(new InputStreamReader(System.in));  
       System.out.print("Enter Employee Id: ");  
       int eid=Integer.parseInt(br.readLine());  
       System.out.print("\n");  
         
       System.out.print("Enter Employee Name: ");  
       String ename=br.readLine();  
       System.out.print("\n");  
         
       System.out.print("Enter Employee Designation: ");  
       String edesignation=br.readLine();  
       System.out.print("\n");  
         
       System.out.print("Enter Employee Address: ");  
       String eaddress=br.readLine();  
       System.out.print("\n");  
         
       System.out.print("Enter Employee Salary: ");  
       double esalary= Double.parseDouble(br.readLine());  
       System.out.print("\n");  
       Address address = new Address(eaddress);
          
       EmployeeRecord e1=new EmployeeRecord(eid,ename,edesignation,esalary,address);  
         
       e1.showRecord();  
       System.out.println("\n");  
       //deep copy object
       EmployeeRecord e2=(EmployeeRecord) e1.getClone();  
       e2.setSalary(35000);
       e2.getAddress().setCity("pune");
       System.out.println("after change of deep copy clone object");
       e2.showRecord();  
       System.out.println("original obj after change od deep clone object");
       e1.showRecord();
       //shallow copy object
       EmployeeRecord e3=(EmployeeRecord) e1.clone();
       e3.setSalary(40000);
       e3.getAddress().setCity("chennai");
     
       System.out.println("original obj after change in shallow clone object");
       e1.showRecord();
       System.out.println("shallow copy after change clone object");
       e3.showRecord();
   }     
}
