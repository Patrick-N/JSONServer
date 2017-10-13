package com.webd3102;

public class Student {

    private String firstName;
    private String lastName;
    private String studentNumber;


    public Student(String first, String last, String number) {
        firstName = first;
        lastName = last;
        studentNumber = number;
    }

    public Student(){
        super();
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String first) {
        firstName = first;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String last) {
        lastName = last;
    }

    public String getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(String number) {
        studentNumber = number;
    }

    @Override
    public String toString() {
        return String.format("First Name: " + firstName + " Last Name: " + lastName + " Student Number: " + studentNumber);
    }
}
