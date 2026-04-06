import java.util.*;

class Student {
    int id;
    String name;
    int marks;

    Student(int id, String name, int marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    String grade() {
        if(marks>=80) return "A";
        else if(marks>=60) return "B";
        else return "C";
    }
}

class Main {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();

        list.add(new Student(1,"Rahul",85));
        list.add(new Student(2,"Amit",65));

        for(Student s : list) {
            System.out.println(s.id+" "+s.name+" "+s.marks+" Grade:"+s.grade());
        }
    }
}
