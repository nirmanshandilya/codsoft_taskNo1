//task01: student grade calculator
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("\nenter no. of subjects: ");
            int numofsubs=scanner.nextInt();
            int[] marks=new int[numofsubs];

            for(int i=0; i<numofsubs; i++){
                System.out.print("enter marks for subject"+(i+1)+": ");
                marks[i]=scanner.nextInt();
                if(marks[i]<0 || marks[i]>100){
                    System.out.println("enter valid marks betn 0-100");
                    return;
                }
            }

            int totmarks=0;
            for(int mark : marks){
                totmarks = totmarks+mark;
            }
            double avgpercent= (double)totmarks/numofsubs;
            String grade;
            if(avgpercent>=90){
                grade="A";
            }
            else if(avgpercent>=80){
                grade="B";
            }else if(avgpercent>=70){
                grade="C";
            }else if(avgpercent>=60){
                grade="D";
            }else if(avgpercent>=50){
                grade="E";
            }else{
                grade="F";
            }

            System.out.println("Total Marks: "+totmarks+"/"+100*numofsubs);
            System.out.println("Avergae Percentage: "+avgpercent+" %");
            System.out.println("Grade:"+grade);
        }


    }
}
