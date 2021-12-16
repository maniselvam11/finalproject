package com.payroll.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.regex.Pattern;

import com.payroll.dao.AdminDao;
import com.payroll.dao.EmployeeDao;
import com.payroll.model.Admin;
import com.payroll.model.Employee;

public class OverAll {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
		System.out.println(" Welcome Administrator ");
		System.out.println("1.login\nEnter your choice");
		
		int choice=Integer.parseInt(sc.nextLine());
		int adminChoice=0;
		int empId;
		Admin user=null;
		switch(choice) {
		case 1:
				String emailId=null;
				do {
					System.out.println("Login");
				do
				{
			      System.out.println("enter emailId:");
			emailId=sc.nextLine();
			if(!emailId.matches("[a-z][a-z0-9]+[@][a-z]+[.][a-z]+"))
			{
				System.out.println("email must include upper&special character");
			}
			if(emailId.isEmpty())
			{
				System.out.println("email cant be empty");
			}
			
			}
				while(!emailId.matches("[a-z][a-z0-9]+[@][a-z]+[.][a-z]+")||emailId.isEmpty());
				
			String password=null;
			do
			{
			System.out.println("enter password");
			password=sc.nextLine();
			if(!password.matches("[A-Za-z0-9@#.!&]{8,16}")) 
			{
				System.out.println("password must include 8 or 16 character");
			}
			if(password.isEmpty()) 
			{
				System.out.println("password should be 8 character");
			}
			}
			
		while(!password.matches("[A-Za-z0-9@#.!&]{8,16}")||password.isEmpty());
				
			
			AdminDao userDao=new AdminDao();
			user=userDao.validateAdmin(emailId,password);
			
			if(user!=null) {
			System.out.println("Welcome Admin");
				System.out.println("\n1.Add new employee\n2.Add new Department\n3.Add new grade"
						+ "\n4.Employee grade details\n5.prepare monthly salary\n6.Generate report\nEnter ur choice");
				
				adminChoice=Integer.parseInt(sc.nextLine());
				
			
			}else {
				System.out.println("invalid userName && password");
			}}
				while(user==null);
		
			switch(adminChoice) {
				
				case 1:
					
					
					
					String empName;
					Date empDob = null;
					Date empDoj = null;
					String empAddress;
					String empCity;
					String empPincode;
					String idTemp;
					String tempMobile;
					Long empMobileNo;
					String empState=null;
					String empEmailId;
					long empPanNo;
					String tempPan;
					String tempDob=null;
					String tempDoj=null;
					
				do {
						System.out.println("enter empId");
					 idTemp=sc.nextLine();
						
					if(idTemp.isEmpty()) {
						System.out.println("empId cant be empty");
						
					}
					if(idTemp.matches("[0-9]{3}")) {
						System.out.println("please enter 0-999");
					}
					}
					while(idTemp.matches("[0-9]{3}")||idTemp.isEmpty());
					empId=Integer.parseInt(idTemp);
					do {
					System.out.println("enter empName");
					 empName=sc.nextLine();
					 
					 if(empName.isEmpty()) {
						 System.out.println("empName cant be empty");
					 }
					 if(!empName.matches("[a-zA-z]+")) {
						 System.out.println("empName only contains characters");
					 }
					 }
					 while(empName.isEmpty()||!empName.matches("[a-zA-z]+"));
					 
				
					try {
						do {
							System.out.println("enter EmpDob");
							tempDob=sc.nextLine();
							if(tempDob.isEmpty()) {
								System.out.println("date must be enter");
							}
							if(tempDob.matches("^[0-3]?[0-9]/[0-3]?[0-9]/(?:[0-9]{2})?[0-9]{2}$")) {
								System.out.println("date must be eg 'dd-MM-yyyy'");
							}
						}while(tempDob.isEmpty()||tempDob.matches("^[0-3]?[0-9]/[0-3]?[0-9]/(?:[0-9]{2})?[0-9]{2}$"));
							empDob=sdf.parse(tempDob);
							
							do {
								System.out.println("enter EmpDoj");
								tempDoj=sc.nextLine();
								if(tempDoj.isEmpty()) {
									System.out.println("date must be enter");
								}
								if(tempDoj.matches("^[0-3]?[0-9]/[0-3]?[0-9]/(?:[0-9]{2})?[0-9]{2}$")) {
									System.out.println("date must be eg 'dd-mm'yyyy'");
								}
								
								
							}while(tempDoj.isEmpty()||tempDoj.matches("^[0-3]?[0-9]/[0-3]?[0-9]/(?:[0-9]{2})?[0-9]{2}$"));
							empDoj=sdf.parse(tempDoj);
							}
						
					
					catch (ParseException e){
						
						e.printStackTrace();
					}
					do {
						System.out.println("enter empAddress");
						empAddress=sc.nextLine();
						if(empAddress.isEmpty()) {
							System.out.println("Address cant be empty");
							
						}
						if(!empAddress.matches("[a-zA-z0-9/,]+")) {
							System.out.println("Address cant matches the format");
							
						}
					}while(empAddress.isEmpty()||!empAddress.matches("[a-zA-z0-9/,]+"));
					do {
						System.out.println("enter empCity");
						 empCity=sc.nextLine();
					
					if(empCity.isEmpty()) {
						System.out.println("city cant be empty");
						}
					if(!empCity.matches("[a-zA-z]+")) {
						System.out.println("city name only contains characters");
					}
					
					}while(empCity.isEmpty()||!empCity.matches("[a-zA-z]+"));
					
					do {
						System.out.println("enter empPincode");
						empPincode=sc.nextLine();

						if(!empPincode.matches("[0-9]+{8}")) {
							System.out.println("pincode max 8 character only");
						}
						if(empPincode.isEmpty()) {
							System.out.println("pincode cant be empty");
							}
						
						}while(empCity.isEmpty()||!empPincode.matches("[0-9]+{8}"));
						
					
					do {
						System.out.println("enter empMobileNo");
						tempMobile=sc.nextLine();
						if(tempMobile.isEmpty()) {
							System.out.println("mobileNo cant be empty");
						}
						if(!tempMobile.matches("[0-9]{10}")) {
							System.out.println("mobileNo must be 10 numbers");
						}
						
					}while(tempMobile.isEmpty()||!tempMobile.matches("[0-9]{10}"));
					empMobileNo=Long.parseLong(tempMobile);
					do {
						System.out.println("enter empState");
						empState=sc.nextLine();
					if(empState.isEmpty()) {
						System.out.println("state is cant be empty");
					}
					if(!empState.matches("[a-zA-z]+")) {
						System.out.println("state only contains characters");
					}
					}while(empState.isEmpty()||!empState.matches("[a-zA-z]+"));
					
					do
					{
				      System.out.println("enter emailId:");
				      empEmailId=sc.nextLine();
				if(!empEmailId.matches("[a-z][a-z0-9]+[@][a-z]+[.][a-z]+"))
				{
					System.out.println("email must include upper&special character");
				}
				if(empEmailId.isEmpty())
				{
					System.out.println("email cant be empty");
				}
				
				}while(!empEmailId.matches("[a-z][a-z0-9]+[@][a-z]+[.][a-z]+")||empEmailId.isEmpty());
					
					do {
						System.out.println("enter panNumber");
						tempPan=sc.nextLine();
						if(tempPan.isEmpty()) {
							System.out.println("panNumber cant be empty");
						}
						if(!tempPan.matches("[0-9]+{12}")) {
							System.out.println("panNumber only 12 characters");
						}
						
					}while(tempPan.isEmpty()||!tempPan.matches("[0-9]+{12}"));
					empPanNo=Long.parseLong(tempPan);
					
					Employee emp=new Employee(empId,empName,empDob,empDoj,empAddress,empCity,empPincode,empMobileNo,empState,empEmailId,empPanNo);
					EmployeeDao empDao=new EmployeeDao();
					empDao.insertEmp(emp);    
					break;
					
				case 2:
					String deptName=null;
					int deptId=0;
					String tempDeptId;
					do {
						System.out.println("Enter the department Name:");
						deptName=sc.nextLine();
						if(deptName.isEmpty()) {
							System.out.println("Department name must include");
						}
						if(!deptName.matches("[a-zA-z]+")) {
							System.out.println("Department name only contains characters");
						}
					}while(!deptName.matches("[a-zA-z]+")||deptName.isEmpty());
					do {
						System.out.println("Enter the department Id");
						tempDeptId=sc.nextLine();
						if(!tempDeptId.matches("[0-1]{2}")) {
							System.out.println("Department enter id only 0-99");
						}
						if(tempDeptId.isEmpty()) {
							System.out.println("Department enter id not empty");
						}
					}while(!tempDeptId.matches("[0-1]{2}")||tempDeptId.isEmpty());
					
					
				default :
					System.out.println("enter the valid choice");
					System.exit(0);
			}
			break;
					
				}
		
			
			}}
			
			
		
			
	
	

		
	
			
			
			


