package com.ohgiraffers.level01.basic;

public class Application {

    /* 실행용 메소드 */
    public static void main(String[] args) {

        // Calculator 클래스의 메소드를 호출 해서 실행

        Calculator calculator = new Calculator();

        calculator.checkMethod();

        int a = 4;
        int b = 5;

        String abSum = calculator.sumTwoNumber(a, b);
        System.out.println(a +"와 "+ b + "의 합은 " + abSum +"입니다.");

        String abMul = calculator.multiTwoNumber(a, b);
        System.out.println(a +"와 "+ b + "의 곱은 " + abMul +"입니다.");

    }
    
}
