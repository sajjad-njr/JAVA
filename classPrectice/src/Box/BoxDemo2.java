class BoxDemo2{
	 public static void main(String[] args) {
	 	
	 	Box1 mybox = new Box1();

	 	Box1 mybox2 = new Box1();


	 	 

	 	mybox.width = 10  ;
	 	mybox.height = 20 ;
	 	mybox.depth = 15;

	 	mybox2.width = 100  ;
	 	mybox2.height = 200 ;
	 	mybox2.depth = 150;

	 	mybox.volume();
	 

	 	mybox2.volume();
	 	
	 }
}