import java.util.concurrent.CountDownLatch;

public class LearnMore extends ShapeOperation {

    public static CountDownLatch latch = new CountDownLatch(1);
    public static boolean learnMoreStatus = false;

    LearnMore()  {
            if (yesNoQuestion("Do you want to learn more about other shapes?")) {
                learnMoreStatus = true;
                System.out.println("Please select the shape you want to learn about");
            } else {
                learnMoreStatus = false;
                latch.countDown();
            }
    }
}
