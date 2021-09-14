package com.example.sample.services;

import com.example.sample.domains.User;
import com.example.sample.dtos.UserNameDto;

public interface UserService {
    public User create();

    public UserNameDto get();

    public UserNameDto findUserNameById();
}
