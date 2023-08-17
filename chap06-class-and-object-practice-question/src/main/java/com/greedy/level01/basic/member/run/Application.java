package com.greedy.level01.basic.member.run;

import com.greedy.level01.basic.member.model.dto.MemberDTO;

public class Application {
    public static void main(String[] args) {

        MemberDTO member = new MemberDTO();

        System.out.println("==== 변경전 ====");
        
        System.out.println(member.getId());
        System.out.println(member.getPwd());
        System.out.println(member.getName());
        System.out.println(member.getAge());
        System.out.println(member.getGender());
        System.out.println(member.getPhone());
        System.out.println(member.getEmail());

        member.setId("kyb");
        member.setPwd("4444");
        member.setName("yoobin");
        member.setAge(30);
        member.setGender('M');
        member.setPhone("010-0000-0000");
        member.setEmail("email");

        System.out.println("==== 변경후 ====");
        
        System.out.println(member.getId());
        System.out.println(member.getPwd());
        System.out.println(member.getName());
        System.out.println(member.getAge());
        System.out.println(member.getGender());
        System.out.println(member.getPhone());
        System.out.println(member.getEmail());

    }
}
