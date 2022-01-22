package com.propel.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.propel.app.model.Login;
import com.propel.app.repository.ILoginRepository;
@Service
public class LoginServiceImpl implements ILoginService {
	
	@Autowired
	private ILoginRepository loginRepository;

	@Override
	public List<Login> getAllUsers() {
		return (List<Login>) loginRepository.findAll();
	}

	@Override
	public Optional<Login> getUserById(Integer id) {
		return loginRepository.findById(id);
	}

	@Override
	public void addUser(Login user) {
		loginRepository.save(user);

	}

	@Override
	public void updateUser(Login user) {
		loginRepository.save(user);

	}

	@Override
	public void deleteUser(Integer id) {
		loginRepository.deleteById(id);

	}

	@Override
	public Login getUserByUserNameAndPassword(String username, String password) {
		return loginRepository.findByUsernameAndPassword(username, password);
	}

}
