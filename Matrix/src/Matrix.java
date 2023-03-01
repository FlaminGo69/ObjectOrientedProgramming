import java.util.Arrays;

class Matrix {
	
	private double [] matrix;
	private int rows;
	private int columns;
	
	
	public Matrix(double [] initialMatrix, int initialRows, int initialColumns) {
		this.matrix = initialMatrix.clone();
		this.rows = initialRows;
		this.columns = initialColumns;
	}
	
	public int getNumberOfColumns() {
		return this.columns;
	}
	
	public int getNumberOfRows() {
		return this.rows;
	}
	
	public double getElementAtIndex(int indexrow, int indexcolumn) {
		return this.matrix.clone()[indexrow*columns + indexcolumn*rows];
	}
	
	
	public double [] getRowmajor() {
		return matrix.clone();
	}
	
	public double [] scaled(double factor, double [] toBeScaled) {
		double [] scaledmatrix = new double [toBeScaled.length];
		for (int k = 0; k< toBeScaled.length; k++) {
			scaledmatrix[k] = toBeScaled[k]*factor;
		}
		return scaledmatrix;
	}
	
	
	//two matrices need to have the same dimensions
	public double [] plus(double [] matr1, double [] matr2) {
		double [] summatrix = new double [matr1.length];
		for (int k = 0; k< matr1.length; k++) {
			summatrix[k] = matr1[k] + matr2[k];
		}
		return summatrix;
	}
	
	public double [] scale(int factor, double [] toBeScaled) {
		for (int i = 0; i < toBeScaled.length; i++) {
			toBeScaled[i] = toBeScaled[i] * factor;
		}
		return toBeScaled;
	}
	
	public double [] add(double [] matr1, double [] matr2) {
		for (int k = 0; k< matr1.length; k++) {
			matr1[k] = matr1[k] + matr2[k];
		}
		return matr1;	
	}
	/*
	
	public double [] getColumnmajor() {
		//later
	}
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
