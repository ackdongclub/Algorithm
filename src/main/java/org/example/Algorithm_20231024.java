package org.example;

import java.util.Arrays;

public class Algorithm_20231024 {
    public static void main(String[] args) {
        String[] players = {"mumu", "soe", "poe", "kai", "mine"};
        String[] callings = {"kai", "kai", "mine", "mine"};
        String name = "";

        for(int i = 0; i < callings.length; i++) {
            for(int j = 0; j < players.length; j++) {
                if(callings[i].equals(players[j])) {
                    name = players[j-1];
                    players[j-1] = players[j];
                    players[j] = name;
                }
            }

        }

        System.out.println(Arrays.toString(players));
    }
}
