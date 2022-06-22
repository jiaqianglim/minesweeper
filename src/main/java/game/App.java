package game;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Minesweeper started" );
        Engine msE = new Engine();
        while(true){
            msE.start();
            msE.play();
            msE.end();
        }
    }
}
