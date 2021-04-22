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
		for(int i=0;i<GRID_SIZE;i++)
		{
			for(int j=0;j<GRID_SIZE;j++)
			{
				mat[i][j]=0;
			}
		}
	}
	
	public void randomInit() {

	}
	
	public int getValue(int column, int line) {
		return mat[column][line];
	}
	
	public void addShot(int column, int line, boolean success) {
	}
	
	public boolean addNewShip(int column, int line, int s, int d) {
		if((column>=0 && column<=9) ||(line>=0 && line<=9 || s<5 && s>0 || d==1 && d==0)) {
			
		return true;
		}else {
			return false;
		}
	}
	
	private void placeShip (Coordinates coord, int size, int dir) {
	}
	
	private boolean isValidShip(Coordinates coord, int size, int dir) {
        return true;
	}
	
	public String toString(){
		String str="      A  B  C  D  E  F  G  H  I  J\n    -------------------------------\n";
		for(int i=0;i<GRID_SIZE;i++)
		{
			str += i +"  |";
			for(int j=0;j<GRID_SIZE;j++)
			{
				str+="  "+mat[i][j];
			}
			str += " |\n";
		}
		 str += "    -------------------------------\n";
		return str;
	}
}
