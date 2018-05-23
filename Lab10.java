/*

Timothy Jou
CO SCI 290

- Lab 10 (Book problem 6.8)

*/

public class Lab10{

public static void main(String[]args){
  
  System.out.println("Celsius     Fahrenheit     |     Fahrenheit     Celsius\n" +
                     "-------------------------------------------------------");
  
  for(double celsius = 40.0, fahrenheit = 120.0; celsius >= 31.0; celsius--, fahrenheit -= 10.0){
    System.out.print(celsius + "        ");
    System.out.print(celsiusToFahrenheit(celsius) + "                ");
    System.out.print(fahrenheit + "        ");
    System.out.println(fahrenheitToCelsius(fahrenheit));
    
  }
}
  
  public static double celsiusToFahrenheit(double celsius){
    
    return (9.0 / 5) * celsius + 32;
  }
  
  public static double fahrenheitToCelsius(double fahrenheit){
    
    return (5.0 / 9) * (fahrenheit - 32);
  }
    
  
}