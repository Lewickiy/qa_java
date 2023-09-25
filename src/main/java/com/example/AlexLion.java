package com.example;

import java.util.Arrays;
import java.util.List;

public class AlexLion extends Lion{

    public AlexLion() throws Exception {
        super("Самец");
    }

    public List<String> getFriends() {
        return Arrays.asList("Marty the zebra"
                , "Gloria the hippopotamus"
                , "Melman the giraffe"
        );
    }

    public String getPlaceOfLiving() {
        return "Central Park Zoo";
    }

    @Override
    public int getKittens() {
        return 0;
    }
}
