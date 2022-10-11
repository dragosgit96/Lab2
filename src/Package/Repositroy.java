package Package;

import java.util.ArrayList;
import java.util.List;

public class Repositroy {
    public List<Auto> repo = new ArrayList<Auto>();
    private AutoView view;

    public void addCar(Auto car) {
        for (Auto c : repo)
            if (c.getId() == car.getId())
            {
                System.out.println("Car already exist.");
                return;
            }
        repo.add(car);
    }
    public void removeCar(int id) {
        for (Auto c : repo)
            if (c.getId() == id)
            {
                repo.remove(c);
                return;
            }
        System.out.println("Car not found.");
    }
    public void updateCar(Auto car) {
        for (Auto c : repo)
            if (c.getId() == car.getId()) {
                repo.remove(c);
                repo.add(car);
                return;
            }
        System.out.println("Car not found.");
    }

    public void getCar(int id) {
        for (Auto c : repo)
            if (c.getId() == id) {
                view.printAutoDetails(c);
                return;
            }
        System.out.println("Auto nicht gefunden.");
    }
    public void getAllCars() {
        for (Auto c : repo)
            view.printAutoDetails(c);
    }
}
