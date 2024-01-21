package org.example;

public class Algoritm_20240121 {

    public static void main(String[] args) {
        String board[][] = {{"blue", "red", "orange", "red"}
                           ,{"red", "red", "blue", "orange"}
                           ,{"blue", "orange", "red", "red"}
                           ,{"orange", "orange", "red", "blue"}};
        int h = 0;
        int w = 1;
        int result = 0;
        int i = 0;

        String[] arrColor = new String[4];

        switch (i) {
            case 0 :
                if(h == 0) {
                    arrColor[i] = "";
                } else {
                    arrColor[i] = board[h-1][w];
                }
                i++;
            case 1 :
                if (w == 0) {
                    arrColor[i] = "";
                } else {
                    arrColor[i] = board[h][w-1];
                }
                i++;
            case 2 :
                if (w == board.length-1) {
                    arrColor[i] = "";
                } else {
                    arrColor[i] = board[h][w+1];
                }
                i++;
            case 3 :
                if(h == board.length-1) {
                    arrColor[i] = "";
                } else {
                    arrColor[i] = board[h+1][w];
                }
        }

        for(String color : arrColor) {
            System.out.println(color);
            if(color.equals(board[h][w])) {
                result++;
            }
        }
        System.out.println(result);
    }
}
