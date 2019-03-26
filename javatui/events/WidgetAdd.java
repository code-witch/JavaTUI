package events;

import controller.App;
import javafx.event.EventHandler;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.*;
import javafx.scene.Node;
import widgets.TerminalWidget;
import widgets.Widget;

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
            TerminalWidget terminalWidget = new TerminalWidget(xAmount,yAmount);
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
    }

    private void debug(){
        if(xAmount == 5){
            for(Node n: App.root.getChildren()){
                System.out.println(n);
            }
        }
    }

}
