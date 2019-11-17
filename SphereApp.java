//Jacob Gaylord
//jigaylord16@ole.augie.edu
//SphereApp.java
import java.util.Scanner;
public class SphereApp
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter radius");
    double radius = input.nextDouble();
    Sphere s = new Sphere();
    System.out.println(s.toString());
  }
}
