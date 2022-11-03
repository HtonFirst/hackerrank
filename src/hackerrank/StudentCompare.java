package hackerrank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StudentCompare {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        Student st1 = new Student(1, "John", 3.2);
        Student st2 = new Student(2, "Helen", 3.2);
        Student st3 = new Student(3, "Edward", 3.2);
        Student st4 = new Student(4, "Edward", 3.2);
        Student st5 = new Student(5, "Gary", 2.9);

        studentList.add(st1);
        studentList.add(st2);
        studentList.add(st3);
        studentList.add(st4);
        studentList.add(st5);

//        studentList.sort(new Comparator<Student>() {
//            @Override
//            public int compare(Student st1, Student st2) {
//                if (st1.getCgpa() != st2.getCgpa()) {
//                    System.out.println(st1.getCgpa());
//                    System.out.println(st2.getCgpa());
//                    int res = (int) ((st2.getCgpa() - st1.getCgpa()) * 100);
//                    System.out.println((st2.getCgpa() - st1.getCgpa()) * 100);
//                    System.out.println(res + " res 1 ");
//                    return res;
//                } else if (!st1.getFname().equals(st2.getFname())) {
//                    return st1.getFname().compareTo(st2.getFname());
//                } else {
//                    return st1.getId() - st2.getId();
//                }
//            }
//
//        });
        Comparator<Student> studentComparator = new MyComparator();

        Collections.sort(studentList, studentComparator);

        for (Student st: studentList) {
            System.out.println(st.getFname() + "   " + st.getId());

        }



    }
}

class MyComparator implements Comparator<Student> {
    @Override
    public int compare(Student st1, Student st2) {
        if (st1.getCgpa() != st2.getCgpa()) {
            System.out.println(st1.getCgpa());
            System.out.println(st2.getCgpa());
            int res = (int) ((st2.getCgpa() - st1.getCgpa()) * 100);
            System.out.println((st2.getCgpa() - st1.getCgpa()) * 100);
            System.out.println(res + " res 1 ");
            return res;
        } else if (!st1.getFname().equalsIgnoreCase(st2.getFname())) {
            return st1.getFname().compareToIgnoreCase(st2.getFname());
        } else {
            return st1.getId() - st2.getId();
        }
    }
}
