package com.hr.minorfullstackjava;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StringController {
    @RequestMapping("/revert/{string}")
    public String RevertString(@PathVariable("string") String string){
        return new StringBuilder(string).reverse().toString();
    }
}
