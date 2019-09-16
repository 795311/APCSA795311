
/**
 * Write a description of class JustinsPrettyPicture here.
 *
 * @author (Justin Mills)
 * @version (8/29/19)
 */
import java.awt.*;
public class JustinsPrettyPicture
{
    public static void main(){
        Turtle turt;

        TurtleDrawingWindow window = new TurtleDrawingWindow();

        int   size, turn;

        turt = new Turtle(Turtle.NO_DEFAULT_WINDOW);

        turt.jumpTo(-150,-120);
        window.add(turt);
        window.setVisible(true);
        turt.penSize(5);
        size = 300;
        turn = 111;
        turt.penColor(Color.blue);
        for(int j = 0; j <100; j++){
            turt.move(size);
            turt.turn(turn);
            String n = ""+j;
            //turt.print(n);
        }
        turt.jumpTo (0,0);
        size = 500;
        //turt.penColor(Color.yellow);
        turt.penSize(3);
        for(int i = 0; i < 100; i++){
            turt.move( size ); 
            turt.turn( -turn );
            String n = ""+i;
            if(i%2 == 0){
                turt.penColor(Color.blue);
            }else{
                turt.penColor(Color.red);
            }
           
        }
        turt.jumpTo (0,0);
        size = 500;
        turt.penColor(Color.red);
        turt.penSize(3);
        for(int i = 0; i < 100; i++){
            turt.move( size ); 
            turt.turn( turn );
            String n = ""+i;
             if(i%2 == 0){
                turt.penColor(Color.blue);
            }else{
                turt.penColor(Color.pink);
            }
        }
        turt.jumpTo (0,0);
        size = 500;
        turt.penColor(Color.green);
        turt.penSize(3);
        for(int i = 0; i < 100; i++){
            turt.move( -size ); 
            turt.turn( -turn );
            String n = ""+i;
             if(i%2 == 0){
                turt.penColor(Color.pink);
            }else{
                turt.penColor(Color.green);
            }
        }
        turt.jumpTo (0,0);
        size = 500;
        turt.penColor(Color.orange);
        turt.penSize(3);
        for(int i = 0; i < 100; i++){
            turt.move( -size ); 
            turt.turn( turn );
            String n = ""+i;
             if(i%2 == 0){
                turt.penColor(Color.orange);
            }else{
                turt.penColor(Color.yellow);
            }
        }

    }

}
