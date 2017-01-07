package com.bijendra.databinding.sample.databindingsample;

/**
 * Created by Newdream on 06-Jan-17.
 */

public class Student {
    public static final String IMAGE_URL[] = {
            "http://i.imgur.com/DvpvklR.png",
            "http://i.imgur.com/CqmBjo5.jpg",
            "http://i.imgur.com/9gbQ7YR.png",
            "http://i.imgur.com/P5JLfjk.png",
            "http://i.imgur.com/FI49ftb.png",
            "http://i.imgur.com/yAdbrLp.png",
            "http://i.imgur.com/DAl0KB8.png",
            "http://i.imgur.com/glyvuXg.png",
            "http://i.imgur.com/Q54zMKT.png",
            "http://i.imgur.com/P5ZRSvT.png",
    };
    public String studentImageUrl;

    private  String name;
    private String age;
    private String course;



    Student(String name,String age,String course,String studentImageUrl)
    {
        this.name=name;
        this.age=age;
        this.course=course;
        this.studentImageUrl=studentImageUrl;

    }

    public String getName() {
        return name;
    }

    public String getAge() {
        return age;
    }

    public String getCourse() {
        return course;
    }

    public String getStudentImageUrl() {
        return studentImageUrl;
    }

    public void setStudentImageUrl(String studentImageUrl) {
        this.studentImageUrl = studentImageUrl;
    }




}
