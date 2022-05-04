package InterviewExample;


import static org.junit.jupiter.api.Assertions.*;

import java.util.*;

import org.junit.jupiter.api.Test;

public class SpiralMatrixTest {
    @Test
    void testPrintSpiralOrder() {
        SpiralMatrix sp = new SpiralMatrix();
        int[][] matrix = {{1,2,3}, {4,5,6}, {7,8,9}};
        List<Integer> ls = SpiralMatrix.printSpiralOrder(matrix);
      
       List<Integer> exp = Arrays.asList(1, 2, 3, 6, 9, 8, 7, 4,5);
      assertEquals( ls, exp );
      
    }

    }

