package com.ohgiraffers.hw3.controller;

import com.ohgiraffers.hw3.model.vo.ProductDTO;

import java.util.Scanner;

public class ProductController {
    private ProductDTO[] pro = null;
    public static int count = 0;
    Scanner sc = new Scanner(System.in);

    { pro = new ProductDTO[10]; }

    public void mainMenu() {

        do{
            System.out.println("===== 제품 관리 메뉴 =====");
            System.out.println("1. 제품 정보 추가");
            System.out.println("2. 제품 전체 조회");
            System.out.println("9. 프로그램 종료");
            int select = sc.nextInt();

            switch (select) {
                case 1 : productput(); break;
                case 2 : productPrint(); break;
                case 9 : return;
            }
        } while (true);
    }

    public void productput() {
        System.out.println("===== 도서 정보 입력 =====");
        System.out.print("1. 제품 번호 : ");
        int pId = sc.nextInt();
        sc.nextLine();
        System.out.print("2. 제품명 : ");
        String pName = sc.nextLine();
        System.out.print("3. 제품 가격 : ");
        int price = sc.nextInt();
        System.out.print("5. 제품 세금 : ");
        double tax = sc.nextDouble();

        pro[count] = new ProductDTO(pId, pName, price, tax);
        System.out.println("1개 도서 추가 완료");
    }

    public void productPrint() {

        for(int i=0;i<count;i++) {
            System.out.println("<" + (i + 1) + "번째 도서>");
            System.out.println(pro[i]);
        }

    }
}
