package widgets;

public class TerminalWidget extends Widget {

    public TerminalWidget(int x, int y) {
        super(x,y);
    }

    @Override
    public String toString() {
        return "TerminalWidget{" +
                "x=" + getX() +
                ", y=" + getY() +
                '}';
    }
}
