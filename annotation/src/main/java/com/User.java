package com;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class User {

    @Autowired
    Address addr;

    @Override
    public String toString() {
        return "User{" +
                "addr=" + addr.toString() +
                '}';
    }
}
