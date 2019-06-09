package cn.hui.entity;

import java.util.Date;

/**
 * Student 实体类
 *
 * @author: @我没有三颗心脏
 * @create: 2018-04-23-下午 13:34
 */
public class Student {

    private int id;
    private int student_id;
    private String name;
    private int age;
    private String sex;
    private Date birthday;

    /* getter and setter */
    public void setId(int id) {
        this.id = id;
    }

    public void setStudent_id(int studentID) {
        this.student_id = studentID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

}