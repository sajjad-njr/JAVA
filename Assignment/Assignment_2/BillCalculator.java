class BillCalculator{
	
	double  basicbil;

	double calculateBasicBill(double unit){
		 		
		if(unit <= 199)
			basicbil = unit * 1.20;
		else if(unit >= 200 && unit <= 400)
			basicbil = unit * 1.50;
		else if(unit >= 400 && unit <= 600)
			basicbil = unit * 1.80;
		else if(unit > 600)
			basicbil = unit * 2;
 
		return basicbil;
	}
	 
	 
	double calculateSurcharge(double basicBill){
		return  (basicBill * (.15));
	}

	double  getTotalBill(double unit )
	  {	  
  	double totalCost = calculateBasicBill(unit);

	  	if(totalCost < 100)
	  		totalCost =  100;

	 	if(totalCost > 400)
			{double surchargeBill = calculateSurcharge(totalCost);
	 		double totalCost2 = totalCost + surchargeBill ;
	 		return totalCost2;
	 	}
	 	return totalCost;
	 }
}