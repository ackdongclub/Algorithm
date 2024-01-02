package org.example;

public class AttackGame {
    public static void main(String[] args) {
        int[] bandage = {3, 2, 7}; // t시전시간, x 1초마다 회복, y
        int health = 20; //limit HP
        int[][] attacks = {{1, 15}, {5, 16}, {8, 6}}; // 공격시간, 피해량
        int answer = health;
        int bonus = 0;
        boolean attackYn = false;

        for(int i = 1; i <= attacks[attacks.length-1][0]; i++) {
            bonus++;
            attackYn = false;

            //11초
            //생명 깍이는 조건
            for(int j = 0; j < attacks.length; j++) {
                //공격 시간이 되면 공격
                if(i == attacks[j][0]) {
                    attackYn = true;
                    if(attackYn == true) {
                        bonus = 0;
                        if (answer <= 0) {
                            System.out.println("캐릭터 사망 : " + -1);
                            answer = -1;
                        } else {
                            answer -= attacks[j][1];
                            System.out.println(i + " - " + " -" + attacks[j][1] + " = " + answer);
                        }
                    }
                }
            }

            //생명 회복 조건
            if(attackYn == false) {
                if(answer == health) {
                    answer = health; //최대 생명을 넘을 수 없음
                    System.out.println(i + " - " + answer);
                } else if (answer <= 0) {
                    answer = 0;
                } else {
                    answer += bandage[1];
                    System.out.println(i + " - " + " +" + bandage[1] + " = " + answer);

                    if(bonus == bandage[0]) {
                        bonus = 0;
                        answer += bandage[2];
                        if(answer == health) {
                            answer = health; //최대 생명을 넘을 수 없음
                        }
                        System.out.println( " bonus : " + i + " - " + " +" + bandage[1] + " = " + answer);
                    }
                }
            }
        }

        if(answer <= 0) {
            answer = -1;
        }
        System.out.println("생명 : " + answer);
    }

}
