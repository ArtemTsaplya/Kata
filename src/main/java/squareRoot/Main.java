package squareRoot;

public class Main {
    public static void main(String[] args) {
        InputNumber number = new InputNumber();
        RandomNumberFromOneToTen randomNumber = new RandomNumberFromOneToTen();
        number.inputNumber();
        System.out.println(randomNumber.getRandomNumber());
    }
}
