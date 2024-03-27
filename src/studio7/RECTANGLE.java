package studio7;

public class RECTANGLE {

	public static void main(String[] args) {
		RECTANGLE rect1 = new RECTANGLE(5,5);
		RECTANGLE rect2 = new RECTANGLE(5, 3);
		
		rect1.perimeter();
		rect2.perimeter();
		System.out.println("Perimeter of rectangle 1 is " +rect1.perimeter());
		System.out.println("Perimeter of rectangle 2 is " +rect2.perimeter());
	
	
        if (rect1.Compare(10) == false) {
        	System.out.println("Rectangle 1 is bigger than Rectangle 2");
        }
        else {
        	System.out.println("Rectangle 2 is bigger than Rectangle 1");
        }
        if (rect1.isSquare() == false) {
        	System.out.println("Rectangle 1 is not a square");
        }
        else {
        	System.out.println("Rectangle 1 is a square");
        }
        
	}
	private int width;
	private int length;


	public RECTANGLE(int length, int width){
		this.length = length;
		this.width = width;
	}

	public int perimeter() {
		return (2*length + 2 *width);

	}
	public int getArea() {
		return (length*width);

	}
	public boolean isSquare (){
		if (length == width) {
			return true;}
		else {
			return false;
	}
	
}
	public boolean Compare(int area) {
		if (getArea()>area) {
		return true;
	} else {
		return false;}
	}

}