package com.ensar.models;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

@Entity
@Table (name = "UserList")
public class UserList {
	
    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String userListId;

    @NotBlank
	//@Column(name = "firstName")
	private String firstName;
    
    @NotBlank
	//@Column(name = "lastName")
	private String lastName;
	
    @NotBlank
	//@Column(name = "emailAdress")
	private String email;
	
    @NotBlank
	//@Column(name = "PhoneNumber")
	private String phoneNumber;
    
	@NotBlank
	private String role;
	
    @NotBlank
    private String joinDate;

	public UserList() {
		super();
	}

	public UserList(String firstName, String lastName, String email, String phoneNumber, String role, String joinDate) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.phoneNumber = phoneNumber;
//		this.country = country;
//		this.state = state;
//		this.city = city;
//		this.address = address;
//		this.zipCode = zipCode;
		this.role = role;
		this.joinDate = joinDate;
//		this.company = company;
	}


//	public Long getUserListId() {
//		return userListId;
//	}
//
//	public void setUserListId(Long userListId) {
//		this.userListId = userListId;
//	}

	
	
	public void setUserListId(String userListId) {
		this.userListId = userListId;
	}
	
	public String getUserListId() {
		return userListId;
	}
	
	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

//	public String getCountry() {
//		return country;
//	}
//
//	public void setCountry(String country) {
//		this.country = country;
//	}
//
//	public String getState() {
//		return state;
//	}
//
//	public void setState(String state) {
//		this.state = state;
//	}
//
//	public String getCity() {
//		return city;
//	}
//
//	public void setCity(String city) {
//		this.city = city;
//	}
//
//	public String getAddress() {
//		return address;
//	}
//
//	public void setAddress(String address) {
//		this.address = address;
//	}
//
//	public String getZipCode() {
//		return zipCode;
//	}
//
//	public void setZipCode(String zipCode) {
//		this.zipCode = zipCode;
//	}

	
	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}


	public String getJoinDate() {
		return joinDate;
	}

	public void setJoinDate(String joinDate) {
		this.joinDate = joinDate;
	}

	@Override
	public String toString() {
		return "UserList [userListId=" + userListId + ", firstName=" + firstName + ", lastName=" + lastName + ", email="
				+ email + ", phoneNumber=" + phoneNumber + ", role=" + role + ", joinDate=" + joinDate + "]";
	}

	
//	public String getCompany() {
//		return company;
//	}
//
//	public void setCompany(String company) {
//		this.company = company;
//	}

//	@Override
//	public String toString() {
//		return "UserList [firstName=" + firstName + lastName =  , email=" + email + ", phoneNumber=" + phoneNumber
//				+ ", country=" + country + ", state=" + state + ", city=" + city + ", address=" + address + ", zipCode="
//				+ zipCode + ", role=" + role + ", company=" + company + "]";
//	}
	
	

}
