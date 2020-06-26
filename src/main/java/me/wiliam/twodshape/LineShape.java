package me.wiliam.twodshape;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

public class LineShape extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("2D图形展示");
        Group root = new Group();
        //直线
        Line line =new Line();
        line.setStartX (150.0f);
        line.setStartY(140.0f);
        line.setEndX(450.0f);
        line.setEndY(140.0f);

        root.getChildren().add(line);

        //竖线
        Line shuxian =new Line();
        shuxian.setStartX (180.0f);
        shuxian.setStartY(140.0f);
        shuxian.setEndX(180.0f);
        shuxian.setEndY(280.0f);
        root.getChildren().add(shuxian);

        Scene scene = new Scene(root,600,300);
        primaryStage.setScene(scene);
        primaryStage.show();

    }
}
