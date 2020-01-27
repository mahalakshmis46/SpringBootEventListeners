package com.example;

import com.example.controller.UserController;
import com.example.model.User;
import com.example.repository.UserRepository;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@DataJpaTest
public class UserActionControllerTest {

    @Autowired
    private UserRepository userRepository;

    @Test
    public void run() {
    }
}