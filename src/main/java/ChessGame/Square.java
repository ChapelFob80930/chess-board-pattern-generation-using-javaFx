package ChessGame;

import javafx.scene.layout.StackPane;

public class Square extends StackPane {
    int x,y;
    boolean occupied;
    String name;

    public Square(int x,int y){
        this.x=x;
        this.y=y;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
