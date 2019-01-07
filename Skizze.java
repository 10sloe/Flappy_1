import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

class Skizze
{
    // Attribute
    Vogel vogel;  
    Hintergrund hintergrund;
    Timer timer;
    GraphicsContext gc;
    
    //----------------------------------
    Hindernis hindernis;

    //Konstruktor
    Skizze(GraphicsContext gc_)
    {
        gc = gc_;
        vogel = new Vogel(100, 100, 2);
        timer = new Timer(this);
        hintergrund = new Hintergrund();
        //-------------------------
        hindernis = new Hindernis(500,150,30,250,1,Color.GREEN);
  
        zeichnen();
    }

    //Methoden
    // Wird aufgerufen,wenn auf den Start-Button geklickt wird
    void start()
    {
        // Startet den Timer
        timer.start();
    }
    
    // Wird aufgerufen, wenn auf den Sprung-Button geklickt wird    
    void sprung()
    {
        vogel.nachOben(5);
    }
  
    // Wird aufgerufen, wenn auf den Neustart-Button geklickt wird
    void reset()
    {
        timer.stop();
        vogel.setX(100);
        vogel.setY(180);
        vogel.setV(2);
        zeichnen();
    }
    
    // Diese Methode wird vom Timer immer und immer wieder ausgerufen
    void loop(){

        // Der Vogel wird bewegt
        vogel.bewegen();
        
        //------------------------------------------
        hindernis.bewegen();
        
        // Alles wird gezeichnet
        zeichnen();

    }
    
    // Zeichnet alles neu, wird von den Methoden loop(), 
    // dem Konstruktor und reset() aufgerufen
    void zeichnen()
    {
        gc.clearRect(0,0,400,400);
        hintergrund.zeichnen(gc);
        vogel.zeichnen(gc);
        //-------------------------------------------
        hindernis.zeichnen(gc);
    }

}
