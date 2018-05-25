package MatrixManager;

import java.util.Random;

public class Matrix {
    private final int rows;             // number of rows
    private final int cols;             // number of columns
    private final int[][] data;   // M-by-N array


    // create M-by-N matrix of 0's
    public Matrix(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        data = new int[rows][cols];
    }

    public int[][] getMatrix(){
        return this.data;
    }

    // create matrix based on 2d array
    public Matrix(int[][] data) {
        rows = data.length;
        cols = data[0].length;
        this.data = new int[rows][cols];
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                this.data[i][j] = data[i][j];
    }

    // copy constructor
    private Matrix(Matrix A) { this(A.data); }

    // create and return a random M-by-N matrix with values between 0 and 1
    public static Matrix random(int rows, int cols) {
        Matrix A = new Matrix(rows, cols);
        Random r = new Random();
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                A.data[i][j] = r.nextInt(10);//(int)(Math.random());
        return A;
    }


    // swap rows i and j
    private void swap(int i, int j) {
        int[] temp = data[i];
        data[i] = data[j];
        data[j] = temp;
    }

    // create and return the transpose of the invoking matrix
    public Matrix transpose() {
        Matrix A = new Matrix(cols, rows);
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                A.data[j][i] = this.data[i][j];
        return A;
    }

    // return C = A + B
    public Matrix sum(Matrix B) {
        Matrix A = this;
        if (B.rows != A.rows || B.cols != A.cols) throw new RuntimeException("Incorect matrix");
        Matrix C = new Matrix(rows, cols);
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                C.data[i][j] = A.data[i][j] + B.data[i][j];
        return C;
    }


    public boolean Equals(Matrix B) {
        Matrix A = this;
        if (B.rows != A.rows || B.cols != A.cols) throw new RuntimeException("Incorect matrix");
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                if (A.data[i][j] != B.data[i][j]) return false;
        return true;
    }

    // return C = A * B
    public Matrix multiply(Matrix B) {
        Matrix A = this;
        if (A.cols != B.rows) throw new RuntimeException("Incorect matrix");
        Matrix C = new Matrix(A.rows, B.cols);
        for (int i = 0; i < C.rows; i++)
            for (int j = 0; j < C.cols; j++)
                for (int k = 0; k < A.cols; k++)
                    C.data[i][j] += (A.data[i][k] * B.data[k][j]);
        return C;
    }

    public Matrix multiply_by_num(int k) {
        Matrix A = this;
        Matrix C = new Matrix(A.rows, A.cols);
        for (int i = 0; i < C.rows; i++)
            for (int j = 0; j < C.cols; j++)
                C.data[i][j] = A.data[i][j] * k;
        return C;
    }

    public Matrix division_by_num(int k) {
        Matrix A = this;
        Matrix C = new Matrix(A.rows, A.cols);
        for (int i = 0; i < C.rows; i++)
            for (int j = 0; j < C.cols; j++)
                C.data[i][j] = A.data[i][j] / k;
        return C;
    }


    // print matrix to standard output
    @Override
    public String toString() {
        String new_matrix_format = new String();

        for (int i = 0; i < rows; i++) {
            new_matrix_format += "[ ";
            for (int j = 0; j < cols; j++) {
                new_matrix_format += data[i][j] + " ";
                //System.out.printf("%4d ", data[i][j]);
            }
            new_matrix_format += "]";
            //System.out.println();
        }
        return new_matrix_format;
    }


    static Matrix parsefromString(String matrixString) {
        String trimed = matrixString.substring(1, matrixString.length() - 1);
        int rows = 0;
        for (char c : trimed.toCharArray()) {
            if (c == '[') {
                rows++;
            }
        }
        int[][] rawMatrix = new int[rows][];
        for (int i = 0, ob = trimed.indexOf('['); ob != -1; i++, ob = trimed.indexOf('[')) {
            int cb = trimed.indexOf(']');
            String separatedNumbers = trimed.substring(ob + 1, cb);
            String[] numbers = separatedNumbers.split(",");
            rawMatrix[i] = new int[numbers.length];
            for (int j = 0; j < numbers.length; j++) {
                rawMatrix[i][j] = Integer.parseInt(numbers[j]);
            }
            trimed = trimed.substring(cb + 1, trimed.length());
        }
        return new Matrix(rawMatrix);
    }
}
