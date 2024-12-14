package org.example;

public class Student {
    private static  int studentCount = 0 ;
    private String firstName ;

    public void setFirstName(String firstName){

this.firstName = firstName ;


    }

    public  void increaseStudentcoount(){
         studentCount++ ;

    }
public void PrintCountNumber(){

        System.out.println("The Count number till now "+studentCount);
}


}
