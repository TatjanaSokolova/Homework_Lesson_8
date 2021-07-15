import java.util.Scanner;
public class  HomeworkLesson8{
    public static void main(String args[]){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number:");
        int A = scanner.nextInt();
        System.out.println("Enter second number:");
        int B = scanner.nextInt();
        System.out.println("Enter an option a-h:");
        String str = scanner.next();
        char option = str.charAt(0);

//        Options:
//        a.      ‘+’ sum both elements;
//        b.     ’-’: do subtraction;
//        c.      ’/’: do dividing;
//        d.     ‘*’: do multiplication;
//        e.      ‘%’: get remainder when the first element is divided by the second element;
//        f.      ‘p’: print out both elements;
//        g.     ‘b’: verify which element is bigger;
//        h.     ‘s’: verify which element is smaller;

        switch(option)
        {
            case 'a' :
                System.out.println("Your result is:" + (A + B));
                break;
            case 'b' :
                System.out.println("Your result is:" + (A - B));
                break;
            case 'c' :
                System.out.println("Your result is:" + (A / B));
                break;
            case 'd' :
                System.out.println("Your result is:" + (A * B));
                break;
            case 'e' :
                System.out.println("Your result is:" + (A % B));
                break;
            case 'f' :
                System.out.println("First number is" + A);
                System.out.println("Second number is" + B);
                break;
            case 'g' :
                if (A > B) {
                    System.out.println(A + "is bigger than" + B);
                } else {
                    System.out.println(B + "is bigger than" + A);}
                break;
            case 'h' :
                if (A < B) {
                    System.out.println(A + "is smaller than" + B);
                } else {
                    System.out.println(B + "is smaller than" + A);}
                break;
            default :
                System.out.println("Enter a letter from a to h");
        }
    }
}

