package game;

import java.util.ArrayList;

import java.util.Random;

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
	}
	
	public boolean addNewShip(int column, int line, int s, int d) {
		return true;
	}
	
	private void placeShip (Coordinates coord, int size, int dir) {
	}
	
	private boolean isValidShip(Coordinates coord, int size, int dir) {
        return true;
	}
	
	public String toString(){
		String str="";
		return str;
	}
}
