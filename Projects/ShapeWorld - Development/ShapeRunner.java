
/**
 * Write a description of class ShapeWorldRunner here.
 *
 * @author (Justin Mills)
 * @version (8/23/19)
 */
public class ShapeRunner
{
   
    
    
    public static void main ()
    {
        ShapeWorld shapeWorld = new ShapeWorld (800, 800);
        APCSRectangle rectangle = new APCSRectangle (100, 150, 300, 200);
        shapeWorld.addRectangle(rectangle);
        APCSRectangle rectangle2 = new APCSRectangle (500, 150, 700, 200);
        shapeWorld.addRectangle(rectangle2);
        APCSCircle circle = new APCSCircle(400, 550, 180);
        shapeWorld.addCircle (circle);
        APCSCircle circle2 = new APCSCircle(200, 250, 60);
        shapeWorld.addCircle (circle2);
        APCSCircle circle3 = new APCSCircle(600, 250, 60);
        shapeWorld.addCircle (circle3);
        APCSTriangle triangle = new APCSTriangle (350, 350, 450, 350, 400, 275);
        shapeWorld.addTriangle (triangle);
        
        
      
        
    }
    
    

}
