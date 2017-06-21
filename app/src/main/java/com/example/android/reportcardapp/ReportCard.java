package com.example.android.reportcardapp;

/**
 * Created by JS IID on 6/18/2017.
 */

public class ReportCard {

    private String mChemistryGrade;
    private String mPhysicsGrade;
    private String mHistoryGrade;
    private String mMathsGrade;
    private String mStudentName;

    public ReportCard(String StudentName,String ChemistryGrade,String PhysicsGrade,String HistoryGrade,String MathsGrade) {
        //Initialize any variables here!
        StudentName = mStudentName;
        ChemistryGrade = mChemistryGrade;
        PhysicsGrade = mPhysicsGrade;
        HistoryGrade = mHistoryGrade;
        MathsGrade = mMathsGrade;
    }

    public String getStudentName(){
        return mStudentName;
    }
    public void setStudentName(String name){
        mStudentName = name;
    }
    public String getChemistryGrade() {
        return mChemistryGrade;
    }
    public void setChemistryGrade(String grade) {
        mChemistryGrade = grade;
    }
    public String getHistoryGrade() {
        return mHistoryGrade;
    }
    public void setHistoryGrade(String grade) {
        mHistoryGrade = grade;
    }
    public String getphysicsGrade() {return mPhysicsGrade;}
    public void setPhysicsGrade(String grade) {
        mPhysicsGrade = grade;
    }
    public String getMathsGrade() {
        return mMathsGrade;
    }
    public void setMathsGrade(String grade) {
        mMathsGrade = grade;
    }

    @Override
    public String toString() {
        //Your code here!  Return a representation of
        //the report card rather than the empty string
        return "Report Card{"+
                "Name : "+ getStudentName() + "\n" +
                "Chemistry Grade :"+ getChemistryGrade() +"\n" +
                "Physics Grade :"+ getphysicsGrade() +"\n" +
                "History Grade :"+ getHistoryGrade()+ "\n" +
                "Maths Grade :" + getMathsGrade()+ "\n" +
                "}";

    }
}
