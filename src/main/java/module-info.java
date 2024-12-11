module org.cosmos.chess_game {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.cosmos.chess_game to javafx.fxml;
    exports org.cosmos.chess_game;
    exports ChessGame;
}