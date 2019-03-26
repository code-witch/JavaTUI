package events;

import controller.App;
import javafx.event.EventHandler;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.*;
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
    // private int yAmount = 0;
    private int xAmount = 0;

    @Override
    public void handle(KeyEvent keyEvent) {
        System.out.println(keyEvent.getCode().getName());
        if (keyEvent.getCode() == KeyCode.P) { // Spawn Widget Right
            xAmount++;
            StackPane sp = new StackPane();
            sp.setStyle(
                    String.format("-fx-background-color: rgb(%02d, %02d, %02d);",
                            new Random().nextInt(256),
                            new Random().nextInt(256),
                            new Random().nextInt(256)));
            App.root.getChildren().add(sp);
            for(Node n : App.root.getChildren()){
                if(n instanceof StackPane){
                    ((StackPane)n).setMinSize(App.scene.getWidth() / xAmount, App.scene.getHeight());
                }
            }
        } else if (keyEvent.getCode() == KeyCode.U) { // Delete Widget Left
            App.root.getChildren().remove(App.root.getChildren().size() - 1);
            xAmount--;
            for(Node n : App.root.getChildren()){
                if(n instanceof StackPane){
                    ((StackPane)n).setMinSize(App.scene.getWidth() /xAmount, App.scene.getHeight());
                }
            }
        } else if (keyEvent.getCode() == KeyCode.I) { // Spawn Widget Down

        } else if (keyEvent.getCode() == KeyCode.O) { // Delete Widget Up

        }
    }

}
