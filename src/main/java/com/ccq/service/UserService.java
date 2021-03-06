package com.ccq.service;

import com.ccq.pojo.User;

/**
 * @author ccq
 * @Description
 * @date 2017/11/28 22:11
 */
public interface UserService {

    User getUserById(String userid);

    int updateUser(User user);

    User getUserByUserId(String userid);
}
