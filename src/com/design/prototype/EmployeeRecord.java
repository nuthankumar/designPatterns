package com.design.prototype;

class EmployeeRecord implements Prototype, Cloneable {

	private int id;
	private String name, designation;
	private double salary;
	private Address address;

	public EmployeeRecord() {
		System.out.println("   Employee Records of Oracle Corporation ");
		System.out.println("---------------------------------------------");
		System.out.println("Eid" + "\t" + "Ename" + "\t" + "Edesignation"
				+ "\t" + "Esalary" + "\t\t" + "Eaddress");

	}

	public EmployeeRecord(int id, String name, String designation,
			double salary, Address address) {

		this();
		this.id = id;
		this.name = name;
		this.designation = designation;
		this.salary = salary;
		this.address = address;
	}

	public void showRecord() {

		System.out.println(id + "\t" + name + "\t" + designation + "\t"
				+ salary + "\t" + address.getCity());
	}

	@Override
	public Prototype getClone() {
		// deep copy
		return new EmployeeRecord(id, name, designation, salary, new Address(address.getCity()));
	}

	@Override
	public Object clone()  {
		//shallow copy
		Object clone = null;
		try {
			clone = super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return clone;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
}
