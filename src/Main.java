import java.util.Scanner;

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
        System.out.println("this is main");
        Scanner keyboard = new Scanner(System.in); //takes user input

        Employee employee = new Employee(); //creates an instance of Employee
        System.out.println("Please set the employee name.");
        employee.setEmployeeName(keyboard.nextLine());
        System.out.println("Please set the employee number. (XXX-L)");
        employee.setEmployeeNumber(keyboard.nextLine());
        System.out.println("What is the employee's hire date (use letters a-m e.g. a = January, m = December)");
        employee.setHireDate(keyboard.nextLine());
        System.out.println();

        ProductionWorker worker = new ProductionWorker(); //creates instance of ProductionWorker
        System.out.println("Assuming this is a production worker what is their hourly wage?");
        worker.setHourlyRate(keyboard.nextDouble());
        System.out.println("What is their shift? 1 - Day Shift 2 - Night Shift");
        worker.setShift(keyboard.nextInt());

        System.out.println(employee + "\nThe employee name is " + employee.getEmployeeName() + "\n" + "The employee number is " + employee.getEmployeeNumber()
        + "\nThe employee hire date is " + employee.getHireDate() +"\n" + worker + "\nThe Production Worker's wage is " + worker.getHourlyRate() +
                "\nThe Production Worker's Shift is " + worker.getShift());

        keyboard.close(); //shuts down the scanner
    }
    }
