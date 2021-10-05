class  CircleTest{
	 public static void main(String[] args) {
		Circle myCircle; 
		myCircle = new Circle();

		myCircle.center_x = 10 ;
		myCircle.center_y =  5;
		myCircle.radius = 3.5;

		System.out.println("The area of Circle is = "+myCircle.getArea());
		System.out.println("The Radius  of Circle is = "+myCircle.getCircumference());
	}
}