
class SmartPhone{
	
	String phoneName;
	 int ram ;
	double weigth ;

	SmartPhone(){
		phoneName ="Realme 8 Pro";
		 
	}
	SmartPhone(String phoneName, int ram,double  weigth){
		this.phoneName = phoneName;
		this.ram =    ram;
		this.weigth = weigth; 
	}
	
	SmartPhone(String phoneName, int ram,double  weigth){
		this.phoneName = phoneName;	 
		this.weigth = weigth; 
	}

	void showInfo(){
		System.out.println("Model Name : "+phoneName);
		System.out.println("Ram : "+ );
		System.out.println("Weigth : "+weigth);
		System.out.println("");

	}
}

 

