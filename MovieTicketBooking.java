import java.util.Scanner;


class AgeRestrictionException extends Exception {
    public AgeRestrictionException(String message) {
        super(message);
    }
}

public class MovieTicketBooking {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        try {
          
            checkAge(age);
            System.out.println("You booked a ticket.");
           
        } catch (AgeRestrictionException e) {
        
            System.out.println(e.getMessage());
        } finally {
            scanner.close();
        }
    }

    
    public static void checkAge(int age) throws AgeRestrictionException {
        if (age < 18) {
            throw new AgeRestrictionException("You must be 18 years or older to book a ticket.");
        }
    }
}
