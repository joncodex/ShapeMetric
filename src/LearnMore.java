
public class LearnMore extends ShapeOperation {
    public static boolean learnMoreStatus = false;

    LearnMore()  {
            if (yesNoQuestion("Do you want to learn more about other shapes?")) {
                learnMoreStatus = true;
                System.out.println("Please select the shape you want to learn about");
            } else {
                learnMoreStatus = false;
                System.out.println("Thank you for your time");
                System.exit(0);
            }
    }
}
