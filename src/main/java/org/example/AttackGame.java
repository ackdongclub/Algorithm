package org.example;

public class AttackGame {
    public static void main(String[] args) {
        int[] bandage = {3, 2, 7}; // t시전시간, x 1초마다 회복, y 보너스 점수
        int health = 20; //limit HP
        int[][] attacks = {{1, 15}, {5, 16}, {8, 6}}; // 공격시간, 피해량

        int bonus = 0;
        int answer = health;
        int damage = 0;
        int value = 0;
        boolean attYn = false;

        //attacks의 시간만큼 돌아야 함
        for(int i = 0; i <= attacks[attacks.length-1][0]; i++) {
            System.out.println(i + "회");
            attYn = false;
            bonus++;

            if(answer >= health) answer = health; // max

            for(int j = 0; j < attacks.length; j++) {
               value = attacks[j][0];
                System.out.println("value : " + value + " / j : " + j);
               //공격
               if(i == value && answer > 0) {
                   bonus  = 0; // 공격 받으면 초기화
                   attYn = true;
                   damage = attacks[j][1];
               }
            }

            //반영
            if(attYn == true) {
                System.out.print(answer + " - " + damage + " = ");
                answer -= damage;
                System.out.println(answer + "\n");
            } else if (attYn == false && answer < health && answer > 0) {
                System.out.print(answer + " + " + bandage[1] + " = ");
                answer += bandage[1];
                System.out.println(answer + "\n");
                if(bonus == bandage[0]) {
                    System.out.print(answer + " = ");
                    bonus = 0;
                    answer += bandage[2];
                    System.out.println(answer + " +bonus \n");
                }
            }
            if(answer <= 0) answer = -1; // dead
        }

        System.out.println(answer);
    }

}
