import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nBasic Calculator");

        while (true) {
            System.out.println("\nMain Menu");
            System.out.println("\n1 ) Addition ");
            System.out.println("2 ) Subtraction ");
            System.out.println("3 ) Multiplication ");
            System.out.println("4 ) Division ");
            System.out.println("5 ) Floor Division ");
            System.out.println("6 ) Modulus ");
            System.out.println("7 ) Exponent ");
            System.out.println("8 ) Square ");
            System.out.println("9 ) Cube ");
            System.out.println("10 ) Square Root");
            System.out.println("11 ) Cube Root");
            System.out.println("0 ) Exit");

            System.out.print("\n _ > : ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("\nAddition");
                    System.out.print("\nEnter Number 1 : ");
                    double num1Add = scanner.nextDouble();
                    System.out.print("Enter Number 2 : ");
                    double num2Add = scanner.nextDouble();
                    System.out.println("\nAddition : " + num1Add + " + " + num2Add + " = " + (num1Add + num2Add));
                    break;

                case 2:
                    System.out.println("\nSubtraction");
                    System.out.print("\nEnter Number 1 : ");
                    double num1Sub = scanner.nextDouble();
                    System.out.print("Enter Number 2 : ");
                    double num2Sub = scanner.nextDouble();
                    System.out.println("\nSubtraction : " + num1Sub + " - " + num2Sub + " = " + (num1Sub - num2Sub));
                    break;

                case 3:
                    System.out.println("\nMultiplication");
                    System.out.print("\nEnter Number 1 : ");
                    double num1Mul = scanner.nextDouble();
                    System.out.print("Enter Number 2 : ");
                    double num2Mul = scanner.nextDouble();
                    System.out.println("\nMultiplication : " + num1Mul + " * " + num2Mul + " = " + (num1Mul * num2Mul));
                    break;

                case 4:
                    System.out.println("\nDivision");
                    System.out.print("\nEnter Number 1 : ");
                    double num1Div = scanner.nextDouble();
                    System.out.print("Enter Number 2 : ");
                    double num2Div = scanner.nextDouble();
                    System.out.println("\nDivision : " + num1Div + " / " + num2Div + " = " + (num1Div / num2Div));
                    break;

                case 5:
                    System.out.println("\nFloor Division");
                    System.out.print("\nEnter Number 1 : ");
                    double num1FloorDiv = scanner.nextDouble();
                    System.out.print("Enter Number 2 : ");
                    double num2FloorDiv = scanner.nextDouble();
                    System.out.println("\nFloor Division : " + num1FloorDiv + " // " + num2FloorDiv + " = " + (int) (num1FloorDiv / num2FloorDiv));
                    break;

                case 6:
                    System.out.println("\nModulus");
                    System.out.print("\nEnter Number 1 : ");
                    double num1Mod = scanner.nextDouble();
                    System.out.print("Enter Number 2 : ");
                    double num2Mod = scanner.nextDouble();
                    System.out.println("\nModulus : " + num1Mod + " % " + num2Mod + " = " + (num1Mod % num2Mod));
                    break;

                case 7:
                    System.out.println("\nExponent");
                    System.out.print("\nEnter Base Number : ");
                    double base = scanner.nextDouble();
                    System.out.print("Enter Power Number : ");
                    double exponent = scanner.nextDouble();
                    System.out.println("\nExponent : " + base + " ^ " + exponent + " = " + Math.pow(base, exponent));
                    break;

                case 8:
                    System.out.println("\nSquare");
                    System.out.print("\nEnter Number : ");
                    double numSquare = scanner.nextDouble();
                    System.out.println("\nSquare : " + numSquare + " * " + numSquare + " = " + (numSquare * numSquare));
                    break;

                case 9:
                    System.out.println("\nCube");
                    System.out.print("\nEnter Number : ");
                    double numCube = scanner.nextDouble();
                    System.out.println("\nCube : " + numCube + " * " + numCube + " * " + numCube + " = " + (numCube * numCube * numCube));
                    break;

                case 10:
                    System.out.println("\nSquare Root");
                    System.out.print("\nEnter Number : ");
                    double numSquareRoot = scanner.nextDouble();
                    System.out.println("\nSquare Root = " + Math.sqrt(numSquareRoot));
                    break;

                case 11:
                    System.out.println("\nCube Root");
                    System.out.print("\nEnter Number : ");
                    double numCubeRoot = scanner.nextDouble();
                    System.out.println("\nCube Root = " + Math.cbrt(numCubeRoot));
                    break;

                case 0:
                    System.out.println("\nProgram Exited");
                    return;

                default:
                    System.out.println("\nInvalid Input");
                    break;
            }
        }
    }
}
