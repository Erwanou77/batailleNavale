package game;

public class Player {
	private Grid playerGrid;
	private Grid shotGrid;
	private String name;
	
	public Player(String n) {
		this.playerGrid = new Grid();
		this.shotGrid = new Grid();
		this.name = n;
	}
	public boolean isValidShip(Coordinates coord, int size, int dir) {
        return true;
	}
	public boolean addNewShip(int column, int line, int s, int d) {
		Coordinates c = new Coordinates(column,line);
		if((column>=0 && column<=9) && (line>=0 && line<=9) && (s<5 && s>0) && (d==1 && d==0)) {
			return true;
		}else{
			return false;
		}
	}
	public boolean recordShot(int column, int line, Player p) {
		boolean touche=false;
		if(shotGrid.getValue(column, line)==0){
			if(p.hasShip(column, line)==true){
				touche=true;
			}
			shotGrid.addShot(column, line, touche);
		}
		return touche;
	}
	private boolean hasShip(int c, int l) {
		if(playerGrid.getValue(c, l)==1){
			return true;
		}else return false;
	}
	
	public void initGridRandom() {
		playerGrid.randomInit();
	}
	public void displayGrid() {
		playerGrid.toString();
	}
	public void displayShotGrid() {
		shotGrid.toString();
	}
	public boolean hasWin(){
		int nb = 0;
		for(int i=0;i<Grid.getGRIDSIZE();i++)
		{
			for(int j=0;j<Grid.getGRIDSIZE();j++)
			{
				if(shotGrid.getValue(i, j)==1)
				{
					nb++;
				}
			}
		}
		if(nb==18)
		{
			return true;
		}
		else
		{
		return false;
		}
	}
	
	public String getName() {
		return name;
	}
	
}
