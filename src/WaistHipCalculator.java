public class WaistHipCalculator {

    double wH_waistInCm;
    double wH_hipInCm;

    public WaistHipCalculator(double waist, double hip) {
        wH_waistInCm = waist;
        wH_hipInCm = hip;

    }

    public static double wH_Calculation(double wH_waistInCm, double wH_hipInCm) {

        double wH_result =  wH_waistInCm / wH_hipInCm;

        return wH_result;

    }

}
