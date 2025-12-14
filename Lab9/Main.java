package Lab9;

class Student {
 private String name;
 private int id;
 private double cgpa;
 public void setName(String name) {
 this.name = name;
 }
 public void setId(int id) {
 this.id = id;
 }
 public void setCgpa(double cgpa) {
 this.cgpa = cgpa;
 }
 public String getName() {
 return name;
 }
 public int getId() {
 return id;
 }
 public double getCgpa() {
 return cgpa;
 }
}
public class Main {
 public static void main(String[] args) {
 Student s = new Student();
 s.setName("Kamrul Islam");
 s.setId(251001);
 s.setCgpa(2.58);
 System.out.println(s.getName());
 System.out.println(s.getId());
 System.out.println(s.getCgpa());
 }
}