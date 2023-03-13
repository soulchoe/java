package com.obj.model.vo;

public class Employee {
	private String name;
	private int empNo;
	private String department;
	private int salary;
	private double bonus;

	public Employee() {}
	
	public Employee(int empNo,String name,String department,int salary,double bonus) {
		this.name=name;
		this.department=department;
		this.empNo=empNo;
		this.salary=salary;
		this.bonus=bonus;
	}
	public String infoEmp() {
		return this.empNo+" "+this.name+" "+this.department+" "+this.salary+" "+this.bonus;
		
	}
	
	//필드를 조작할 수 있는 setter/getter선언하기
	//name필드
	public void setName(String name) {
		if(name.length()>=2)
			this.name=name;
		
	}
	public String getName() {
		return this.name;
	}
	public int getEmpNo() {
		return this.empNo;//수정되면 안되는 값이기 때문에 무조건 처음 받은 값을 유지하도록
	}
}
