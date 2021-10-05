class  Circle{

	int center_x, center_y;
	double radius ;

	Circle(){
		System.out.println("In Side Circle Constructor");
		center_x = center_y = 500;
		radius = 1 ;
	}

	Circle(int x1, int y1 , double z1){
		center_x  = x1;
		center_y =  y1;
		radius = z1;
	}
	
	double  getArea(){
		return 3.14 * radius * radius  ;
	}
 
	double  getCircumference(){
		return 2 * 3.14 * radius;

	}

} 