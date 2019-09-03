import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the  a : ");
        int a = scanner.nextInt();
        System.out.print("Enter the b : ");
        int b = scanner.nextInt();
        System.out.print("Enter the c : ");
        int c = scanner.nextInt();

        QuadraticEquation quadraticEquation = new QuadraticEquation(a,b,c);

        if(quadraticEquation.getDiscriminant() < 0){
            System.out.println("The equation has no roots!");
        } else if (quadraticEquation.getDiscriminant() == 0){
            System.out.println("The equation has roots x1 = x2 = " + quadraticEquation.getRoot());
        } else if (quadraticEquation.getDiscriminant() > 0){
            System.out.println("The equation has roots x1 = " + quadraticEquation.getRoot1() + ",x2 = " + quadraticEquation.getRoot2());
        }
    }
}
