package com.wx.uaaservice.dao;



import com.wx.uaaservice.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserDao extends JpaRepository<User, Long> {

	User findByUsername(String username);
}
