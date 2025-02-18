import java.util.Scanner;

class InvalidPinException extends Exception {
    public InvalidPinException(String message) {
        super(message);
    }
}

class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}

public class Assignment3p2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double balance = 3000;
        int correctPin = 1234;

        try {
            System.out.print("Enter PIN: ");
            int pin = scanner.nextInt();

            if (pin != correctPin) {
                throw new InvalidPinException("Error: Invalid PIN.");
            }

            System.out.print("Withdraw Amount: ");
            double withdrawAmount = scanner.nextDouble();

            if (withdrawAmount > balance) {
                throw new InsufficientBalanceException("Error: Insufficient balance. Current Balance: " + balance);
            }

            balance -= withdrawAmount;
            System.out.println("Withdrawal successful. Remaining Balance: " + balance);

        } catch (InvalidPinException | InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Remaining Balance: " + balance);
            scanner.close();
        }
    }
}