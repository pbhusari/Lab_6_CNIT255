/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author prana
 */
public class Student extends Person implements BirthDateCalculate{

    private String PUID;
    private String major;
    private String favoriteClass;
    private String graduationDate;
    private boolean attendedHogwarts;
    
    public Student(){
        super();
        this.PUID = "UNKNOWN";
    }

    public Student(String PUID) {
        super();
        this.PUID = PUID;
    }

    public String getPUID() {
        return PUID;
    }

    public void setPUID(String PUID) {
        this.PUID = PUID;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getFavoriteClass() {
        return favoriteClass;
    }

    public void setFavoriteClass(String favoriteClass) {
        this.favoriteClass = favoriteClass;
    }

    public String getGraduationDate() {
        return graduationDate;
    }

    public void setGraduationDate(String graduationDate) {
        this.graduationDate = graduationDate;
    }

    public boolean isAttendedHogwarts() {
        return attendedHogwarts;
    }

    public void setAttendedHogwarts(boolean attendedHogwarts) {
        this.attendedHogwarts = attendedHogwarts;
    }
}
