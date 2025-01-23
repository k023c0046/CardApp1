package CardApp1;
    


public class Game {
    Player p;
    Card c;

    Game(){
        p=new Player();
        c=new Card();
    }

    void start(){
        p.turn(c);
        judge();
    }
    void judge(){
        if (c.result>=10){
            System.out.println("勝ち");
        }
        else{
            System.out.println("負け");
        }
    }
}
