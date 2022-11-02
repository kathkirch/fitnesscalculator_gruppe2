import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {


    static Classification clas = new Classification();

    public static void main(String[] args) {

        Scanner myScan = new Scanner(System.in);  // Create a Scanner object

        System.out.println("Enter your age (in years): ");
        int UserAge = myScan.nextInt();  // Read user input

        System.out.println("Enter your weight (in kg): ");
        double UserWeight = myScan.nextDouble();  // Read user input

        System.out.println("Enter your weight (in cm): ");
        int UserHeight = myScan.nextInt();  // Read user input

        System.out.println("Enter your hip circumference (in cm): ");
        int UserHip = myScan.nextInt();  // Read user input

        System.out.println("Enter your waist circumference (in cm): ");
        int UserWaist = myScan.nextInt();  // Read user input

        BMI_Calculator bmi = new BMI_Calculator(UserAge, UserWeight, UserHeight);

        double UserBmi = bmi.calculate_bmi();

        System.out.println("Your BMI is: " + UserBmi);

        WaistHipCalculator whc = new WaistHipCalculator(UserWaist, UserHip);

        double UserWhc = whc.wH_Calculation();

        System.out.println("Your Waste to Hip Ratio is: " + UserWhc);

        System.out.println("Would you like to know your risk for coronary heart disease? Enter Yes or No");
        String s = myScan.next();

        if (s.equalsIgnoreCase("yes")){
            System.out.println("Enter your gender. Say true if you are female, false if you are male");
            boolean gender = myScan.nextBoolean();
            String myRisk = clas.calculateRisk(gender, UserWhc);
            System.out.println(myRisk);
        }
    }
}