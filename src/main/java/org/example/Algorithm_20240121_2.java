package org.example;

public class Algorithm_20240121_2 {
    public static void main(String[] args) {
        int[][] data = {{1, 20300104, 100, 80}, {2, 20300804, 847, 37}, {3, 20300401, 10, 8}};
        String ext = "date";
        int value_ext = 20300501;
        String sort_ext = "remain";
        int ifW = 0;
        int sortW = 0;
        int j = 0;
        int[] result = new int[]{};

        switch (ext) {
            case "code" : ifW = 0;
                break;
            case "date" : ifW = 1;
                break;
            case "maximum" : ifW = 2;
                break;
            case "remain" : ifW = 3;
                break;
        }

        //조건 필터링
        for(int[] value : data) {
            /*if(value[ifW] <= data[value[0]-1][ifW]) */
        }

        switch (sort_ext) {
            case "code" : sortW = 0;
                break;
            case "date" : sortW = 1;
                break;
            case "maximum" : sortW = 2;
                break;
            case "remain" : sortW = 3;
                break;
        }



    }
}
