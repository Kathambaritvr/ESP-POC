package com.amaryllis.esp.user;


public interface UserService {
  
 public User findUserByEmail(String email);
 
 public void saveUser(User user);
}