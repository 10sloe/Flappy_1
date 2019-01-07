import javafx.animation.AnimationTimer;

/*
 * Timer ist ein Animationtimer
 * Diese Klasse hat die Methoden start() und stop().
 * Wenn der Timer gestartet wurde, ruft er ständig die Methode handle() auf!
 */

class Timer extends AnimationTimer
{
    Skizze skizze;

    Timer(Skizze skizze_)
    {
        skizze = skizze_;
    }

    // Wenn er an ist, ruft er so oft er kann diese Methode auf
    public void handle(long now) {
        skizze.loop();
    }

}
