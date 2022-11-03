package hackerrank;

public class Student implements Comparable<Student> {

    private  int id;
    private String fname;
    private double cgpa;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public double getCgpa() {
        return cgpa;
    }

    public void setCgpa(double cgpa) {
        this.cgpa = cgpa;
    }

    public Student(int id, String fname, double cgpa) {
        this.id = id;
        this.fname = fname;
        this.cgpa = cgpa;
    }

    @Override
    public int compareTo(Student o) {
     if(this.cgpa!=o.cgpa) {
         return (int)(this.cgpa - o.cgpa);
     }
     if(!this.fname.equals(o.fname)) {
         return this.fname.compareTo(o.fname);
     }
     return this.id-o.id;
    }


}
