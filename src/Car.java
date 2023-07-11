public class Car implements Comparable<Car> { //<Car>{
    int speed;
    int price;
    String model;
    String color;

    Car(int speed, int price, String model, String color) {
        this.speed = speed;
        this.price = price;
        this.model = model;
        this.color = color;
    }

    public String toString() {
        return this.model + " " + this.color + " " + this.speed + " " + this.price;
    }

    // Сортируем по скорости/цене

    public int compareTo(Car anotherCar) {    // public int compareTo(Car o) {
        int speedDifference = this.speed - anotherCar.speed;
        int priceDifference = this.price - anotherCar.price;
        int modelDifference = this.model.compareTo(anotherCar.model);
        int colorDifference = this.color.compareTo(anotherCar.color);
        if (speedDifference != 0) {return speedDifference;}
        else if (priceDifference != 0) {return priceDifference;}
        else if (modelDifference != 0) {return modelDifference;}
        else return colorDifference;

    }
}
