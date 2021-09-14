package com.example.sample.services.base;

import com.example.sample.domains.User;
import com.example.sample.dtos.UserNameDto;
import com.example.sample.repositories.UserRepository;
import com.example.sample.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private User user; //from component

    public User create(){
        User user = new User();
        user.setFirst_name("Sandi");
        user.setLast_Name("Sadali");

        User new_user = userRepository.save(user);
        return new_user;
    }

    public UserNameDto get() {
        System.out.println(user.getFirst_name());
        return userRepository.findUserNameDtoById_Named("a9a4e27e-4c14-4613-ab70-f6d55564614a");//.get();
    }

    public UserNameDto findUserNameById(){
        return userRepository.findUserNameById("a9a4e27e-4c14-4613-ab70-f6d55564614a");
    }


}
