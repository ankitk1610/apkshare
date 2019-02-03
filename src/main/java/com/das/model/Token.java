package com.das.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Token {

	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	


	private String tokenId;

	public Token(String tokenId) {
		super();
		this.tokenId = tokenId;
	}

	public Token() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getTokenId() {
		return tokenId;
	}

	public void setTokenId(String tokenId) {
		this.tokenId = tokenId;
	}


	

	
	
}
