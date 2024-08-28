package Questions;

public class calculator {
    public static void main(String[] args) {
        int num1 = 120;
        int num2 = 12;
        char operation = '-';

        switch(operation) {
            case '+':
                System.out.println("Addition is " + (num1 + num2));
                break;

            case '-':
                System.out.println("Subtraction is " + (num1 - num2));  // Fixed subtraction
                break;

            case '*':
                System.out.println("Multiplication is " + (num1 * num2));
                break;

            case '/':
                System.out.println("Division is " + (num1 / num2));
                break;

            case '%':
                System.out.println("Modulus is " + (num1 % num2));
                break;

            default:
                System.out.println("Invalid operation " + operation);
                break;
        }
    }
}
