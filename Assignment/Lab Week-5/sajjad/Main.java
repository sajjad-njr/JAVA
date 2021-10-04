package sajjad;

public class Main {
    /*
        Md. Sajjadur Rahman
        2012020299
        5F
        cse_2012020299@lus.ac.bd
        Date : 09 - 09 - 2021

     */
    public static void main(String[] args) {

        Player player  = new Player("Shakib",75);

        Cricket cricket = new Cricket("International Match",20,player);

        cricket.display();

        Football football = new Football();


    }
}
