/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package model;

/**
 *
 * @author NguyenDucAnh
 */
public enum SemesterType {
    fall(1, "Fall"),
    summer(2, "Summer"),
    spring(3, "Spring");

    private int SemesterID;
    private String SemesterString;

    public int getSemesterID() {
        return SemesterID;
    }

    public String getSemesterString() {
        return SemesterString;
    }

    private SemesterType(int SemesterID, String SemesterString) {
        this.SemesterID = SemesterID;
        this.SemesterString = SemesterString;
    }

    public static SemesterType fromID(int id) {
        for (SemesterType type : SemesterType.values()) {
            if (type.getSemesterID() == id) {
                return type;
            }
        }
        return null;
    }

}
