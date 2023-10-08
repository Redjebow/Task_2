import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public void version1_0(){
        Tetragon[] tetragons1 = new Tetragon[6];
        tetragons1[0]=new Tetragon();
        tetragons1[1]=new Tetragon(2.3, 3,5,7);
        tetragons1[2]=new Square();
        tetragons1[3]=new Square(4.5);
        tetragons1[4]=new Rectangle();
        tetragons1[5]=new Rectangle(2,4);
        for (Tetragon tetragon : tetragons1) {
            tetragon.calculatePerimeter();
            String returnedText= tetragon.toString();
            System.out.println(returnedText);
            System.out.println("#".repeat(10));
        }

    }
    public static void main(String[] args) {
        List<Tetragon>tetragons=new ArrayList<>(6);
        Scanner scanner = new Scanner(System.in);
        int counter=0;
        while (counter<6){
            System.out.println("Enter sides of the new shape");
            System.out.print("please enter length of side А: ");
            double sideA = scanner.nextDouble();
            System.out.print("please enter length of side B: ");
            double sideB = scanner.nextDouble();
            System.out.print("please enter length of side C: ");
            double sideC = scanner.nextDouble();
            System.out.print("please enter length of side D: ");
            double sideD = scanner.nextDouble();
            if(sideA>0&&sideB>0&&sideC>0&&sideD>0 && sideA + sideB + sideC > sideD && sideB + sideC + sideD > sideA && sideA + sideB + sideD > sideC && sideA + sideC + sideD > sideB) {
                if (sideA == sideB && sideA == sideC && sideA == sideD) {
                    tetragons.add(new Square(sideA));
                } else if (sideA == sideC && sideB == sideD) {
                    tetragons.add(new Rectangle(sideA, sideB));
                } else {
                    tetragons.add(new Tetragon(sideA, sideB, sideC, sideD));
                }
            }else{
                System.out.println("A quadrilateral with sides thus specified cannot possibly exist.");
            }
            counter++;
        }
        System.out.println();
        for (Tetragon tetragon : tetragons) {
            tetragon.calculatePerimeter();
            String textFromToString = tetragon.toString();
            System.out.println(textFromToString);
            System.out.println();
        }
        }
}