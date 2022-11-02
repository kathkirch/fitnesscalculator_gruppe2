public class BMIClassification {

    public static String classifyBMI(double bmi) {

        // check BMI range
        if(bmi < 18.5)
            return "Underweight";
        else if(bmi < 25)
            return "Healthy Weight";
        else if(bmi < 30)
            return "Overweight";
        else
            return "Obesity";
    }
}
