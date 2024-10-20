package edu.grinnell.csc207.util;

import edu.grinnell.csc207.util.MatrixV0;
import edu.grinnell.csc207.util.Matrix;

import static edu.grinnell.csc207.util.MatrixAssertions.assertMatrixEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.fail;

import java.beans.Transient;

import org.junit.jupiter.api.Test;

public class TestsByBen {

    @Test
    public void insertAndDeleteTest() {
        Matrix<String> testMatrix = new MatrixV0<String>(2, 2, "X");
        testMatrix.insertCol(0);
        testMatrix.insertRow(0);
        String X = "X";
        assertMatrixEquals(new String[][] {{X, X, X}, {X, X, X}, {X, X, X}}, testMatrix, "testInsertion");
        testMatrix.deleteCol(0);
        testMatrix.deleteRow(0);
        assertMatrixEquals(new String[][] {{X, X}, {X, X}}, testMatrix, "testDeletion");
    }

    @Test
    public void testSetandGet() {
        Matrix<String> testMatrix = new MatrixV0<String>(2, 2, "X");
        testMatrix.set(0, 0, "O");
        assertMatrixEquals(new String[][] {{"O", "X"}, {"X", "X"}}, testMatrix, "testInsertion");
        String testGet = testMatrix.get(0, 0);
        assertEquals(testGet, "O", "testGet");
        }


}