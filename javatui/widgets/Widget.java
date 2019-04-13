package widgets;

import javafx.scene.Node;
import javafx.scene.layout.StackPane;


public abstract class Widget<T extends Node> extends StackPane {
    private int x, y;
    private T host;

    public Widget(int x,int y, T host) {
        setX(x);
        setY(y);
        setHost(host);

    }

    protected void setX(int x) {
        this.x = x;
    }

    protected void setY(int y) {
        this.y = y;
    }

    protected int getX() {
        return x;
    }

    protected int getY() {
        return y;
    }

    protected T getHost(){
        return host;
    }

    protected void setHost(T host){
        this.host = host;
        this.getChildren().add(host);

    }

    @Override
    public String toString() {
        return "Widget{" +
                "x=" + getX() +
                ", y=" + getY() +
                '}';
    }
}
