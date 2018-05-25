import MatrixManager.MatrixAnalyzer;

import java.util.Scanner;

public class Main {

    @SuppressWarnings("deprecation")
    public static void main(String[] args) {
        MatrixAnalyzer matrixAnalyzer = new MatrixAnalyzer();
        System.out.println("-------------------");
        System.out.println(matrixAnalyzer.calc("A=[[6,8],[6,2]]"));
        System.out.println("-------------------");
        System.out.println(matrixAnalyzer.calc("A/2"));
        System.out.println("-------------------");
        System.out.println(matrixAnalyzer.calc("B=[[3,4],[5,8]]"));
        System.out.println(matrixAnalyzer.calc("C=[[1,1],[1,1]]"));
        System.out.println(matrixAnalyzer.calc("k=5"));
        System.out.println(matrixAnalyzer.calc("A^T"));
        System.out.println("-------------------");
        System.out.println(matrixAnalyzer.calc("A^T*B"));
        System.out.println("-------------------");
        System.out.println(matrixAnalyzer.calc("C*k"));
        System.out.println("-------------------");
        System.out.println(matrixAnalyzer.calc("A^T*B+C*k"));


//
//
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Type your vars or an expression.");
//
//        while (true) {
//            System.out.print("> ");
//            String input = scanner.nextLine();
//
//            // handler for exiting from endless loop
//            if (input.isEmpty()) {
//                continue;
//            } else if (input.equals("exit")) {
//                scanner.close();
//                break;
//            }
//            System.out.println(matrixAnalyzer.calc(input));
//        }


//        System.out.println("-------------------");
//


    }

}