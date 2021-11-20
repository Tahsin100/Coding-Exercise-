import java.util.Calendar;
import java.util.Date;
import static java.lang.System.out;

import javax.sound.midi.*;

public class Sample {
    public void play() throws MidiUnavailableException {
        Sequencer sequencer = MidiSystem.getSequencer();
        System.out.println("We got a sequencer");
    } // close play

    public void doesntThrow() throws NullPointerException{
        System.out.println("This throws Wrong exception");
        throw new NullPointerException();
        // Nothing
    }
} // close class
