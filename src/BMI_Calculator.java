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

    //methode to calculate the bmi
   public double calculate_bmi (double weight, int height){
        bmi = weight/(height*height);
        return bmi;
   }
}
