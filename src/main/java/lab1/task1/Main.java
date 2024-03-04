package lab1.task1;

import lab1.task2.Course;
import lab1.task2.Student;
import lab1.task2.StudentAllocator;
import lab1.task4.DummyCalculator;

import java.io.IOException;

public class Main {
    public static void Init(Student[] s){
        s[0] = new Student ("Ciprian", 8);
        s[1] = new Student("Alin", 10);
        s[2] = new Student("Radu", 4);
        s[3] = new Student("Theo", 3);
        
    }

    public static void main(String[] args){
//        Student[] s = new Student[4];
//        StudentAllocator sa = new StudentAllocator();
//        s = sa.createStudents();
//        Course c = new Course("Java", 5, s);
//
//        System.out.println("Random Student: " + c.chooseStudentRandomly().getName());
//
//        System.out.println("Passing Students: ");
//        Student[] v = c.showAllPassingStudents();
//        for(int i = 0; i < v.length; i++){
//            if(v[i] != null)
//                System.out.println(v[i].getName());
//        }
//
//        System.out.println(c.isStudentPassing(0));
//        System.out.println(c.isStudentPassing("Ciprian"));

        DummyCalculator c = new DummyCalculator();
        c.calculate(args);
    }
}