package com.hr.minorfullstackjava;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StringService {
    @Autowired
    private StringRepository stringRepository;

    public String Revert(String string){
        return new StringBuilder(string).reverse().toString();
    }

    public int Count(String text){
        if (text == null || text.isEmpty())
            return 0;
        var inputText = stringRepository.findById(text);
        if (inputText.isPresent())
            return inputText.get().getWords();
        InputText newInputText = new InputText(text);
        stringRepository.save(newInputText);
        return newInputText.getWords();
    }
}
