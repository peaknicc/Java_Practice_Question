package com.ohgiraffers.section01.array.level03.hard;

import java.util.HashSet;
import java.util.Iterator;

public class Application2 {

    public static void main(String[] args) {

        /* 로또번호 생성기
         * 6칸 짜리 정수 배열을 하나 생성하고
         * 1부터 45까지의 중복되지 않는 난수를 발생시켜 각 인덱스에 대입한 뒤
         * 오름차순 정렬하여 출력하세요
         * */

        HashSet<Integer> set = new HashSet<>();

        while (set.size() < 6) {
            int b = (int) (Math.random() * 45 + 1);
            set.add(b);
        }

/*        Iterator iter = set.iterator();
        while (iter.hasNext()){
            System.out.println();
        }*/

        Iterator iter = set.iterator();
        while (iter.hasNext()) {
            System.out.print(iter.next() + " ");
        }
    }
}
