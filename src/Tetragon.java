public class Tetragon {
    private double sideA;
    private double sideB;
    private double sideC;
    private double sideD;

    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }

    public double getSideC() {
        return sideC;
    }

    public void setSideC(double sideC) {
        this.sideC = sideC;
    }

    public double getSideD() {
        return sideD;
    }

    public void setSideD(double sideD) {
        this.sideD = sideD;
    }

    public Tetragon(double sideA, double sideB, double sideC, double sideD) {
        if (sideA + sideB + sideC > sideD && sideB + sideC + sideD > sideA && sideA + sideB + sideD > sideC && sideA + sideC + sideD > sideB) {
            this.sideA = sideA;
            this.sideB = sideB;
            this.sideC = sideC;
            this.sideD = sideD;
        } else {
            System.out.println("A quadrilateral with sides thus specified cannot possibly exist. \n Your quadrilateral will have sides 5 6 7 8");
            this.sideA = 5;
            this.sideB = 6;
            this.sideC = 7;
            this.sideD = 8;
        }
    }

    public Tetragon() {
        this.sideA = 2;
        this.sideB = 3;
        this.sideC = 4;
        this.sideD = 5;
    }
    public void calculatePerimeter(){
        System.out.println("The perimeter in tetragon is "+(getSideA()+getSideB()+getSideC()+getSideD()));
    }

    @Override
    public String toString() {
        return "Tetragon{" +
                "sideA=" + getSideA() +
                ", sideB=" + getSideB() +
                ", sideC=" + getSideC() +
                ", sideD=" + getSideD()  +
                '}';
    }
}
