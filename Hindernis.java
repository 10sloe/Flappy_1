
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.*;

public class Hindernis
{
     // Attribute
    double x;
    double y;
    double breite;
    double hoehe;
    double v;
    Color farbe;
    

    // Konstruktor    
    Hindernis(double x_, double y_, double breite_, double hoehe_, double v_, Color farbe_)
    {
        x = x_;
        y = y_;
        breite = breite_;
        hoehe = hoehe_;
        v = v_;
        farbe = farbe_;
    }

    void bewegen()
    {
        x = x - v;      
    }
   
    void zeichnen(GraphicsContext gc)
    {
        gc.setFill(farbe);  
        gc.fillRect(x,y,breite,hoehe); 
    }

}
