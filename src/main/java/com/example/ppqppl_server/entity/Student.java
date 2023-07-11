package com.example.ppqppl_server.entity;

import javax.persistence.*;

@Entity
@Table(name="student")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public String stu_id;           // 学生号
    public String name;             // 姓名
    public int age;                 // 年龄
    public String sex;              // 性别
    public String phoneNumber;      // 手机号
    public String trainDate;        // 入学日期
    public String modifyDateTime;   // 信息创建时间

//    public Student(String stu_id, String name, int age, String sex, String phoneNumber, String trainDate, String modifyDateTime) {
//        this.stu_id = stu_id;
//        this.name = name;
//        this.age = age;
//        this.sex = sex;
//        this.phoneNumber = phoneNumber;
//        this.trainDate = trainDate;
//        this.modifyDateTime = modifyDateTime;
//    }

    public Student() {

    }

    public String getId() {
        return stu_id;
    }

    public void setId(String stu_id) {
        this.stu_id = stu_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getTrainDate() {
        return trainDate;
    }

    public void setTrainDate(String trainDate) {
        this.trainDate = trainDate;
    }

    public String getModifyDateTime() {
        return modifyDateTime;
    }

    public void setModifyDateTime(String modifyDateTime) {
        this.modifyDateTime = modifyDateTime;
    }
}
