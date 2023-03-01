import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

class MatrixTest {

	@Test
	void test() {
		double [] list0 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		double [][] list2 =  {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
		double [] list3 = {10, 20, 30, 40, 50, 60, 70, 80, 90};
		double [] list4 = {11, 22, 33, 44, 55, 66, 77, 88, 99};
		double [] list5 = {20, 40, 60, 80, 100, 120, 140, 160, 180};
	
		Matrix NewMatrix = new Matrix(list0, 3, 3);
		
		assertEquals(NewMatrix.getNumberOfColumns(),3);
		assertEquals(NewMatrix.getNumberOfRows(),3);
		
		double [][] list1 = NewMatrix.getArrayOfRows();
		//System.out.println(Arrays.deepToString(list1));
		assertArrayEquals(list1, list2);
		
		double element = NewMatrix.getElementAtIndex(1, 0);
		
		assertEquals(Math.round(element),  4);
		
		assertArrayEquals(NewMatrix.scaled(10, list0), list3);
		assertArrayEquals(NewMatrix.plus(list3, list0), list4);
		assertArrayEquals(NewMatrix.scale(10, list0), list3);
		assertArrayEquals(NewMatrix.add(list3, list3), list5);
	}

}
