package com.github.codewitch.javatui.events;

import com.github.codewitch.javatui.controller.App;
import com.github.codewitch.javatui.widgets.TerminalWidget;
import com.github.codewitch.javatui.widgets.Widget;
import javafx.event.EventHandler;
import javafx.scene.control.TextArea;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.*;
import javafx.scene.Node;

import java.util.Random;

/**
 *   UIOP to spawn widgets
 *   u = left
 *   i = down
 *   o = up
 *   p = right
 */
public class WidgetAdd implements EventHandler<KeyEvent> {

    // Find better way of doing this, maybe each widget has x,y associated with it?
    private int yAmount = 0;
    private int xAmount = 0;

    @Override
    public void handle(KeyEvent keyEvent) {
        // Debug Stuffs
        debug();

        System.out.println(keyEvent.getCode().getName());
        if (keyEvent.getCode() == KeyCode.P) { // Spawn Widget Right
            xAmount++;
            Widget terminalWidget = new TerminalWidget(xAmount,yAmount);
            terminalWidget.setStyle(
                    String.format("-fx-background-color: rgb(%02d, %02d, %02d);",
                            new Random().nextInt(256),
                            new Random().nextInt(256),
                            new Random().nextInt(256)));
            App.root.getChildren().add(terminalWidget);
            for(Node n : App.root.getChildren()){
                if(n instanceof Widget){
                    ((Widget)n).setMinSize(App.scene.getWidth() / xAmount, App.scene.getHeight());
                }
            }
        } else if (keyEvent.getCode() == KeyCode.U) { // Delete Widget Left
            App.root.getChildren().remove(App.root.getChildren().size() - 1);
            xAmount--;
            for(Node n : App.root.getChildren()){
                if(n instanceof Widget){
                    ((Widget)n).setMinSize(App.scene.getWidth() /xAmount, App.scene.getHeight());
                }
            }
        } else if (keyEvent.getCode() == KeyCode.I) { // Spawn Widget Down

        } else if (keyEvent.getCode() == KeyCode.O) { // Delete Widget Up

        }
        else if(keyEvent.getCode() == KeyCode.E) {
            for(Node n : App.root.getChildren()) {
                if(n instanceof Widget) {
                    Widget w = (Widget) n;
                    if(w.getHost().isFocused()){
                    ((TextArea) ((Widget)n).getHost()).setEditable(true);
                    }
                }
            }
        }
        else if(keyEvent.getCode() == KeyCode.ESCAPE) {
            for(Node n : App.root.getChildren()) {
                if(n instanceof Widget) {
                    Widget w = (Widget) n;
                    if(w.getHost().isFocused()){
                        ((TextArea) ((Widget)n).getHost()).setEditable(false);
                    }
                }
            }
        }
    }

    private void debug(){
        if(xAmount == 5){
            for(Node n: App.root.getChildren()){
                System.out.println(n);
            }
        }
    }

}
