public class Rectangle extends Tetragon{
    private double sideARect;
    private double sideBRect;


    public double getSideARect() {
        return sideARect;
    }

    public void setSideARect(double sideARect) {
        this.sideARect = sideARect;
    }

    public double getSideBRect() {
        return sideBRect;
    }

    public void setSideBRect(double sideBRect) {
        this.sideBRect = sideBRect;
    }
    public Rectangle(double sideARect, double sideBRect) {
        setSideARect(sideARect);
        setSideBRect(sideBRect);
    }
    public Rectangle() {
        setSideARect(7);
        setSideBRect(10.5);
    }
    @Override public void calculatePerimeter() {

        System.out.println("The Rectangle perimeter is "+((getSideARect()*2)+(getSideBRect()*2)));
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "sideARect=" + sideARect +
                ", sideBRect=" + sideBRect +
                ", sideCRect=" + sideARect +
                ", sideDRect=" + sideBRect +
                '}';
    }
}
