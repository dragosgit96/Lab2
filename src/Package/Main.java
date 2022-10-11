package Package;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        {
            Repositroy carRepo = new Repositroy();
            AutoView view = new AutoView();
            view.printMenu();
            Scanner input = new Scanner(System.in);
            int x = input.nextInt();
            switch(x) {
                case 1:
                {
                    Auto car = new Auto();
                    view.printId();
                    car.setId(input.nextInt());
                    view.printMarke();
                    car.setMarke(input.nextLine());
                    view.printModell();
                    car.setModell(input.nextLine());
                    view.printJahr();
                    car.setJahr(input.nextInt());
                    view.printKilometer();
                    car.setKilometer(input.nextInt());
                    carRepo.addCar(car);
                }
                case 2:
                {
                    view.printId();
                    carRepo.removeCar(input.nextInt());
                }
                case 3:
                {
                    Auto car = new Auto();
                    view.printId();
                    car.setId(input.nextInt());
                    view.printMarke();
                    car.setMarke(input.nextLine());
                    view.printModell();
                    car.setModell(input.nextLine());
                    view.printJahr();
                    car.setJahr(input.nextInt());
                    view.printKilometer();
                    car.setKilometer(input.nextInt());
                    carRepo.updateCar(car);
                }
                case 4:
                {
                    view.printId();
                    carRepo.getCar(input.nextInt());
                }
                case 5:
                {
                    carRepo.getAllCars();
                }
                default:
                {
                    System.exit(0);
                }
            }
        }
    }
}