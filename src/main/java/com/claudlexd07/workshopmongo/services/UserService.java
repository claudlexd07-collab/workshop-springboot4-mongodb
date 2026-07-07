package com.claudlexd07.workshopmongo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.claudlexd07.workshopmongo.domain.User;
import com.claudlexd07.workshopmongo.repository.UserRepository;
import com.claudlexd07.workshopmongo.services.exception.ObjectNotFoundException;

@Service
public class UserService {

	@Autowired // Instancia um objeto automaticamente
	private UserRepository repo;

	public List<User> findAll() {
		return repo.findAll();
	}

	public User findById(String id) {
		Optional<User> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
	}

}
