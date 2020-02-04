package com.sb.app.userprofile.entity;

import java.time.OffsetDateTime;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class User {
	@Id
	@GeneratedValue
	private Long id;
	private String name;
	private Date dob;
	private Character isActive;
	private Long phoneNumber;
	private String email;
	private String address;
	private String city;
	private Integer pincode;
	private String addInfo;
	private OffsetDateTime updatedDate;
	
}
