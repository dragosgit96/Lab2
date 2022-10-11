package Package;

public class AutoView {
    public void printMenu() {
        System.out.println("Options: ");
        System.out.println("1. Add car");
        System.out.println("2. Remove car");
        System.out.println("3. Update car");
        System.out.println("4. Get Details of a car");
        System.out.println("5. See all cars");
        System.out.println("6. Exit.");
    }

    public void printId() {
        System.out.println("Id: ");
    }
    public void printMarke() {
        System.out.println("Marke: ");
    }
    public void printModell() {
        System.out.println("Modell: ");
    }
    public void printJahr() {
        System.out.println("Jahr: ");
    }
    public void printKilometer() {
        System.out.println("Kilometer: ");
    }
    public void printAutoDetails(Auto car) {
        System.out.println("Auto Details: ");
        System.out.println("Id: " + car.getId());
        System.out.println("Marke: " + car.getMarke());
        System.out.println("Modell: " + car.getModell());
        System.out.println("Jahr: " + car.getJahr());
        System.out.println("Kilometer: " + car.getKilometer());
    }
}
