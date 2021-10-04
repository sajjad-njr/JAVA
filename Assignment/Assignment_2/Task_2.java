class Task_2{
	public static void main(String[] args) {
		Book book1 = new Book();
		Book book2 = new Book();
		Book book3 = new Book();
		 
		book1.title = "JAVA for Beginners";
		book1.edition = "3rd  ";
		book1.author = "By Prof. David";
		book1.numberOfPages = 537;
		book1.price = 299;
		book1.publications ="Easy Coding Publications" ;
	
		book2.title = "Omega Point ";
		book2.edition = "12th ";
		book2.author = "By Humayun Ahmed";
		book2.numberOfPages = 122;
		book2.price = 128;
		book2.publications ="Shomoy Prokashoni" ;
		 
		book3.title = "Digital Fortress ";
		book3.edition = "5th  ";
		book3.author = "By Dan Brown";
		book3.numberOfPages = 356;
		book3.price =  520;
		book3.publications ="St. Martin Press" ;

		book1.showInfo();
		book2.showInfo();
		book3.showInfo();

		System.out.println(""+book1);
		System.out.println(""+book2);
		System.out.println(""+book3);

		book1 = book3;

		book1.edition = "1st ";
		book3.showInfo();

		System.out.println(""+book1);
		System.out.println(""+book2);
		System.out.println(""+book3);
	}
}