package helix;

import org.junit.Test;
import java.util.ArrayList;

import static org.junit.Assert.assertTrue;

public class MatrixHelixMorphTest {

    /** Check if two integer matrices have the same contents
     *
     * @param matrix1
     * @param matrix2
     * @return true if the contents of matrix1 and matrix2 are identical and false otherwise
     */
    public static boolean testEqual(int[][] matrix1, int[][] matrix2) {

        /*
            Basic sanity checking:
                Verify that lengths are equal
         */
        if (matrix1 == null || matrix2 == null) {
            return true;
        }
        if (matrix1.length != matrix2.length) {
            return false;
        }
        if (matrix1[0].length != matrix2[0].length) {
            return false;
        }

        /*
            Test the contents of the matrices
         */
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[0].length; j++) {
                if (matrix1[i][j] != matrix2[i][j]) {
                    return false;
                }
            }
        }

        return true;
    }

    @Test
    public void test2x2() {
        int[][] inMatrix  = { {1, 2}, {3, 4} };
        int[][] expOutput = { {1, 2}, {4, 3} };
        assertTrue(testEqual(expOutput, MatrixHelixMorph.helix(inMatrix)));
    }

    @Test
    public void test1x1() {
        int[][] inMatrix  = { {1} };
        int[][] expOutput = { {1} };
        assertTrue(testEqual(expOutput, MatrixHelixMorph.helix(inMatrix)));
    }

    // ADD TESTS TO CHECK PARTITIONS
    @Test
    public void test3 () {
        int[][] inMatrix = {{1}, {2}, {3},{5}};
        int[][] expOutput = {{1}, {3}, {1}, {6}};
        assertTrue(testEqual(expOutput, MatrixHelixMorph.helix(inMatrix)));
    }

    @Test
    public void test4 () {
        int[][] inMatrix = {{2}, {1}, {1}, {3}, {4}};
        int[][] expOutput = {{3}, {2}, {1}, {5}, {4}};
        assertTrue(testEqual(expOutput, MatrixHelixMorph.helix(inMatrix)));
    }

    @Test
    public void test5() {
        int[][] inMatrix = {{1, 2, 3}, {1, 2, 1}, {1, 2, 3}};
        int[][] expOutput = {{1, 2, 3}, {1, 2, 3}, {1, 2, 3}};
        assertTrue(testEqual(expOutput, MatrixHelixMorph.helix(inMatrix)));
    }

    @Test
    public void test6() {
        int[][] inMatrix  = { {1, 2, 3}, {4, 5, 6} };
        int[][] expOutput = { {1, 2, 3}, {6, 5, 4} };
        assertTrue(testEqual(expOutput, MatrixHelixMorph.helix(inMatrix)));
    }

    @Test
    public void test7() {
        int[][] inMatrix = {{1, 2}, {2, 1}, {1, 3},{5, 6}};
        int[][] expOutput = {{1, 3}, {1, 3}, {1, 3}, {2, 6}};
        assertTrue(testEqual(expOutput, MatrixHelixMorph.helix(inMatrix)));
    }

    @Test
    public void test8() {
        int[][] inMatrix = {{1, 2, 3}, {1, 2, 1}, {1, 2, 3}};
        int[][] expOutput = {{1, 2, 3}, {1, 2, 3}, {1, 2, 3}};
        assertTrue(testEqual(expOutput, MatrixHelixMorph.helix(inMatrix)));
    }

    @Test
    public void test9() {
        int[][] inMatrix  = { {1, 1, 2}, {1, 3, 5} };
        int[][] expOutput = { {1, 2, 3}, {4, 5, 6} };
        assertTrue(testEqual(expOutput, MatrixHelixMorph.helix(inMatrix)));
    }

    @Test
    public void test10() {
        int[][] inMatrix  = {{1, 2, 3}};
        int[][] expOutput = {{1, 2}};
        assertTrue(testEqual(expOutput, MatrixHelixMorph.helix(inMatrix)));
    }
}
