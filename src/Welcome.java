import java.util.Scanner;

public class Welcome {
    private static String inputName;

    Welcome() {
        System.out.printf("%s\n%s\n", "Hello User,", "Please what is your name?");
        Scanner scanner = new Scanner(System.in);
        this.inputName = scanner.next();
        System.out.printf("Hello %s, welcome to Shape Metrics.\nThis platform allows you to learn more about geometrical shapes and some basic calculations of their geometry.\n\n", inputName);
    }

    public static String inputName() {
        return inputName;
    }
}
