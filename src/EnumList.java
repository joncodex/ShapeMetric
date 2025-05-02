
enum EnumList {

    Circle (
            "Circle",
            "A circle is a two-dimensional, closed shape formed by a curved line where all points on the curve are equidistant from a fixed point called the center.\n"),

    Rectangle (
            "Rectangle",
            "Rectangular in shape. The basic formula for the area of a triangle is equal to half the product of its base and height, i.e., A = 1/2 × b × h.\n"),

    Triangle(
            "Triangle",
            "Triangular in shape"),

    Square (
            "Square",
            "Square in shape");

    private final String ShapeName;
    private final String Description;

    EnumList(String shapeName, String description ){

        ShapeName = shapeName;
        Description = description;
    }

    public String shapeName() {
        return ShapeName;
    }

    public String description() {
        return Description;
    }

    public static EnumList getShape(String shapeName) {
        return EnumList.valueOf(shapeName);
    }




}
