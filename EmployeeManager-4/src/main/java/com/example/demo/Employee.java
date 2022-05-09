package com.example.demo;


import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee {
	@Override
	public String toString() {
		return "Employee1 [EmpNo=" + EmpNo + ", Ename=" + Ename + ", Gender=" + Gender + ", salary=" + salary
				+ ", city=" + city + ", Mobilenumber=" + Mobilenumber + "]";
	}
	@Id
private int EmpNo;
	private String Ename;
	private String Gender;
	private double salary;
	private String city;
	private Long Mobilenumber;
	public int getEmpNo() {
		return EmpNo;
	}
	public void setEmpNo(int empNo) {
		EmpNo = empNo;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getEname() {
		return Ename;
	}
	public void setEname(String ename) {
		Ename = ename;
	}
	public String getGender() {
		return Gender;
	}
	public void setGender(String gender) {
		Gender = gender;
	}
	
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Long getMobilenumber() {
		return Mobilenumber;
	}
	public void setMobilenumber(Long mobilenumber) {
		Mobilenumber = mobilenumber;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}

}