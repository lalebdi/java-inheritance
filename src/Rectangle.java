public class Rectangle {
    double width;
    double length;

    public Rectangle(double width, double length) {

    }

    public static void Rectangle(double width, double length){
        if (width < 0){
            width = 0;
        }
        if (length < 0){
            length = 0;
        }
    }
    public double getWidth(){
        return width;
    }
    public  double getLength(){
        return length;
    }

    public double getArea(){
        return length * width;
    }
}
