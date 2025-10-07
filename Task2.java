import java.text.DecimalFormat;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int marks;
        int sum=0;
        System.out.print("How many subject do you have: ");
        int n=sc.nextInt();

        System.out.println("Enter obtained marks out of 100 of each subject :");
        for(int i=1; i<=n; i++){
            marks=sc.nextInt();
            if(marks>100){
                System.out.println("\nInvalid input: Enter correct marks (<100)");
                sc.close();
                System.exit(0);
            }
            sum+=marks;
        }
        double avgPerc=(double)sum/n;

        System.out.println("Total Marks: " +sum+ "/"+ (n*100));
        DecimalFormat df=new DecimalFormat("0.##");
        System.out.println("Average Percentage: " +df.format(avgPerc)+ "%");

        if(avgPerc>=90){
            System.out.println("Grade 'A' ");
        }
        else if(avgPerc>=75){
            System.out.println("Grade 'B' ");
        }
        else if(avgPerc>=50){
            System.out.println("Grade 'C' ");
        }
        else if(avgPerc>=33){
            System.out.println("Grade 'D' ");
        }
        else{
            System.out.println("Fail");
        }
        sc.close();
    }
}
