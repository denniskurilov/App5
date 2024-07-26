package com.denniskurilov.app5;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/names")
    public List<String> getNames() {
        return userRepository.findAll().stream()
                .map(Employee::getFirstName)
                .collect(Collectors.toList());
    }
}