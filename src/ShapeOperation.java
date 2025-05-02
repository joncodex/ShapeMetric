import java.util.Scanner;

public class ShapeOperation extends RadioListener {

    public void shapeOperation(){

        EnumList enumList = EnumList.getShape(actionSource);
        System.out.println(enumList.shapeName());
        System.out.println(enumList.description());
//        System.out.println("Picture");

//        DO YOU WANT TO CALCULATE THE AREA OF THE SHAPE?
        if (yesNoQuestion("Would you want to calculate the area of a " + actionSource + "? Please input 'Y' for Yes or 'N' for No")){
            Area area = new Area(actionSource);
        }
//        DO YOU WANT TO CALCULATE THE PERIMETER OF THE SHAPE?
        if(yesNoQuestion("Would you want to calculate the perimeter of a " + actionSource + "? Please input 'Y' for Yes or 'N' for No")){
            Perimeter perimeter = new Perimeter(actionSource);
        }

//        Once shapeOperation is done, call the learnmore method
        new LearnMore();
    }

    public static boolean yesNoQuestion(String question){

        Scanner Yes_No = new Scanner(System.in);
        String yesno;
        boolean BooleanValue ;
        while (true) {
            System.out.println(question);
            yesno = Yes_No.next().substring(0,1);
            if(yesno.equalsIgnoreCase("y"))
            {
                BooleanValue = true;
                break;
            } else if (yesno.equalsIgnoreCase("n")) {
                BooleanValue = false;
                break;
            } else {
                System.out.println("please input the right character: Y or N");
            }
        }
        return  BooleanValue;
    }
}
