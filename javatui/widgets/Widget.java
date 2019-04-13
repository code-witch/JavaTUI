package widgets;

import javafx.scene.Node;
import javafx.scene.layout.StackPane;


public abstract class Widget<T extends Node> extends StackPane {
    private int x, y;
    private T host; // i wanted to use parent, but that's taken by the StackPane already

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

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public T getHost(){
        return host;
    }

    protected void setHost(T host){
        this.host = host;
        this.getChildren().add(getHost());
    }

    @Override
    public String toString() {
        return "Widget{" +
                "x=" + getX() +
                ", y=" + getY() +
                '}';
    }
}
