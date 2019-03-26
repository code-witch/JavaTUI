package widgets;

import javafx.scene.layout.StackPane;

public abstract class Widget extends StackPane {
    private int x, y;

    public Widget(int x,int y) {
        setX(x);
        setY(y);
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

    @Override
    public String toString() {
        return "Widget{" +
                "x=" + getX() +
                ", y=" + getY() +
                '}';
    }
}
