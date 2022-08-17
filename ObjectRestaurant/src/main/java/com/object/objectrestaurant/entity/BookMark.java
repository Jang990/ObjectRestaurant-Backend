package com.object.objectrestaurant.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Data;

@Entity
@Data
public class BookMark {
	/*
	user_id 외래키
	store_id 외래키
	favorite_check int
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long markId;
	
	@ManyToOne(targetEntity = UserInfo.class)
	@JoinColumn(name = "USER_ID")
	private String userId;
	
	@ManyToOne(targetEntity = Store.class)
	@JoinColumn(name = "STORE_ID")
	private Long storeId;
	
	private int favoriteCheck;
}