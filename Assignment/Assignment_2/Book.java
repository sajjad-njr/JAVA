class Book{

	String title;
	String author;
	int price;
	int numberOfPages;
	String edition;
	String publications;

	void showInfo(){
		System.out.println(" "+title+" "+edition+"edition");
		System.out.println(" "+author);
		System.out.println(" "+numberOfPages+" Pages");
		System.out.println(" Price: "+price+" tk");
		System.out.println(" "+publications);
		System.out.println("");


	}
}