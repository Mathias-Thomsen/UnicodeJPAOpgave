package com.example.unicodejpaopgave.RestController;


import com.example.unicodejpaopgave.model.Unicode;
import com.example.unicodejpaopgave.repositories.UnicodeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.HashSet;
import java.util.Set;

@org.springframework.web.bind.annotation.RestController
public class RestController {


    @Autowired
    UnicodeRepository unicodeRepository;



    //Step 2
    @GetMapping("/unicode/{i}")
    public String unicodeToChar(@PathVariable int i) {

        char c = (char)i;
        return "unicode=" + i + " char=" + c;

    }
    //Step 3
    @GetMapping("/CharToUnicode/{i}")
    public String charToUnicode(@PathVariable char i) {
        int c = (int) i;
        return "Char = " + i + " Unicode = " + c;
    }





}
