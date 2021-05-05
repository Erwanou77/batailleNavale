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
		return false;
	}
	
	public boolean recordShot(int column, int line, Player p) {
		boolean touche=false;
		if(shotGrid.getValue(column, line)==0)
		{
			if(p.hasShip(column, line))
			{
				touche=true;
			}
			shotGrid.addShot(column, line, touche);
		}
		return touche;
	}
	
	private boolean hasShip(int c, int l) {
		return false;
	}
	
	public void initGridRandom() {
		playerGrid.randomInit();
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
