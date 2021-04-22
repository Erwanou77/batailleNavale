package game;


public class Player {
	private Grid playerGrid;
	private Grid shotGrid;
	private String name;
	
	public Player(String n) {
		playerGrid = new Grid();
		shotGrid = new Grid();
		name = n;
	}
	
	public boolean addNewShip(int column, int line, int s, int d) {
		if((column>=0 && column<=9) ||(line>=0 && line<=9)) {
			return true;
		}else {
			return false;
		}
	}
	
	public boolean recordShot(int column, int line, Player p) {
		return false;
	}
	
	private boolean hasShip(int c, int l) {
		return false;
	}
	
	public void initGridRandom() {
	}
	
	public void displayGrid() {
		System.out.println(playerGrid);
	}
	public void displayShotGrid() {
		System.out.println(shotGrid);
	}
	
	public boolean hasWin(){
		return false;
	}
	
	public String getName() {
		return name;
	}
	
}
