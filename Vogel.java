import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.*;
import javafx.scene.image.Image;

class Vogel
{
    // Attribute
    double x;
    double y;
    double v;
    Image img;

    // Konstruktor    
    Vogel(double x_, double y_, double v_)
    {
        x = x_;
        y = y_;
        v = v_;
        img = new Image("bild.png", true);
    }

    void bewegen()
    {
        v = v + 0.1;     
        y = y + v;        
    }

    void nachOben(double wert)
    {
        v = -wert;
    }

    void zeichnen(GraphicsContext gc)
    {
        gc.drawImage(img,x, y,50,50);
    }
    
    void setX(double x_)
    {
        x =  x_;
    }
    
    void setY(double y_)
    {
        y = y_;
    }
    
    void setV(double v_)
    {
        v = v_;
    }

}
