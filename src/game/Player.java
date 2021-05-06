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
		if((column>=0 && column<=9) ||(line>=0 && line<=9 || s<5 && s>0 || d==1 && d==0)) {
			return true;
		}else{
			return false;
		}
	}
	
	public boolean recordShot(int column, int line, Player p) {
		return false;
	}
	
	private boolean hasShip(int c, int l) {
		if(playerGrid.getValue(c, l)==1){
			return true;
		}else return false;
	}
	
	public void initGridRandom() {
	}
	
	public void displayGrid() {
		playerGrid.toString();
	}
	public void displayShotGrid() {
		shotGrid.toString();
	}
	
	public boolean hasWin(){
		return false;
	}
	
	public String getName() {
		return name;
	}
	
}
