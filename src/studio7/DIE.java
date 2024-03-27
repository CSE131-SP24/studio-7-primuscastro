package studio7;

public class DIE {

	public static void main(String[] args) {
		DIE totl = new DIE(6);
		int i =0;
		while(i<35) {
		System.out.println(totl.roll());
		i++;}

	}
	private int sides;
	
	public DIE (int sides) {
		this.sides = sides;
	}
	public int roll () {
		return ((int)(Math.random() * (sides))+1);
	}

}
