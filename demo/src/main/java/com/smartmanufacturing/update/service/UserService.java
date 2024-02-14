package com.smartmanufacturing.update.service;

import com.smartmanufacturing.update.model.RoleName;
import com.smartmanufacturing.update.model.User;
import com.smartmanufacturing.update.repository.RoleRepository;
import com.smartmanufacturing.update.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UserService {
    @Autowired
    private RoleRepository roleRepository;
    @Autowired
    private UserRepository userRepository;

    public List<User> findAllExperts() {

        return userRepository.findByRoles_(roleRepository.findByName(RoleName.ROLE_EXPERT));
    }
}
