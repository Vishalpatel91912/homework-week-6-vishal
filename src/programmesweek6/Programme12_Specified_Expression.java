package programmesweek6;

/*
Write a Java program to compute the specified expressions and print the
output.
Test Data:
((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5))
Expected Output : 2.138888888888889
 */
public class Programme12_Specified_Expression {

    public static void main(String[] args) { // main method
        double a = 25.5;
        double b = 3.5;
        double c = 40.5;
        double d = 4.5;
        double calculation = (((a * b) - (b * b)) / (c - d));
        System.out.println(calculation);
    }
}
