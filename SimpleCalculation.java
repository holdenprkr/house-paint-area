/*
 * This program is designed to calculate the exterior surface area of a house
 */
package simplecalculation;
import java.util.Scanner;

/**
 *
 * @author Peggy Fisher
 */
public class SimpleCalculation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double house_length, house_width, house_height;
        double window_height, window_width;
        double door_height, door_width;
        int doors, windows;
        
        Scanner in = new Scanner(System.in);
        System.out.println("What is the length of your house in feet?");
        house_length = in.nextDouble();
        System.out.println("What is the width of your house in feet?");
        house_width = in.nextDouble();
        System.out.println("What is the hieght of your house in feet?");
        house_height = in.nextDouble();
        System.out.println("How many windows are on your house and their height and width in feet?");
        windows = in.nextInt();
        window_height = in.nextDouble();
        window_width = in.nextDouble();
        System.out.println("How many doors are on your house and their height and width in feet?");
        doors = in.nextInt();
        door_height = in.nextDouble();
        door_width = in.nextDouble();
        
        double house_surface_area = (house_length * house_height * 2) + (house_width * house_height * 2);
        double window_door_area = (window_height * window_width * windows) + (door_height * door_width * doors);
        double paint_area = house_surface_area - window_door_area;
        
        System.out.printf("You will need enough paint to cover %7.2f square feet.", paint_area);
    }
    
}
