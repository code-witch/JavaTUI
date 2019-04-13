package commands;

import widgets.Widget;

public class SpawnWidget extends Command {
    private int x, y;
    private Widget widget;

    public SpawnWidget(int x, int y, Widget widget) {
        setX(x);
        setY(y);
        setWidget(widget);
    }

    @Override
    public void run() {

    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Widget getWidget() {
        return widget;
    }

    public void setWidget(Widget widget) {
        this.widget = widget;
    }
}
