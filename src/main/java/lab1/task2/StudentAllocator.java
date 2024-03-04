package lab1.task2;

public class StudentAllocator {

    public StudentAllocator(){

    }
    public static Student[] createStudents(){
        Student[] s = new Student[4];

        s[0] = new Student ("Ciprian", 8);
        s[1] = new Student("Alin", 10);
        s[2] = new Student("Radu", 4);
        s[3] = new Student("Theo", 3);

        return s;
    }
}
