package Programs;

import java.util.Scanner;

public class TrafficLightSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the traffic light color (Green, Yellow, Red): ");
        String lightColor = scanner.nextLine().trim().toLowerCase();

        System.out.println("Is there an obstacle? (yes/no): ");
        String obstacleInput = scanner.nextLine().trim().toLowerCase();
        boolean hasObstacle = obstacleInput.equals("yes");


        if (hasObstacle) {
            System.out.println("Obstacle detected. You must stop.");
        } else {
            switch (lightColor) {
                case "green":
                    System.out.println("Light is Green: You can Go.");
                    break;
                case "yellow":
                    System.out.println("Light is Yellow: Slow Down.");
                    break;
                case "red":
                    System.out.println("Light is Red: Stop.");
                    break;
                default:
                    System.out.println("Invalid light color entered.");
            }
        }

        scanner.close();
    }
}
