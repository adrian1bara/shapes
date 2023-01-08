package com.example.demo;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import shapes.*;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        MyBagOfShapes mbs = new MyBagOfShapes();
        MyCircle circle1 = new MyCircle(new MyPoint(300,300), 100);
        MyRectangle myr1 = new MyRectangle(new MyPoint(30,700), 50, 100);
        MyRectangle myr2 = new MyRectangle(new MyPoint(450,500), 150, 40);


        mbs.addShape(circle1);
        mbs.addShape(myr1);
        mbs.addShape(myr2);

        drawShapeInJavaFx(mbs, stage);


    }
private void drawShapeInJavaFx (MyBagOfShapes mbs, Stage stage){
        Group group=new Group();

        //aici trebuie sa lucrez eu cu mbs in context cu javafx

    MyShape[] shape = mbs.getShapes();
    for(int i = 0;i<shape.length;i++){
        if(shape[i] instanceof MyCircle){
            Circle circle = new Circle();
            circle.setCenterX(((MyCircle) shape[i]).getCenter().getX());
            circle.setCenterY(((MyCircle) shape[i]).getCenter().getY());
            circle.setRadius(((MyCircle) shape[i]).getRadius());
            group.getChildren().add(circle); //asta de pe net

        }
        else
            if(shape[i] instanceof MyRectangle){
                Rectangle rectangle = new Rectangle();
                rectangle.setX(((MyRectangle) shape[i]).getStart().getX());
                rectangle.setY(((MyRectangle) shape[i]).getStart().getY());
                rectangle.setWidth(((MyRectangle) shape[i]).getWidth());
                rectangle.setHeight(((MyRectangle) shape[i]).getHeight());

                group.getChildren().add(rectangle); //asta de pe net


            }
    }

    //set scene
        Scene scene = new Scene(group,1000,1000);
        stage.setScene(scene);
        stage.show();
}
    public static void main(String[] args) {
        launch();
    }
}