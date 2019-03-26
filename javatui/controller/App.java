package controller;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public final class App extends Application {
    public final VBox root = new VBox();
    public final Scene scene = new Scene(root);

    @Override
    public void init() {

    }


    @Override
    public void start(Stage stage) {



        stage.setTitle("JavaTUI");
        stage.setScene(scene);
        stage.show();
    }

}
