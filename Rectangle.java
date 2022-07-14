package Lab;

class Rectangle{
	private int lenght;
	private int breadth;
	
	Rectangle(){		//default constructor
		this.lenght=400;
		this.breadth=400;
	}
	public int getLenght() {	// getter for lenght
		return lenght;
	}
	public int getBreadth() {	// getter for breadth
		return breadth;
	}
	public void area(int lenght, int breadth) {		// method for area
		this.lenght=lenght;
		this.breadth=breadth;
		System.out.println("Area of this reactangle is "+ this.lenght*this.breadth);
	}
}



	
