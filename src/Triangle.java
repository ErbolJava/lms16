public class Triangle extends Shapes{
    private double height;
    private double base;

    @Override
    public String toString() {
        return "Triangle{" +
                "height=" + height +
                ", base=" + base +
                '}';
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public Triangle(double height, double base) {
        this.height = height;
        this.base = base;
    }

    @Override
    public double findArea() {
        System.out.print("Area: ");
        return (height*base) * 1 / 2;

    }
}
