/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package model;

/**
 *
 * @author NguyenDucAnh
 */
public enum CourseType {
    python(1, "Python"),
    java(2, "Java"),
    net(3, ".Net"),
    cpp(4, "C/C++");

    private int courseID;
    private String courseString;

    private CourseType(int courseID, String courseString) {
        this.courseID = courseID;
        this.courseString = courseString;
    }

    public int getCourseID() {
        return courseID;
    }

    public String getCourseString() {
        return courseString;
    }

    public static CourseType fromID(int id) {
        for (CourseType type : CourseType.values()) {
            if (type.getCourseID() == id) {
                return type;
            }
        }
        return null;
    }
}
