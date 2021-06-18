public class Rectangle {

    private double width;
    private double length;

    public Rectangle(double width, double length) {
        this.width = width;
        if (width<0){
            int x = 0;
            this.width = x;
        }
        this.length = length;
        if(length<0){
            int y =0;
            this.length = y;
        }
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }
    public double getArea(){
        return (width*length);
    }
}
