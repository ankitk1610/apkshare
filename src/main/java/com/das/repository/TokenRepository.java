package com.das.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.das.model.Token;

@Repository
public interface TokenRepository extends CrudRepository<Token, Long>{

	Token findByTokenId(String tokenId) throws Exception;

}
