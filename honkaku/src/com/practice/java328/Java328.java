package com.practice.java328;

interface Test {
    void testMethod();
}

public class Java328 {
    /* 3-2-8 */
//    匿名クラス

    public static void main(String[] args) {
        Test test = new Test(){
            @Override
            public void testMethod(){
                System.out.println("testMethod");
            }
        };

        test.testMethod();
    }
}
