public class Circle implements GeometricObject{
    protected double radius;

    public Circle(){
        this.radius = 1.0d;
    }

    public Circle(double radius){
    }

    @Override
    public double getPerimeter(){
        return 2 * Math.PI * radius;
    }
    @Override
    public double getArea(){
        return Math.PI * radius * radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}
