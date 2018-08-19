package com.company;

public class Main {

    public static void main(String[] args) {
        Main hello = new Main();
//        hello.call(5);
//        hello.areEqual(-1, -1);
//        hello.areRougnlyEqual(83.2376, 93.2376);
        hello.concatenate("hello", "yo");
        hello.isPrime(45);
    }

    public boolean isPrime(int n) {
        if(n == 2){
            return true;
        }else if(n > 2){
            for (int i = 3; i < n; i++) {
                if (n % i == 0) {
                    System.out.println(true);
                    return true;
                } else {
                    System.out.println(false);

                    return false;
                }
            }
            return false;
        }
        return false;
       // Write your solution here
    }


    public class Solution {
        public int sign(int x) {
            if(x < 0){
                return -1;
            }else if(x > 0){
                return 1;
            }else{
                return 0;
            }
            // Write your solution here
        }
    }

    public String concatenate(String x, String y) {
        String z = x + "," + y;
        System.out.println(z);//complete the expression
        return z;
        // Write your solution here
    }

//    public void call(int x){
//        System.out.println(x);
//    }


//    public boolean areEqual(int x, int y) {
//        if( x == y ) {
//            boolean b = true;
////            System.out.println(b);
////complete the expression
//            return b;
//        }
//        return false;
//        // Write your solution here
//    }
//
//    public boolean areRougnlyEqual(double x, double y) {
//        if(Math.abs(x - y) < 0.0001) {
//            boolean b = true;
//            System.out.println(b);//complete the expression
//            return b;
//        }
//        System.out.println(false);
//        return false;
//        // Write your solution here
//    }



}

