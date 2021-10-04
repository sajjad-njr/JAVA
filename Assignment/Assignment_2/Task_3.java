class Task_3{
	public static void main(String[] args) {
		
		BillCalculator total_bil = new BillCalculator();

		double  totalCost_1 = total_bil. getTotalBill(25);
		System.out.println("  "+totalCost_1);

		double  totalCost_2 = total_bil. getTotalBill(250);
		System.out.println("  "+totalCost_2);

		double  totalCost_3 = total_bil. getTotalBill(812);
		System.out.println("  "+totalCost_3);


	}
}