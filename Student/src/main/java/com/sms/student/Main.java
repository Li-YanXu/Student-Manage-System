package com.sms.student;

import com.sms.student.info.StudentInfo;

public class Main {
    public static void main(String[] args) {
        StudentInfo studentInfo = new StudentInfo();
        studentInfo.setName("liyanxu");
        studentInfo.setSex("男");
        studentInfo.setAge(22);
        studentInfo.printInfo();
    }
}
