package lab3;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DateAndTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter event date and time (yyyy-MM-dd HH:mm): ");
        String input = scanner.nextLine();

        // Format to parse date and time
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");

        try {
            // Parse user input to LocalDateTime
            LocalDateTime eventDateTime = LocalDateTime.parse(input, formatter);
            LocalDateTime currentDateTime = LocalDateTime.now();

            // If event is in the past
            if (eventDateTime.isBefore(currentDateTime)) {
                System.out.println("The event time has already passed.");
                return;
            }

            // Calculate duration between now and event
            Duration duration = Duration.between(currentDateTime, eventDateTime);

            long totalMinutes = duration.toMinutes();
            long days = totalMinutes / (24 * 60);
            long hours = (totalMinutes % (24 * 60)) / 60;
            long minutes = totalMinutes % 60;

            // Display result
            System.out.println("Time remaining until event:");
            System.out.println(days + " days, " + hours + " hours, and " + minutes + " minutes");

        } catch (Exception e) {
            System.out.println("Invalid input format. Please use yyyy-MM-dd HH:mm");
        }

	}

}
