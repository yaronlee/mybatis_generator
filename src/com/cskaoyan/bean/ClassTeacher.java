package com.cskaoyan.bean;

public class ClassTeacher {
    private String id;

    private String teacherName;

    private Integer age;

    private Integer teachTime;

    private String classId;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName == null ? null : teacherName.trim();
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getTeachTime() {
        return teachTime;
    }

    public void setTeachTime(Integer teachTime) {
        this.teachTime = teachTime;
    }

    public String getClassId() {
        return classId;
    }

    public void setClassId(String classId) {
        this.classId = classId == null ? null : classId.trim();
    }
}