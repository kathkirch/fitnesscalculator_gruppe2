public class BMI_Calculator {

    int age;
    double weight;
    int height;
    double bmi;

    public BMI_Calculator(int age, double weight, int height) {
        this.age = age;
        this.weight = weight;
        this.height = height;
    }

    //method to calculate the bmi
   public double calculate_bmi (){
        bmi = (100*100*weight)/(height*height);
        return bmi;
   }
}
