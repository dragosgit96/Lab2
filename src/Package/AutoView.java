package Package;

public class AutoView {
    public void printMenu() {
        System.out.println("Options: ");
        System.out.println("1. Add car");
        System.out.println("2. Remove car");
        System.out.println("3. Update car");
        System.out.println("4. Get Details of a car");
        System.out.println("5. Get Details of all cars");
        System.out.println("6. Exit.");
    }

    public void printId() {
        System.out.print("Id: ");
    }
    public void printMarke() {
        System.out.print("Marke: ");
    }
    public void printModell() {
        System.out.print("Modell: ");
    }
    public void printJahr() {
        System.out.print("Jahr: ");
    }
    public void printKilometer() {
        System.out.print("Kilometer: ");
    }
    public void printAutoDetails(Auto car) {
        System.out.println("Car Details: ");
        System.out.print("Id: " + car.getId());
        System.out.print("\tMarke: " + car.getMarke());
        System.out.print("\tModell: " + car.getModell());
        System.out.print("\tJahr: " + car.getJahr());
        System.out.println("\tKilometer: " + car.getKilometer());
    }
}
