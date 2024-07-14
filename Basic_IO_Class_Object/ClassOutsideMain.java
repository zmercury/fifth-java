package Basic_IO_Class_Object;

class Student {
    int rollNum = 20;
    String name = "Hari";
}

public class ClassOutsideMain {
    public static void main(String[] args) {
        Student stu = new Student();

        System.out.println("Name: " + stu.name);
        System.out.println("Roll no.: " + stu.rollNum);
    }
}
