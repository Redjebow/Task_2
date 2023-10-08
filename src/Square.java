public class Square extends Tetragon{
    private double sideSquare;

    public double getSideSquare() {
        return sideSquare;
    }

    public void setSideSquare(double sideSquare) {
        this.sideSquare = sideSquare;
    }

    public Square(double sideSquare) {
        this.sideSquare = sideSquare;
    }
    public Square(){
        this.sideSquare = 5;
    }

    @Override
    public void calculatePerimeter() {
        System.out.println("The square perimeter is "+(getSideSquare()*4));
    }

    @Override
    public String toString() {
        return "Square{The all side's of square is equal on "+ getSideSquare()+'}';
    }
}
