import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.*;

public class Hintergrund
{
    Color farbe;

    public Hintergrund()
    {
        farbe = Color.SKYBLUE;
    }
    
    void zeichnen(GraphicsContext gc)
    {
        gc.setFill(farbe);  
        gc.fillRect(0,0,600,400); 
    }

}
