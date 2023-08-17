package com.ohgiraffers.hw2.run;

import com.ohgiraffers.hw2.model.dto.StudentDTO;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        StudentDTO[] student = new StudentDTO[10];

        for(int j=0; j< student.length; j++){
            student[j] = new StudentDTO();
        }

        Scanner sc = new Scanner(System.in);

        String keep = "Y";
        int count = 0;

        do {
                System.out.print("학년? ");
                int grade = sc.nextInt();
                System.out.print("반? ");
                int classroom = sc.nextInt();
                sc.nextLine();
                System.out.print("이름? ");
                String name = sc.nextLine();
                System.out.print("국어? ");
                int kor = sc.nextInt();
                System.out.print("영어? ");
                int eng = sc.nextInt();
                System.out.print("수학? ");
                int math = sc.nextInt();
                sc.nextLine();

                student[count] = new StudentDTO(grade, classroom, name, kor, eng, math);
                count++;

                System.out.println("계속 추가하려면 Y를 쳐주셈");
                keep = sc.nextLine().toUpperCase();
        }while (keep.equals("Y"));

        System.out.println(count);

        int kSum = 0;
        int eSum = 0;
        int mSum = 0;

        for (int j=0; j<count;j++) {
            kSum += student[j].getKor();
            eSum += student[j].getEng();
            mSum += student[j].getMath();
        }
            System.out.println("=== 학생들 각 과목 점수 평균 ===");
            System.out.println("국어 평균 : " + (kSum / count));
            System.out.println("영어 평균 : " + (eSum / count));
            System.out.println("수학 평균 : " + (mSum / count));

        for (int i=0; i<count;i++){

            System.out.println(student[i].information());
        }
    }
}
