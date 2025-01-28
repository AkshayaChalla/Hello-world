import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Agecalculator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter ur birth year");
        int birthyear = sc.nextInt();
        System.out.println("enter ur birthmonth");
        int birthmonth = sc.nextInt();
        System.out.println("enter ur bithday");
        int birthday = sc.nextInt();
        LocalDate birthDate = LocalDate.of(birthyear,birthmonth,birthday);
        LocalDate today = LocalDate.now();
        Period age = Period.between(birthDate, today);
        System.out.println("ur age:" + age.getYears() + "years" + age.getMonths() + "months" + age.getDays() + "days");
        sc.close();
    }
    //sc.close();
    
}
