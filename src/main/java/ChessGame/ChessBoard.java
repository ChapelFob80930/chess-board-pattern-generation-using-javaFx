package ChessGame;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

import java.util.ArrayList;

public class ChessBoard extends Application {

    //public ArrayList<Square> squares=new ArrayList<Square>();


    @Override
    public void start(Stage stage) throws Exception {
        GridPane chessBoard = new GridPane();
        Color color=Color.WHITE;
        for(int i=0;i<63;i++){
            for(int j=0;j<63;j++){
                Rectangle square= new Rectangle(i,j);
                square.setHeight(100);
                square.setWidth(100);
                square.setFill(color);
                if(color==Color.WHITE){
                    color=Color.BLACK;
                }
                else
                {
                    color=Color.WHITE;
                }
                //Background colour= new Background( );
                chessBoard.add(square,i,j);
            }
        }
        Scene scene = new Scene(chessBoard,500,500);
        stage.setTitle("ChessBoard");
        stage.setScene(scene);
        stage.show();
    }


    public static void main(String[] args){
        launch();
    }


}



