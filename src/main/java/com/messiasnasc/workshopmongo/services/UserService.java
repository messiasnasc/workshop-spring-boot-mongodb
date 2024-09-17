package com.messiasnasc.workshopmongo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.messiasnasc.workshopmongo.domain.User;
import com.messiasnasc.workshopmongo.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository repo;
	
	public List<User> findAll (){
		return repo.findAll();
	}
}
