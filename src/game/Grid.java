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
		String[] letters = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J"};  
		String[] num = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};  
		java.util.Random random = new java.util.Random();
		int random_y = random.nextInt(letters.length);
		int random_x = random.nextInt(num.length);
		System.out.println(letters[random_y] + num[random_x]);
	}
	
	public int getValue(int column, int line) {
		return 0;
	}
	
	public void addShot(int column, int line, boolean success) {
		if(success)
		{
			mat[line][column]=1;
		}
		else 
		{
			mat[line][column]=4;
		}
	}
	
	public boolean addNewShip(int column, int line, int s, int d) {
		if(isValidShip(column, line, s, d))
		{
			placeShip(column, line, s, d);
			return true;
		}
		else
		{
			return false;
		}
	}
	
	private void placeShip (Coordinates coord, int size, int dir) {
		if(dir==0)
		{
			for(int i=l;i<size;i++)
			{
				mat[i][c]=1;
			}
		}
		else
		{
			for(int i=c;i<size;i++)
			{
				mat[l][i]=1;
			}
		}
	}
	
	private boolean isValidShip(Coordinates coord, int size, int dir) {
        	if(dir==0)
		{
			if((GRID_SIZE-size)>=l)
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		else
		{
			if((GRID_SIZE-size)>=c)
			{
				return true;
			}
			else
			{
				return false;
			}
		}
	}
	
	public String toString(){
		String str="      A  B  C  D  E  F  G  H  I  J\n    ------------------------------\n";
		for(int i=0;i<GRID_SIZE;i++)
		{
			str += i +"  |";
			for(int j=0;j<GRID_SIZE;j++)
			{
				str+="  "+mat[i][j];
			}
			str += " |\n";
		}
		 str += "    ------------------------------\n";
		return str;
	}
	
	public static int getGRIDSIZE()
	{
		return GRID_SIZE;
	}
}
