package com.hr.minorfullstackjava;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Profile("prod")
public class CapsController {
    @Autowired
    CapsService capsService;

    @RequestMapping("/caps/{string}")
    public String RevertString(@PathVariable("string") String string){
        return capsService.Caps(string);
    }
}
