package com.greedy.level02.normal.book.run;

import com.greedy.level02.normal.book.model.dto.BookDTO;

public class Application {
    public static void main(String[] args) {

        BookDTO bookDTO = new BookDTO();

        System.out.print(bookDTO.getTitle() + ", ");
        System.out.print(bookDTO.getPublisher() + ", ");
        System.out.print(bookDTO.getAuthor() + ", ");
        System.out.print(bookDTO.getPrice() + ", ");
        System.out.println(bookDTO.getDiscountRate());

        BookDTO bookOne = new BookDTO("자바의 정석", "도우출판", "남궁성");

        System.out.print(bookOne.getTitle() + ", ");
        System.out.print(bookOne.getPublisher() + ", ");
        System.out.println(bookOne.getAuthor());

        BookDTO bookTwo = new BookDTO("홍길동전", "활빈당", "허균", 5000000, 0.5);

        System.out.print(bookTwo.getTitle() + ", ");
        System.out.print(bookTwo.getPublisher() + ", ");
        System.out.print(bookTwo.getAuthor() + ", ");
        System.out.print(bookTwo.getPrice() + ", ");
        System.out.println(bookTwo.getDiscountRate());

    }
}
