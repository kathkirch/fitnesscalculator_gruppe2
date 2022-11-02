import java.util.HashMap;
import java.util.Map;

public class Classification {

    public String showCoronaryRisk_male (double wth_result) {
        String risk = "";
        if (wth_result < 0.859 ) {
            risk = "Congratulations you have no higher risk for coronary heart disease";
        } else if (wth_result > 0.86 && wth_result <= 0.909) {
            risk = "You have a 1.59 x increased risk for coronary heart disease";
        } else if (wth_result > 0.91 && wth_result <= 0.949) {
            risk = "You have a 2.32 x increased risk for coronary heart disease";
        } else if (wth_result > 0.95 && wth_result <= 0.999) {
            risk = "You have a 2.85 x increased risk for coronary heart disease";
        } else if (wth_result > 1.00 && wth_result <= 1.039) {
            risk = "You have a 3.57 x increased risk for coronary heart disease";
        } else if (wth_result > 1.04) {
            risk = "You have a 5.04 x increased risk for coronary heart disease";
        }
        return risk;
    }


    public String showCoronaryRisk_female (double wth_result) {
        String risk = "";
        if (wth_result < 0.72 ) {
            risk = "Congratulations you have no higher risk for coronary heart disease";
        } else if (wth_result > 0.72 && wth_result <= 0.759) {
            risk = "You have a 1.59 x increased risk for coronary heart disease";
        } else if (wth_result > 0.72 && wth_result <= 0.799) {
            risk = "You have a 2.32 x increased risk for coronary heart disease";
        } else if (wth_result > 0.80 && wth_result <= 0.839) {
            risk = "You have a 2.85 x increased risk for coronary heart disease";
        } else if (wth_result > 0.84 && wth_result <= 0.879) {
            risk = "You have a 3.57 x increased risk for coronary heart disease";
        } else if (wth_result > 0.88) {
            risk = "You have a 5.04 x increased risk for coronary heart disease";
        }
        return risk;
    }

    public String calculateRisk (boolean gender, double wth_result) {
        String risk;
        if (gender){
            risk = showCoronaryRisk_female(wth_result);
        } else {
            risk = showCoronaryRisk_male(wth_result);
        }
        return risk;
    }

    public String showType (double wth_result, boolean gender){
        String type = "";
        if ( (wth_result < 1 && !gender) ||
                (wth_result < 0.85 && gender) ){
            type = "You are a gynoide type";
        } else if ( (wth_result > 1 && !gender) ||
                (wth_result > 0.85 && gender)) {
            type = "You are a apple type";
        }
        return type;
    }




}
