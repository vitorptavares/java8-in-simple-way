package session10.bifunction;

import java.util.function.BiFunction;

//To create Student object by taking name & rollno as input by using BiFunction
public class CreateStudent {

     Student createStudent(String name, Integer rollno){
        BiFunction<String, Integer, Student> f = (n,r) -> new Student(n, r);
        return f.apply(name, rollno);

    }

    class Student{
     String name;
     int rollno;

     Student(String name, int rollno){
         this.name = name;
         this.rollno = rollno;
     }

        @Override
        public String toString() {
            return "Student{" +
                    "name='" + name + '\'' +
                    ", rollno=" + rollno +
                    '}';
        }
    }

    public static void main(String[] args) {
        CreateStudent s = new CreateStudent();
        Student v = s.createStudent("Vitor", 100);
        System.out.println(v);
    }
}
