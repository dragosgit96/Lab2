package Package;

import java.util.ArrayList;
import java.util.List;

public class Controller {
    private ArrayList<Auto> cars;
    private AutoView view;

    public Controller(ArrayList<Auto> cars, AutoView view) {
        this.cars = cars;
        this.view = view;
    }

    public void addCar(Auto car) {
        for (Auto c: cars)
            if (c.getId() == car.getId())
            {
                System.out.println("Car already exists!");
                return;
            }
        cars.add(car);
    }

    public void removeCar(int id) {
        for (Auto c: cars)
            if (c.getId() == id)
            {
                cars.remove(c);
                return;
            }
        System.out.println("Car not found!");
    }

    public boolean searchCar(int id) {
        for (Auto c: cars)
            if (c.getId() == id)
                return true;
        return false;
    }
    public void updateCar(Auto car)  {
        for (Auto c: cars)
            if (c.getId() == car.getId())
            {
                cars.remove(c);
                cars.add(car);
                System.out.println("Car updated successfully!");
                return;
            }
    }

    public void getCar(int id) {
        for (Auto c: cars)
            if (c.getId() == id)
            {
                view.printAutoDetails(c);
                return;
            }
        System.out.println("Car not found!");
    }

    public void getAllCars() {
        for (Auto c: cars)
            view.printAutoDetails(c);
    }
    public List<Auto> getCars() {
        return cars;
    }

    public void setCars(ArrayList<Auto> cars) {
        this.cars = cars;
    }

    public AutoView getView() {
        return view;
    }

    public void setView(AutoView view) {
        this.view = view;
    }
}
