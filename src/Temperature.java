import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter the Temperature in Celsius : ");
        float tempC = input.nextFloat();
        float tempF = (tempC * 9/5) + 32;
        float tempK = tempC + 273.15f;

        System.out.println("Temperature in Celsius : "+ tempC);
        System.out.println("Temperature in Faraday : "+ tempF);
        System.out.println("temperature in Kelvin : "+ tempK);

    }
}
