package org.example;

public class Algorithm_20231015_2 {
    public static void main(String[] args) {
      int[] numLog = {0, 1, 0, 10, 0, 1, 0, 10, 0, -1, -2, -1};
      int n = 0;
      int w = 1;
      int s = -1;
      int d = 10;
      int a = -10;
      String result = "";

      for(int i = 0; i < numLog.length; i++) {
          n = numLog[i];
          if(i+1 == numLog.length) {
              break;
          }
          if(numLog[i + 1] == n + w) {
              result += "w";
          } else if (numLog[i + 1] == n + s) {
              result += "s";
          } else if (numLog[i + 1] == n + d) {
              result += "d";
          } else {
              result += "a";
          }
      }
      System.out.println(result);
    }
}
