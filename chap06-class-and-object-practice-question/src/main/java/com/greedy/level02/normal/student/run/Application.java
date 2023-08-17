package com.greedy.level02.normal.student.run;

import com.greedy.level02.normal.student.model.vo.StudentVO;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        StudentVO student = new StudentVO();

        System.out.println("학년");
        int grade = sc.nextInt();
        System.out.println("반");
        int classroom = sc.nextInt();
        sc.nextLine();
        System.out.println("이름");
        String name = sc.nextLine();
        System.out.println("키");
        double height = sc.nextDouble();
        System.out.println("성별");
        sc.nextLine();
        char gender = sc.nextLine().charAt(0);

        student = new StudentVO(grade, classroom, name, height, gender);

        System.out.println("학년 : " + student.getGrade());
        System.out.println("반 : " + student.getClassroom());
        System.out.println("이름 : " + student.getName());
        System.out.println("키 : " + student.getHeight());
        System.out.println("성별 : " + student.getGender());
    }
}
