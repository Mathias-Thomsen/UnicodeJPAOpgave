package com.example.unicodejpaopgave.config;


import com.example.unicodejpaopgave.model.Unicode;
import com.example.unicodejpaopgave.repositories.UnicodeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.HashSet;
import java.util.Set;

@Component
public class initData implements CommandLineRunner {

    @Autowired
    private UnicodeRepository unicodeRepository;

    @Override
    public void run(String... args) throws Exception {
        for (int unicodeValue = Character.MIN_CODE_POINT; unicodeValue <= Character.MAX_CODE_POINT; unicodeValue++) {
            char character = (char) unicodeValue;
            Unicode unicode = new Unicode();
            unicode.setUnicode(unicodeValue);
            unicode.setBogstav(character);
            unicode.setDescription(Character.getName(unicodeValue));
            unicodeRepository.save(unicode);
        }
    }
}

