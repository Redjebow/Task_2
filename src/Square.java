public class Square extends Tetragon{
    public Square(double sideA) {
        super(sideA);
    }

    public Square() {
    super(4);
    }

    @Override
    public void calculatePerimeter() {
        System.out.println("The square perimeter is "+(getSideA()*4));
    }

    @Override
    public String toString() {
        return "Square{The all side's of square is equal on "+ getSideA()+'}';
    }
}
