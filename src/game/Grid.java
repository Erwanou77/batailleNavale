package game;

import java.util.ArrayList;

public class Grid {
	private static final int GRID_SIZE = 10;
	private int mat[][];

	public Grid() {
		mat = new int[GRID_SIZE][GRID_SIZE];
		initMat();
	}
	private void initMat() {
	}
	
	public void randomInit() {

	}
	
	public int getValue(int column, int line) {
		return mat[column][line];
	}
	
	public void addShot(int column, int line, boolean success) {
	}
	
	public boolean addNewShip(int column, int line, int s, int d) {
		if(isValidShip(column,line,s,d)==true) {
			placeShip(column, line, s,d);
			return true;
		}else {
			return false;
		}
	}
	private void placeShip (int c,int l, int size, int dir) {
		if(dir==0)
		{
			for(int i=l;i<l+size;i++)
			{
				mat[i][c]=1;
			}
		}
		else
		{
			for(int i=c;i<c+size;i++)
			{
				mat[l][i]=1;
			}
		}
	}
	
	public String toString(){
		String str="";
		return str;
	}
}
