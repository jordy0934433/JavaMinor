package com.hr.minorfullstackjava;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StringController {
    @Autowired
    StringService stringService;

    @RequestMapping("/revert/{string}")
    public String RevertString(@PathVariable("string") String string){
        return stringService.Revert(string);
    }

    @RequestMapping("/count/{string}")
    public int CountWords(@PathVariable("string") String string){
        return stringService.Count(string);
    }
}
