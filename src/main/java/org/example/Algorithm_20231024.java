package org.example;

import java.util.Arrays;

public class Algorithm_20231024 {
    public static void main(String[] args) {
        System.out.println(match(4, 3));
    }

    public static String match(int i, int k) {
        String[] players = {"mumu", "soe", "poe", "kai", "mine"};
        String[] callings = {"kai", "kai", "mine", "mine"};
        String name = "";

        if(players[i - 4] == callings[k - 3]) {
            k += 1;
            System.out.println(i + " " + players[i - 4]);
            name = players[i - 4];
        } else {
            i += 1;
        }

        return name;
    }

}
