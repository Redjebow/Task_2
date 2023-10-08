public class Rectangle extends Tetragon{
    public Rectangle(double sideA, double sideB){
        super(sideA, sideB);
    }
    public Rectangle(){
        super(2,5);
    }
    @Override public void calculatePerimeter() {

        System.out.println("The Rectangle perimeter is "+((getSideA()*2)+(getSideB()*2)));
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "sideARect=" + getSideA() +
                ", sideBRect=" + getSideB() +
                ", sideCRect=" + getSideC() +
                ", sideDRect=" + getSideD() +
                '}';
    }
}
