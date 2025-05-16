public class TheEnd {


    TheEnd(){
        try {
            LearnMore.latch.await();
            System.out.println("Thank you for your time");
            System.out.println("This brings us to the end of our learning. Be good.");
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
