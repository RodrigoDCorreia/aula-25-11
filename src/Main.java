public class Main {
    public static void main(String[] args) {
        Circle  c = new Circle(2);
        System.out.println(c);
        System.out.println("Area de c: " + c.getArea());
        System.out.println("Pedimetro fr c:" + c.getPerimeter());

        ResizableCircle rc = new ResizableCircle(4);
        System.out.println(rc);
        rc.resize(50);
        System.out.println(rc);
        rc.resize(180);
        System.out.println(rc);
    }
}
