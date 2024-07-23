package org.example;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class WordSelector {

    public String getWord(String path) throws IOException {
        List<String> words = new ArrayList<String>();
        try{
           words = Files.readAllLines(Paths.get(path))
                   .stream()
                   .filter(c -> c.toCharArray().length > 8)
                   .collect(Collectors.toList());
        }catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
            return "";
        }
        return words.get(new Random().nextInt(words.size()));
    }
}
