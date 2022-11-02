public class WaistHipCalculator {

    double wH_weightInKg;
    double wH_heightInCm;

    public WaistHipCalculator(double weight, double height) {
        wH_weightInKg = weight;
        wH_heightInCm = height;

    }

    public static double wH_Calculation(double wH_weightInKg, double wH_heightInCm) {

        double wH_result =  wH_weightInKg / wH_heightInCm;

        return wH_result;

    }

}
