package org.example;

import java.lang.reflect.Array;
import java.util.Arrays;

public class AttackGame {
    public static void main(String[] args) {
        int[] bandage = {1, 1, 1}; // t시전시간, x, y
        int health = 5; //limit HP
        int[][] attack = {{1, 2}, {3, 2}}; // 공격시간, 피해량
        boolean attacks = false; // 공격당했냐 안당했냐
        int realH = health;
        int a = 0;

        for(int i = 0; i <= attack[attack.length-1][0]; i++) {
            ++a;
            attacks = false;
            System.out.println( i + "-  " + realH + "  -" + attacks);

            for(int j = 0; j < attack.length; j++) {
                if(attack[j][0] == i) {
                    a = 0;
                    attacks = true;
                    realH -= attack[j][1];
                    System.out.println( i + "-  " + realH + "  -" + attacks);
                }
            }

            if(health > realH && attacks == false) {
                realH += bandage[1] ;
                if(a % bandage[0] == 0 && a != 0) {
                    realH += bandage[2];
                    System.out.println( i + "-  " + realH + " +bonus");
                }
            }


        }
        System.out.println(realH);

    }



}
