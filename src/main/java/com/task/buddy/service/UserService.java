package com.task.buddy.service;

import java.util.List;

import com.task.buddy.model.User;

public interface UserService {
	User createUser(User user);

	User changeRoleToAdmin(User user);

	List<User> findAll();

	User getUserByEmail(String email);

	boolean isUserEmailPresent(String email);

	User getUserById(Long userId);

	void deleteUser(Long id);

	void sendVerificationEmail(User user, String siteURL);

	boolean verify(String encodedId);

	void updatePassword(User user, String newPassword);
}
