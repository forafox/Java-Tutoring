package lessons.lesson5;

class Instrument3 {
    void play(Note n) {
        System.out.println("Instrument.play() " + n); }
    String what() { return "Instrument"; }
    void adjust() { System.out.println("Adjusting Instrument"); }
}

class Wind3 extends Instrument3 {
    void play(Note n) { System.out.println("Wind.play() " + n); }
    String what() { return "Wind"; }
    void adjust() { System.out.println("Adjusting Wind"); }
}

class Percussion3 extends Instrument3 {
    void play(Note n) { System.out.println("Percussion.play() " + n); }
    String what() { return "Percussion"; }
    void adjust() { System.out.println("Adjusting Percussion"); }
}

class Stringed3 extends Instrument3 {
    void play(Note n) { System.out.println("Stringed.play() " + n); }
    String what() { return "Stringed"; }
    void adjust() { System.out.println("Adjusting Stringed"); }
}

class Brass3 extends Wind3 {
    void play(Note n) { System.out.println("Brass.play() " + n); }
    void adjust() { System.out.println("Adjusting Brass"); }
}

class Woodwind3 extends Wind3 {
    void play(Note n) { System.out.println("Woodwind.play() " + n); }
    String what() { return "Woodwind"; }
}

class Test extends Instrument3 {
    String what() { return "Woodwind"; }
}

public class Music3 {
    // Doesn't care about type, so new types
    // added to the system still work right:
    public static void tune(Instrument3 i) {
        i.play(Note.MIDDLE_C);
    }
    public static void tuneAll(Instrument3[] e) {
        for(Instrument3 i : e)
            tune(i);
    }
}