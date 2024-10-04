class Car {

    private String brand;
    private int speed;
    private static int carCounter = 0;

    public Car(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
        carCounter++;
    }

    public String getBrand() {
        return brand;
    }

    public int getSpeed() {
        return speed;
    }

    public static int getCarCounter() {
        return carCounter;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }


}

public class Main {

    public static void main(String[] args) {

        Car car1 = new Car("Honda", 220);
        Car car2 = new Car("Mitsubishi", 250);

        System.out.printf("Marka: %s, vegsebesseg: %d\n", car1.getBrand(), car1.getSpeed());
        System.out.printf("Marka: %s, vegsebesseg: %d\n", car2.getBrand(), car2.getSpeed());

        if(car1.getSpeed() > car2.getSpeed()) {
            System.out.printf("A %s autonak a vegsebessege nagyobb, mint %s autonak\n", car1.getBrand(), car2.getBrand());
        } else {
            System.out.printf("A %s autonak a vegsebessege nagyobb, mint %s autonak\n", car2.getBrand(), car1.getBrand());
        }

        car1.setBrand("Toyota");
        car1.setSpeed(200);
        car2.setBrand("Ferrari");
        car2.setSpeed(320);

        System.out.printf("Marka: %s, vegsebesseg: %d\n", car1.getBrand(), car1.getSpeed());
        System.out.printf("Marka: %s, vegsebesseg: %d\n", car2.getBrand(), car2.getSpeed());


        if(car1.getSpeed() > car2.getSpeed()) {
            System.out.printf("A %s autonak a vegsebessege nagyobb, mint %s autonak\n", car1.getBrand(), car2.getBrand());
        } else {
            System.out.printf("A %s autonak a vegsebessege nagyobb, mint %s autonak\n", car2.getBrand(), car1.getBrand());
        }
        System.out.println("A letrehozott autok szama: " + Car.getCarCounter());


    }
}