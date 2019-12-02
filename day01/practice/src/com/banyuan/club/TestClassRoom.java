package com.banyuan.club;

import java.math.*;
import java.util.Random;

public class TestClassRoom {
    private static class RandomString {
        private static final int BASE_RANDOM = 0x9fa5 - 0x4e00 + 1;
        private static Random random = new Random();

        private static char getRandomChar() {
            return (char) (0x4e00 + random.nextInt(BASE_RANDOM));
        }

        private static String getRandomName(){
            char name1[] = new char[2];
            char name2[] = new char[3];

            name1[0] = RandomString.getRandomChar();
            name1[1] = RandomString.getRandomChar();
            name2[0] = RandomString.getRandomChar();
            name2[1] = RandomString.getRandomChar();
            name2[2] = RandomString.getRandomChar();


            String [] name = {String.valueOf(name1),String.valueOf(name2)};
            return name[Math.abs(random.nextInt())%2];

        }
    }


    private static Student randomStu() {
        Random random = new Random();
        Student stu = new Student();
        stu.setName(RandomString.getRandomName());
        stu.setAge(random.nextInt(20));
        return  stu;
    }

    public static void main(String[] args) {
        ClassRoom classRoom1 = new ClassRoom(1, 50);

        for (int i = 0; i < 50; i++) {
            classRoom1.addStu(randomStu());
        }

        classRoom1.delStu("b1s1");

        classRoom1.showNameId();
    }
}
