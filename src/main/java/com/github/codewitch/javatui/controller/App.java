package com.github.codewitch.javatui.controller;


import com.github.codewitch.javatui.commands.CommandUtil;
import com.github.codewitch.javatui.commands.SpawnWidgetCommand;
import com.github.codewitch.javatui.events.WidgetAdd;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public final class App extends Application {

    public static final HBox root = new HBox();
    public static final Scene scene = new Scene(root);

    @Override
    public void init() {
        scene.setFill(Color.BLACK);
//        scene.getStylesheets().add("");
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

    private void prepareCommands() {
        CommandUtil.COMMAND_PROCESSOR.registerCommand(new SpawnWidgetCommand()); // commands must be registered to the processor.
    }


}
