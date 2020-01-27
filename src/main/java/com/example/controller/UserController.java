package com.example.controller;

import com.example.model.User;
import com.example.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;



@RestController
public class UserController {

    @Autowired
    private UserRepository userRepository;

    

    @GetMapping("/getUsers")
    public ResponseEntity<Iterable<User>> getUsers() {
        return new ResponseEntity<>(userRepository.findAll(), HttpStatus.OK);
    }

    @PostMapping("/createUser")
    public ResponseEntity<User> save(@RequestBody User user) {
        User userData = userRepository.save(user);
        return new ResponseEntity<User>(userData, HttpStatus.CREATED);
    }
    @DeleteMapping("/deleteUser")
    public ResponseEntity<Void> delete(@PathVariable(value="id") long id) {
        userRepository.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PutMapping("/updateUser")
    public ResponseEntity<User> update(@RequestBody User user) {
        return save(user);
    }
}
