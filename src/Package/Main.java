package Package;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static ArrayList<Auto> carlist() {
        ArrayList<Auto> cars = new ArrayList<>();
        Auto car1 = new Auto(1, "BMW", "M1", 2000, 10000);
        Auto car2 = new Auto(2, "KIA", "K1", 2015, 6000);
        cars.add(car1);
        cars.add(car2);
        return cars;
    }
    public static void main(String[] args) {
        {
            AutoView view = new AutoView();
            Controller carControl = new Controller(carlist(), view);
            while (true) {
                view.printMenu();
                Scanner input = new Scanner(System.in);
                int x = input.nextInt();
                switch (x) {
                    case 1: {
                        int id, jahr, kilometer;
                        String marke, modell;
                        view.printId();
                        id = input.nextInt();
                        view.printMarke();
                        input.nextLine();
                        marke = input.nextLine();
                        view.printModell();
                        modell = input.nextLine();
                        view.printJahr();
                        jahr = input.nextInt();
                        view.printKilometer();
                        kilometer = input.nextInt();
                        Auto car = new Auto(id, marke, modell, jahr, kilometer);
                        view.printAutoDetails(car);
                        carControl.addCar(car);
                        break;
                    }
                    case 2: {
                        view.printId();
                        carControl.removeCar(input.nextInt());
                        break;
                    }
                    case 3: {
                        int id, jahr, kilometer;
                        String marke, modell;
                        view.printId();
                        id = input.nextInt();
                        if (!carControl.searchCar(id)) {
                            System.out.println("Car not found!");
                            break;
                        }
                        view.printMarke();
                        marke = input.nextLine();
                        view.printModell();
                        modell = input.nextLine();
                        view.printJahr();
                        jahr = input.nextInt();
                        view.printKilometer();
                        kilometer = input.nextInt();
                        Auto car = new Auto(id, marke, modell, jahr, kilometer);
                        carControl.updateCar(car);
                        break;
                    }
                    case 4: {
                        view.printId();
                        carControl.getCar(input.nextInt());
                        break;
                    }
                    case 5: {
                        carControl.getAllCars();
                        break;
                    }
                    default: {
                        System.exit(0);
                    }
                }
            }
        }
    }
}