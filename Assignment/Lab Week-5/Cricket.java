package sajjad;

public class Cricket extends  Sports {
    /*
        Md. Sajjadur Rahman
        2012020299
        5F
        cse_2012020299@lus.ac.bd
       Date : 09 - 09 - 2021

     */

    String  matchType;
    int matchOver;
    Player player;

    Cricket(String matchType , int matchOver , Player player)
    {
        this.matchType = matchType;
        this.matchOver = matchOver;
        this.player = player;
    }

    void display()
    {

        System.out.println("Match Type : "+matchType);
        System.out.println("Over of The Match : "+matchOver);
        System.out.println("Name of the Player: "+player.playerName);
        System.out.println("Jersey Number of a Player: "+player.jerseyNumber);

    }
}
