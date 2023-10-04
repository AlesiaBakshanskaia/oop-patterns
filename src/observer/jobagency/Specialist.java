package observer.jobagency;

public class Specialist implements Observer{
    String name;

    public Specialist(String name) {
        this.name = name;
    }

    @Override
    public void receiveOffer(String nameCompany, int salary) {
        System.err.println("Я супер специалист, работа не нужна");
    }
}
