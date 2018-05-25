import static org.junit.jupiter.api.Assertions.*;

class MatrixTest {

    @org.junit.jupiter.api.Test
    void equels() {
        int[][] matrix = {{0, 2, 3}, {1, 8, 4},{1, 8, 4}};
        int[][] matrix_to_compare = {{0, 2, 3}, {1, 8, 4},{1, 8, 4}};
        Matrix matrix1 = new Matrix(matrix);
        Matrix matrix2 = new Matrix(matrix_to_compare);
        //assertArrayEquals(matrix1.getMatrix(), matrix2.getMatrix());
        assertTrue(matrix1.Equals(matrix2));
    }

    @org.junit.jupiter.api.Test
    void equels_test_noequels_matrix() {
        int[][] matrix = {{0, 2, 3}, {1, 8, 4}};
        int[][] matrix_to_compare = {{0, 2, 3}, {1, 8, 6}};
        Matrix matrix1 = new Matrix(matrix);
        Matrix matrix2 = new Matrix(matrix_to_compare);
        assertFalse(matrix1.Equals(matrix2));
    }

    @org.junit.jupiter.api.Test
    void equels_test_exception_situation() throws RuntimeException {
        int[][] matrix = {{0, 2, 3}, {1, 8, 4}};
        int[][] matrix_to_compare = {{0, 2, 3}};
        Matrix matrix1 = new Matrix(matrix);
        Matrix matrix2 = new Matrix(matrix_to_compare);
        Throwable thrown = assertThrows(RuntimeException.class, () -> {
            matrix1.Equals(matrix2);
        });
        assertEquals(thrown.getMessage(), "Incorect matrix");

    }


    @org.junit.jupiter.api.Test
    void transpose() {
        int[][] matrix ={{0, 2}, {1, 8}};
        int[][] final_matrix = {{0,1}, {2,8}};
        Matrix matrix_to_transponate = new Matrix(matrix);
        Matrix matrix_after_transponate = new Matrix(final_matrix);
        matrix_to_transponate = matrix_to_transponate.transpose();
        assertArrayEquals( matrix_to_transponate.getMatrix(), final_matrix);
    }





    @org.junit.jupiter.api.Test
    void sum() {
        int[][] matrix ={{0, 2}, {1, 8}};
        int[][] second_matrix = {{0,1}, {2,8}};
        int[][] result  = {{0,3}, {3,16}};
        Matrix matrix1 = new Matrix(matrix);
        Matrix matrix2 = new Matrix(second_matrix);
        assertArrayEquals( matrix1.sum(matrix2).getMatrix(), result);
    }

    @org.junit.jupiter.api.Test
    void sum_test_exception_situation() throws RuntimeException {
        int[][] matrix ={{0, 2}, {1, 8}};
        int[][] second_matrix = {{0,1}};
        Matrix matrix1 = new Matrix(matrix);
        Matrix matrix2 = new Matrix(second_matrix);
        Throwable thrown = assertThrows(RuntimeException.class, () -> {
            matrix1.sum(matrix2);
        });
        assertEquals(thrown.getMessage(), "Incorect matrix");
    }



    @org.junit.jupiter.api.Test
    void multiply() {
        int[][] matrix ={{0, 2}, {1, 8}};
        int[][] second_matrix = {{0,1}, {2,8}};
        int[][] result  = {{4,16}, {16,65}};
        Matrix matrix1 = new Matrix(matrix);
        Matrix matrix2 = new Matrix(second_matrix);
        assertArrayEquals( matrix1.multiply(matrix2).getMatrix(), result);
    }

    @org.junit.jupiter.api.Test
    void multiply_exception_situation() throws RuntimeException {
        int[][] matrix ={{0, 2}, {1, 8}};
        int[][] second_matrix = {{0,1}};
        Matrix matrix1 = new Matrix(matrix);
        Matrix matrix2 = new Matrix(second_matrix);
        Throwable thrown = assertThrows(RuntimeException.class, () -> {
            matrix1.multiply(matrix2);
        });
        assertEquals(thrown.getMessage(), "Incorect matrix");
    }


    @org.junit.jupiter.api.Test
    void multiply_by_num() {
        int[][] matrix ={{0, 2}, {1, 8}};
        int k = 2;
        int[][] result  = {{0,4}, {2,16}};
        Matrix matrix1 = new Matrix(matrix);
        assertArrayEquals( matrix1.multiply_by_num(k).getMatrix(), result);
    }

    @org.junit.jupiter.api.Test
    void toString_test() {
        int[][] matrix ={{0, 2}, {1, 8}};
        Matrix matrix1 = new Matrix(matrix);
        String matrix_to_print = matrix1.toString();
        // System.out.println(matrix_to_print);
        assertNotNull(matrix_to_print);
    }
}