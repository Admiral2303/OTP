

public class Main {

    public static void main(String[] args) {
        // write your code here
        Matrix A = new Matrix(6,6);
        Matrix B = new Matrix(6,6);
        Matrix C = new Matrix(6,6);
        Matrix Result = new Matrix(6,6);
        A = Matrix.random(6,6);
        B = Matrix.random(6,6);
        C = Matrix.random(6,6);
        Result = (A.transpose().multiply(B)).sum(C.multiply_by_num(2));

        System.out.println(Result.toString());
    }
}
