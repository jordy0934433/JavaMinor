package com.hr.minorfullstackjava;

import org.springframework.stereotype.Service;

@Service
public class StringService {
    public String Revert(String string){
        return new StringBuilder(string).reverse().toString();
    }

    public int Count(String text){
        if (text == null || text.isEmpty()) {
            return 0;
        }

        String[] words = text.split("\\s+");
        return words.length;
    }
}
