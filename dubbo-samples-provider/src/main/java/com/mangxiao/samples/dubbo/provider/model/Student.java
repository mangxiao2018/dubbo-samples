package com.mangxiao.samples.dubbo.provider.model;

public class Student {

    private long id;
    private String stuName;
    private String stuNo;
    private float chineseScore;
    private float mathScore;
    private float englishScore;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public String getStuNo() {
        return stuNo;
    }

    public void setStuNo(String stuNo) {
        this.stuNo = stuNo;
    }

    public float getChineseScore() {
        return chineseScore;
    }

    public void setChineseScore(float chineseScore) {
        this.chineseScore = chineseScore;
    }

    public float getMathScore() {
        return mathScore;
    }

    public void setMathScore(float mathScore) {
        this.mathScore = mathScore;
    }

    public float getEnglishScore() {
        return englishScore;
    }

    public void setEnglishScore(float englishScore) {
        this.englishScore = englishScore;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", stuName='" + stuName + '\'' +
                ", stuNo='" + stuNo + '\'' +
                ", chineseScore=" + chineseScore +
                ", mathScore=" + mathScore +
                ", englishScore=" + englishScore +
                '}';
    }
}
