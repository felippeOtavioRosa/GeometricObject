public class Circle implements GeometricObject {
    protected double radius;

    public Circle(){
        this.radius = 1.0d;
    }

    public Circle(double radius){
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }

    public double getPerimeter() {
        return 3.141592 * (radius*2);
    }

    public double getArea() {
        return 2* (3.141592 * radius);
    }
}
