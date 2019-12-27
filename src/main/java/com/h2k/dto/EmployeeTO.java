package com.h2k.dto;

import java.io.Serializable;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("Employee")
public class EmployeeTO implements Serializable {
	
	public EmployeeTO() {
		// TODO Auto-generated constructor stub
	}
	
	@XStreamAlias("EmployeeNumber")
	private int empNumber;
	@XStreamAlias("FirstName")
	private String firstName;
	@XStreamAlias("LastName")
	private String lastName;
	@XStreamAlias("Address")
	private String address;
	@XStreamAlias("Desgination")
	private String desgination;
	/**
	 * @return the empNumber
	 */
	public int getEmpNumber() {
		return empNumber;
	}
	/**
	 * @param empNumber the empNumber to set
	 */
	public void setEmpNumber(int empNumber) {
		this.empNumber = empNumber;
	}
	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}
	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}
	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}
	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}
	/**
	 * @return the desgination
	 */
	public String getDesgination() {
		return desgination;
	}
	/**
	 * @param desgination the desgination to set
	 */
	public void setDesgination(String desgination) {
		this.desgination = desgination;
	}

}
