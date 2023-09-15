/* Employee and ProductionWorker Classes
Design a class named Employee. The class should keep the following information in fields:
• Employee name
• Employee number in the format XXX–L, where each X is a digit within the range 0–9
and the L is a letter within the range A–M. • Hire date
Write one or more constructors and the appropriate accessor and mutator methods for the class.
Next, write a class named ProductionWorker that extends the Employee class. The
ProductionWorker class should have fields to hold the following information:
• Shift (an integer)
• Hourly pay rate (a double)
The workday is divided into two shifts: day and night.
The shift field will be an integer value representing the shift that the employee works.
The day shift is shift 1 and the night shift is shift 2. Write one or more constructors and the appropriate accessor and mutator methods for the class.
 Demonstrate the classes by writing a program that uses a ProductionWorker object.*/
public class Main {
    public static void main(String[] args) {
        // Press Opt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        // Press Ctrl+R or click the green arrow button in the gutter to run the code.
        for (int i = 1; i <= 5; i++) {

            // Press Ctrl+D to start debugging your code. We have set one breakpoint
            // for you, but you can always add more by pressing Cmd+F8.
            System.out.println("i = " + i);
        }
    }
}