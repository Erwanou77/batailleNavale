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

		List<Integer> x = new ArrayList<>();
		List<Char> y = new ArrayList<>();

        y.add("A"); x.add(1);
        y.add("B"); x.add(2);
        y.add("C"); x.add(3);
        y.add("D"); x.add(4);
        y.add("E"); x.add(5);
		y.add("F"); x.add(6);
        y.add("G"); x.add(7);
        y.add("H"); x.add(8);
        y.add("I"); x.add(9);
        y.add("J"); x.add(10);
		
		String randomAttack = toString(getRandomElement(x) . getRandomElement(y));

	}

	public int getRandomElement(List<Integer> list) {
        Random rand = new Random();
        return list.get(rand.nextInt(list.size()));
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
