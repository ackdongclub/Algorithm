package org.example;

public class Algorithm_20231015 {
    public static void main(String[] args) {
        int n = 0;
        String control = "wsdawsdassw";
        String[] arrCon = control.split("");

        for(int i = 0; i < arrCon.length; i++) {
            if(arrCon[i].equals("w")) {
                n += 1;
            } else if (arrCon[i].equals("s")) {
                n -= 1;
            } else if (arrCon[i].equals("d")) {
                n += 10;
            } else {
                n -= 10;
            }
            System.out.println(arrCon[i] + "----" + n);
        }
        System.out.println(n);
    }
}
