package Package;

public class Controller {
    private Auto car;
    private AutoView view;

    public Controller(Auto car, AutoView view) {
        this.car = car;
        this.view = view;
    }

    public int getAutoId() {
        return car.getId();
    }
    public void setAutoId(int id) {
        car.setId(id);
    }

    public String getAutoMarke() {
        return car.getMarke();
    }
    public void setAutoMarke(String marke) {
        car.setMarke(marke);
    }

    public String getAutoModell() {
        return car.getModell();
    }
    public void setAutoModell(String modell) {
        car.setModell(modell);
    }

    public int getAutoJahr() {
        return car.getJahr();
    }
    public void setAutoJahr(int jahr) {
        car.setJahr(jahr);
    }

    public int getAutoKilometer() {
        return car.getKilometer();
    }
    public void setAutoKilometer(int kilometer) {
        car.setKilometer(kilometer);
    }

    public void updateView() {
        view.printAutoDetails(car);
    }

}
