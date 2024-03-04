package lab1.task2;

import java.security.KeyStore;
import java.util.Random;

public class Course {
    private String name;
    private double minimumGrade;
    private Student[] students;

    public Course(String name_, double minimumGrade_, Student[] students_){
        name = name_;
        minimumGrade = minimumGrade_;
        students = students_;
    }

    public Student chooseStudentRandomly(){
        Random r = new Random();
        return students[r.nextInt(students.length - 1)];
    }

    public Student[] showAllPassingStudents(){
        Student[] v = new Student[students.length];
        int poz = 0;
        for (int i = 0; i < students.length-1; i++){
            if(students[i].getGrade() >= minimumGrade) {
                v[poz] = new Student(students[i].getName(), students[i].getGrade());
                poz++;
            }
        }

        return v;
    }

    public boolean isStudentPassing(int nr){
        return students[nr].getGrade() >= minimumGrade;
    }

    public boolean isStudentPassing(String nume){
        for (Student student : students) {
            if (student.getName().equals(nume))
                return student.getGrade() >= minimumGrade;
        }
        return false;
    }
}
