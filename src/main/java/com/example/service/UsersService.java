package com.example.service;

import com.example.entity.Users;

import java.util.HashMap;

/**
 * @author:TTF
 * @date:2020/9/15
 */
public interface UsersService {

    HashMap<String, Object> userLogin(Users users);

}
