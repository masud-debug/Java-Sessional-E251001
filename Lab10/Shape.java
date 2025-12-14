package Lab10;

abstract class Shape {
 abstract double area();
}
class Circle extends Shape {
 double r;
 Circle(double r) {
 this.r = r;
 }
 double area() {
 return 3.1416 * r * r;
 }
}
class Rectangle extends Shape {
 double w, h;
 Rectangle(double w, double h) {
 this.w = w;
 this.h = h;
 }
 double area() {
 return w * h;
 }
}
class Main {
 public static void main(String[] args) {
 Shape c = new Circle(7);
 Shape r = new Rectangle(3, 8);
 System.out.println(c.area());
 System.out.println(r.area());
 }
}