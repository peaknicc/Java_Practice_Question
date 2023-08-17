package com.ohgiraffers.level02.normal;

import java.util.Random;

public class RandomMaker {

    /*
     * static 메소드로 생성
     * 반환형 : String
     * 메소드명 : rockPaperScissors
     *
     * 가위,바위,보 중에 하나를 출력
     * (가위,바위,보 는 난수를 이용하여 구현)
     *
     * -- 출력 --
     * 가위
     * */
    public static String rockPaperScissors() {

        String rcp = null;

        int ran = (int)(Math.random() * 10 + 1);
        // 1 2 3 4 5 6 7 8 9 10 11

        while (ran > 9) {
            ran = (int)(Math.random() * 10 + 1);
        }

        if(ran <= 3) {
            rcp = "가위";
        } else if (ran <= 6) {
            rcp = "바위";
        } else if (ran <= 9) {
            rcp = "보";
        }

        System.out.println(rcp);

        return rcp;
    }

    /*
     * static 메소드로 생성
     * 반환형 : String
     * 메소드명 : tossCoin
     *
     * 동전 앞/뒤 중에 하나를 출력
     * (앞면,뒷면은 난수를 이용하여 구현)
     *
     * -- 출력 --
     * 앞면
     *
     * */

    public static String tossCoin() {

        String fb = null;

        int ran = (int)(Math.random() * 10 + 1);

        while (ran > 10) {
            ran = (int)(Math.random() * 10 + 1);
        }

        if(ran <= 5) {
            fb = "앞";
        } else if (ran <= 10) {
            fb = "뒤";
        }

        System.out.println(fb);

        return fb;
    }

}
