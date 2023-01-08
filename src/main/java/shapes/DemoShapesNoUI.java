package shapes;

public class DemoShapesNoUI {
    public static void main(String[] args) {

        MyBagOfShapes mbs = new MyBagOfShapes();
        MyCircle circle1 = new MyCircle(new MyPoint(300,300), 100);
        MyRectangle myr1 = new MyRectangle(new MyPoint(30,700), 50, 100);
        MyRectangle myr2 = new MyRectangle(new MyPoint(450,500), 150, 40);

        mbs.addShape(circle1);
        mbs.addShape(myr1);
        mbs.addShape(myr2);



    }

}
