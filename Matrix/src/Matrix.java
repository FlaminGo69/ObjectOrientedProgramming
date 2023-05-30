import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * 
 * @invar | 0 <= getNumberOfColumns()
 * @invar | 0 <= getNumberOfRows()
 * @invar | getRowmajor() != null
 */
class Matrix {
	
	/**
	 * @invar | 0 <= rows
	 * @invar | 0 <= columns
	 * @invar | null != matrix
	 */
	private double [] matrix;
	private int rows;
	private int columns;
	
	
	
	/**
	 * @mutates | this
	 */
	public Matrix(double [] initialMatrix, int initialRows, int initialColumns) {
		this.matrix = initialMatrix.clone();
		this.rows = initialRows;
		this.columns = initialColumns;
	}
	
	/**
	 * 
	 * @inspects | this
	 */
	public int getNumberOfColumns() {
		return this.columns;
	}
	
	/**
	 * 
	 */
	public int getNumberOfRows() {
		return this.rows;
	}
	
	/**
	 * 
	 * @creates | result
	 */
	public double getElementAtIndex(int indexrow, int indexcolumn) {
		return this.matrix.clone()[indexrow*columns + indexcolumn*rows];
	}
	
	/**
	 * 
	 * @creates | result
	 */
	public double [] getRowmajor() {
		return matrix.clone();
	}
	
	/**
	 * @inspects | this
	 * @creates | result
	 * @post | result.length == toBeScaled.length
	 */
	public double [] scaled(double factor, double [] toBeScaled) {
		if (toBeScaled == null) {
			throw new IllegalArgumentException("Your matrix is null");
		}
		double [] scaledmatrix = new double [toBeScaled.length];
		for (int k = 0; k < toBeScaled.length; k++) {
			scaledmatrix[k] = toBeScaled[k]*factor;
		}
		return scaledmatrix;
	}
	
	
	/**
	 * @pre | matr1.length == matr2.length
	 * @inspects |
	 * @post | result.length == matr1.length
	 */
	
	public double [] plus(double [] matr1, double [] matr2) {
		if (matr1.length != matr2.length) {
			throw new IllegalArgumentException("Your two matrices need to have the same size");
		}
		double [] summatrix = new double [matr1.length];
		for (int k = 0; k< matr1.length; k++) {
			summatrix[k] = matr1[k] + matr2[k];
		}
		return summatrix;
	}
	
	
	/**
	 * @mutates | this
	 * @post | result.length == old(toBeScaled.length)
	 */
	
	public double [] scale(int factor, double [] toBeScaled) {
		if (toBeScaled == null) {
			throw new IllegalArgumentException("Your matrix is null");
		}
		for (int i = 0; i < toBeScaled.length; i++) {
			toBeScaled[i] = toBeScaled[i] * factor;
		}
		return toBeScaled;
	}
	
	/**
	 * @pre | matr1.length == matr2.length
	 * @mutates | this
	 * @post | result.length == old(matr1.length)
	 */
	
	public double [] add(double [] matr1, double [] matr2) {
		if (matr1.length != matr2.length) {
			throw new IllegalArgumentException("Your two matrices need to have the same size");
		}
		for (int k = 0; k< matr1.length; k++) {
			matr1[k] = matr1[k] + matr2[k];
		}
		return matr1;	
	}
	/*
	
	/**
	 * 
	 * @inspects | this
	 */
	public double [][] getArrayOfRows() {
		double [][] rowArray = new double [rows][columns];
		for (int k = 0; k < rows; k++) {
			for (int i = 0; i < columns; i++) {
				rowArray[k][i] = matrix[i + k*columns];
			}

		}
		return rowArray;
	}
}
