package com.c0deattack.cu.runners;

import org.springframework.stereotype.Service;

@Service
public class TestService {

    public boolean isValid() {
        System.out.println("service method is called ");
        return true;
    }
}
