import java.util.Scanner;

public class Test {
    static float number=5;
    static float result;
    static String name;
    static String Department;
    static int age;

    public void Question(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your name : ");
        name = in.nextLine();
        System.out.println("Enter your department : ");
        Department = in.nextLine();
        System.out.println("Enter your age : ");
        age = in.nextInt();
        if (age < 18){
            System.out.println("You have no entry ");
            Question();
        }
        else
            System.out.println("Thank you , you are allowed to do the exam ");
            set();
    }

    public static void set(){
        System.out.println("Who is the present prime minister of Bangladesh ? ");
        System.out.println("A-khaleda zia\n"+ "B-sheikh hasina\n"+"C-Hussain Mohammad ershad\n"+"D-joshimuddin\n");
        Scanner sc = new Scanner(System.in);
        String ans;
        ans = sc.nextLine();
        if (ans.equals("B")){
            System.out.println("correct ans you have got 5 points ");
            result = number+result;
            System.out.println("your current point is "+result);
            System.out.println("International mother language day ? ");
            System.out.println("A-22 june\n"+"B-3 august\n"+"C-21 february\n"+"D-8 march");
            ans = sc.nextLine();
            if (ans.equals("C")){
                System.out.println("correct ans you have got 5 points ");
                result = result+number;
                System.out.println("your current point is "+result);
            }

            else result = result - number;
            System.out.println("your point is "+result);
        }
        else {
            result = number-5;
            System.out.println("sorry you lost 5 points ");
            System.out.println("Your point is "+result);
            set();
        }
    }
}
