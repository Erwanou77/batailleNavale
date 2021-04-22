package game;

public class Coordinates {
	private int column;
	private int line;
	
	public Coordinates(int c, int l) {
		column = c;
		line = l;
	}

	public Coordinates(char c, int l) {
		column = c-65;
		line = l;
	}

	public Coordinates(String str) {
		if(str.length()==2) {
			int c = str.charAt(0);
			int l = Integer.parseInt(str.substring(1,2));
			column = c;
			line = l;
		}
	}
	
	public int getColumn() {
		return column;
	}

	public int getLine() {
		return line;
	}

	public String toString() {
		return "(" + column + ", " + line + ")";
	}
	
}
