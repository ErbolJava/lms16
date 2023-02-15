public class Square extends Shapes{
    private double height;
    private double width;

    @Override
    public String toString() {
        return "Square{" +
                "height=" + height +
                ", width=" + width +
                '}';
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public Square(double height, double width) {
        this.height = height;
        this.width = width;
    }

    @Override
    public double findArea() {
        if(height==width){
            System.out.println("Area: ");
            return height*width;
        }
        return 0;
    }
}
