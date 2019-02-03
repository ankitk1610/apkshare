package com.das.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.das.model.Token;
import com.das.repository.TokenRepository;

import javassist.NotFoundException;

@RestController
public class TokenController {

	@Autowired
	TokenRepository tokenRepo;
	
	@RequestMapping(value = "getbyid" , method = RequestMethod.GET)
	public Token getByTokenId(@RequestParam(value = "tokenid") String tokenId) throws Exception {
		
			Token token = tokenRepo.findByTokenId(tokenId);
			if(null != token)
			return token ;
			// TODO Auto-generated catch block
			else
			throw new NotFoundException("Token Id not Found");
		
	}
	
	@RequestMapping(value = "save" , method = RequestMethod.POST,consumes = MediaType.APPLICATION_JSON_VALUE)
	public Token saveToken(@RequestBody Token token) { 
		System.out.println("SAVE : API hit");
	return tokenRepo.save(token);	
	}
		
	

	@RequestMapping(value = "test" , method = RequestMethod.GET)
	public String test() {
		return "test";
		
	}
	
}

