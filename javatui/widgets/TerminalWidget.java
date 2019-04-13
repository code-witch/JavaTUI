package widgets;


import javafx.scene.control.TextArea;

public class TerminalWidget extends Widget<TextArea> {

    public TerminalWidget(int x,int y) {
        super(x,y, new TextArea());
        getHost().setEditable(false);
    }

    @Override
    public String toString() {
        return "TerminalWidget{" +
                "x=" + getX() +
                ", y=" + getY() +
                '}';
    }
}
