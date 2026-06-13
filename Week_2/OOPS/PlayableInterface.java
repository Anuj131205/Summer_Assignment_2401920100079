// ============================================================
// SINGLE FILE SOLUTION - OOPs Problem of the Week
// Note: In real Java, packages need separate files.
// This is a single-file simulation for understanding.
// ============================================================

// ---- Playable Interface (music package) ----
interface Playable {
    void play();
}
// ---- Veena Class (music.string package) ----
class Veena implements Playable {
    @Override
    public void play() {
        System.out.println("Veena is playing... 🎸 (String Instrument)");
    }
}
// ---- Saxophone Class (music.wind package) ----
class Saxophone implements Playable {
    @Override
    public void play() {
        System.out.println("Saxophone is playing... 🎷 (Wind Instrument)");
    }
}
// ---- Test Class (live package) ----
public class Main {
    public static void main(String[] args) {
        System.out.println("========================================");
        System.out.println("      OOPs Problem of the Week 🎵");
        System.out.println("========================================\n");
      
        // a. Instance of Veena and call play()
        System.out.println("--- a. Veena Instance ---");
        Veena veena = new Veena();
        veena.play();

        // b. Instance of Saxophone and call play()
        System.out.println("\n--- b. Saxophone Instance ---");
        Saxophone saxophone = new Saxophone();
        saxophone.play();

        // c. Playable type variable (Upcasting / Polymorphism)
        System.out.println("\n--- c. Playable Type Variable (Polymorphism) ---");
        Playable p1 = new Veena();
        p1.play();
      
        Playable p2 = new Saxophone();
        p2.play();

        System.out.println("\n========================================");
        System.out.println("         Program Ended Successfully!");
        System.out.println("========================================");
    }
}
