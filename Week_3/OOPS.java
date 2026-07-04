import java.util.Random;

// Abstract Class
abstract class Compartment {
    public abstract String notice();
}

// Child Classes
class FirstClass extends Compartment {
    @Override
    public String notice() {
        return "Welcome to First Class! AC, comfortable seats.";
    }
}

class Ladies extends Compartment {
    @Override
    public String notice() {
        return "Ladies Compartment - Only for female passengers.";
    }
}

class General extends Compartment {
    @Override
    public String notice() {
        return "General Compartment - Open for all passengers.";
    }
}

class Luggage extends Compartment {
    @Override
    public String notice() {
        return "Luggage Compartment - For parcels only.";
    }
}

// Main Class
public class TestCompartment {

    public static void main(String[] args) {

        Compartment[] compartments = new Compartment[10];
        Random random = new Random();

        for (int i = 0; i < 10; i++) {

            int randomType = random.nextInt(4) + 1;

            switch (randomType) {
                case 1:
                    compartments[i] = new FirstClass();
                    break;
                case 2:
                    compartments[i] = new Ladies();
                    break;
                case 3:
                    compartments[i] = new General();
                    break;
                case 4:
                    compartments[i] = new Luggage();
                    break;
            }
        }

        System.out.println("=== Compartment Notices ===\n");

        for (int i = 0; i < 10; i++) {
            System.out.println("Compartment " + (i+1) + ": " + 
                                compartments[i].notice());
        }
    }
}
