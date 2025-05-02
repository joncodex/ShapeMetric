import java.util.Scanner;

public class Area {
    String name = Welcome.inputName();

    Area(String shapeName){

        switch(shapeName){
            case "Circle":
                Circle();
                break;

            case "Triangle":
                Triangle();
                break;

            case "Rectangle":
                Rectangle();
                break;

            case "Square":
                Square();
                break;

            default:
                System.out.println("Invalid Choice");
        }

    }

//    Circle Method
    public void Circle(){
        double radius = getNumValue("what is the radius of the circle?");
        double Area =  (radius * radius * Math.PI);
        System.out.printf("The area of the circle is %,02.2f\n", Area);
    }

//    triangle method
    public void Triangle(){
        double b = getNumValue("what is the breath of the triangle?");
        double h = getNumValue("what is the height of the triangle?");
        double Area = ((double) 1 / 2) * b * h;
        System.out.printf("The area of the triangle is %,02.2f\n", Area);
    }

//    Rectangle method
    public void Rectangle(){
        double w = getNumValue("what is the width of the rectangle?");
        double l = getNumValue("what is the length of the rectangle?");
        double Area = w * l;
        System.out.printf("The area of the rectangle is %,02.2f\n", Area);
    }

//    Square Method
    public void Square(){
        double b = getNumValue("what is the breadth of the square?");
        double Area = b * b;
        System.out.printf("The area of the square is %,02.2f\n", Area);
    }

    public static Double getNumValue(String outPut){
        Double number;

        while (true){
            System.out.println(outPut);
            Scanner scan = new Scanner(System.in);
            try {
                number = scan.nextDouble();
                break;
            }
            catch (Exception e) {
                System.out.println("Please input the right data");
            };
        }

        return number;
    }
}
