package com.hr.minorfullstackjava;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("caps")
public class CapsService {
    public String Caps(String string){
        return string.toUpperCase();
    }
}
