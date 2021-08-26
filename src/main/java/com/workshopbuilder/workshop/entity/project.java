package com.workshopbuilder.workshop.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Getter
@Setter
@Entity
@Table(name="WB_PROJECT")
public class project {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	@Column(name="PROJECT_NAME", length=128)
	private String name;
	
	@Column(name="CREATED_DATE")
	private Date createdDate;
	
	@Column(name="STATUS", length=128)
	private String status;
	
	@Column(name="USER_ID")
	private Long userId;
}
