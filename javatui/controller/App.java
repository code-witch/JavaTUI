package controller;

import events.*;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public final class App extends Application {
    public static final HBox root = new HBox();
    public static final Scene scene = new Scene(root);


    @Override
    public void init() {
        // Put more init stuff here if need be.
        System.out.println("Initialization Completed");
    }


    @Override
    public void start(Stage stage) {
        // There's got to be a cleaner way..
        scene.addEventFilter(KeyEvent.KEY_PRESSED, new WidgetAdd());

        stage.setTitle("JavaTUI");
        stage.setScene(scene);
        stage.show();
    }



}
