package com.mycompany.csc229_211review_lab02hw;

/**
 * Student Class</p>
 * DATE: 09/14/2025</p>
 * @author MoaathAlrajab
 * @author Ronald
 */
public class Student extends Person {
    private double grade;
    // private String address;

    /**
     * Constructor</p>
     * invokes super
     */
    public Student(){
        super("noname",(short) 0);
        grade = -1;
        // address = "und";
    }

    /**
     * Param Constructor</p>
     * invokes super</p>
     * @param name Name of Student
     * @param age Age of Student
     */
    public Student(String name, short age) {
        super(name, age);
        grade = -1;
        // address = "und";
    }

    /**
     * getAddress</p>
     * @return address("")
     */
    @Override
    public String getAddress() {
        // return address;
        return "";
    }

    /**
     * setAddress</p>
     * @param address
     */
    @Override
    public void setAddress(String address) {
        // this.address = address;
    }

    /**
     * getGrade</p>
     * @return grade
     */
    public double getGrade() {
        return grade;
    }

    /**
     * setGrade
     * @param grade
     */
    public void setGrade(double grade) throws Exception{
        if(grade < 0 || grade > 4){
            throw new Exception("Grade out of range");
        }
        this.grade = grade;
    }

    /**
     * toString
     * @return String of instance variable states
     */
    public String toString(){
        return "Name: "+getName()+", Age: "+getAge()+", GPA: "+getGrade();
    }
    // ToDo 1: Make this class a child of Person ■

    // ToDo 2: Fix the resulting errors ■

    // ToDo 3: Add a field for GPA and create setter and getter ■

    // ToDo 4: Add comments to your code ■

}