package com.hr.minorfullstackjava;

import org.springframework.stereotype.Service;

@Service
public class StringService {
    public String Revert(String string){
        return new StringBuilder(string).reverse().toString();
    }
}
