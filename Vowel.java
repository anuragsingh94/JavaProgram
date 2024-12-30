    import java.util.Scanner;

    public class Vowel{
        public static void main(String[] args) {
            // Create a scanner object to take user input
            Scanner input = new Scanner(System.in);
    
            // Ask user to enter a character
            System.out.print("Enter a character: ");
            char ch = input.next().charAt(0);
    
            // Use the conditional operator to check if the character is a vowel
            String result = (ch == 'a' || ch == 'A' || ch == 'e' || ch == 'E' || ch == 'i' || ch == 'I' || ch == 'o' || ch == 'O' || ch == 'u' || ch == 'U') 
                            ? "The character is a vowel." 
                            : "The character is not a vowel.";
    
            // Output the result
            System.out.println(result);
    
        }
    }
        
