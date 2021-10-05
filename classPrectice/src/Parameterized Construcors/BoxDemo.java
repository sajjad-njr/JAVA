class BoxDemo{
	public static void main(String[] args) {
		
		Box myBox1 = new Box(10,20,30);
		Box myBox2 = new Box(40,50,60);

		double vol;

		vol = myBox1.volume();
		System.out.println("volume is "+vol);

		vol = myBox2.volume();
		System.out.println("volume is "+vol);
	}
}