package entities;

public class Student {
    public String name;

    public double note1;

    public double note2;

    public double note3;

    public String avg(){
        double result =  note1 + note2 + note3 / 3;

        if(result > 60){
            return "Pass";
        }else {
            return  String.format("Failed %n Missing %.2f Points", 60 - sum()) ;
        }
    }

    public double sum(){
        return  note1 + note2 + note3;
    }

    public String toString(){
        return String.format("FINAL GRADE = %.2f%n %s", sum(), avg()) ;
    }
}
