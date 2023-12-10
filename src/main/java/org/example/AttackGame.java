package org.example;

public class AttackGame {
    public static void main(String[] args) {
        int[] bandage = {5, 1, 5}; // t시전시간, x 1초마다 회복, y
        int health = 10; //limit HP
        int[][] attacks = {{2, 10}, {9, 15}, {10, 5},{11, 5}}; // 공격시간, 피해량
        int answer = health;
        int bonus = 0;
        // ***체력이 0이 되면 더이상 붕대감기 불가***
        for(int i = 1; i <= attacks[attacks.length-1][0]; i++) { // 11초 동안 돌아감
            for(int j = 0; j < attacks.length; j++) {
                if(i == attacks[j][0]) {
                    if(answer > 0) {
                        answer -= attacks[j][1];
                    } else if (answer <= 0) {
                        answer = -1;
                    }
                }
            }
        }

    }



}
