import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;
public class exercise1 {
    
    public static void main(String [] args){

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter school student email: ");
        String studentEm = scan.nextLine();


        Pattern pattern = Pattern.compile("\\w{1,}@students.national-u.edu.ph");
        Matcher matcher = pattern.matcher(studentEm);

        boolean match = matcher.matches();

        if (match) {
            System.out.println("valid student email");
        } else {
            System.out.println("invalid student email");
        }
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter phone number: ");
        String phonenum = scan.nextLine();
    
    
        Pattern pattern1 = Pattern.compile("\\+63\\d{10}");
        Matcher matcher1 = pattern.matcher(phonenum);
    
        boolean match1 = matcher.matches();
    
        if (match) {
            System.out.println("valid phone number");
        } else {
            System.out.println("invalid phone numnber");
        }

        Scanner bday = new Scanner(System.in);
        System.out.print("Enter Birthday: ");
        String birthday = scan.nextLine();
    
    
         pattern = Pattern.compile("\\d{4}-\\d{2}-\\d{2}");
         matcher = pattern.matcher(birthday);
    
        boolean match2 = matcher.matches();
    
        if (match2) {
            System.out.println("valid Birthday");
        } else {
            System.out.println("invalid Birthday");
        }
    }

}

