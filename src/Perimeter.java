
public class Perimeter {
    String name = Welcome.inputName();

    Perimeter(String shapeName){

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

    public void Circle(){
        double radius = Area.getNumValue("what is the radius of the circle?");
        double Perimeter =  (2 * radius * Math.PI);
        System.out.printf("The Perimeter of the circle is %,02.2f\n", Perimeter);
    }

    public void Triangle(){
        double a = Area.getNumValue("what is the breadth of the triangle?");
        double b = Area.getNumValue("what is the value of the right side  of the triangle?");
        double c = Area.getNumValue("what is the value of the left side  of the triangle?");
        double Perimeter = a + b + c;
        System.out.printf("The Perimeter of the Triangle is %,02.2f\n", Perimeter);
    }

    public void Rectangle(){
        double w = Area.getNumValue("what is the width of the rectangle?");
        double l = Area.getNumValue("what is the length of the rectangle?");
        double Perimeter = 2 * (w * l);
        System.out.printf("The Perimeter of the Rectangle is %,02.2f\n", Perimeter);
}

    public void Square(){
        double b = Area.getNumValue("what is the breadth of the square?");
        double Perimeter = 4 * b;
        System.out.printf("The Perimeter of the circle is %,02.2f\n", Perimeter);
    }
}
