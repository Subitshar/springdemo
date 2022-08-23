package com.UserSpring.dao;

import java.util.List;


import com.UserSpring.dto.User;

public interface UserDAO {
	public boolean checkLogin(String userName, String userPassword);

}
