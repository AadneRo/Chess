import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.File;

public class Vindu extends Application {
    Board board;



    public Klikkbehandler klikk;


    public static void main(String[] args){ launch(args);}

    public void printBoardState(){
        for (Square[] p : board)
            for (Square c : p){
                System.out.println(c.getSign());
            }
        System.out.println();
    }


    @Override
    public void start(Stage teater) {
        klikk = new Klikkbehandler();

        File file = new FileChooser().showOpenDialog(teater);
        try {
            board = Board.lesFraFil(file, board, klikk);
        }
        catch (Exception e){ }


        Text losninger = new Text(10, 10,  "Lsninger: --");
        losninger.setFont(new Font(20));


        Group gr = new Group();

        Pane kulisser = new Pane(board);

        gr.getChildren().add(kulisser);

        Scene scene = new Scene(gr);

        scene.getStylesheets().add
                (Vindu.class.getResource("Pynt.css").toExternalForm());

        teater.setTitle("Labyrint");
        teater.setScene(scene);
        teater.show();

    }
    class Klikkbehandler implements EventHandler<javafx.event.ActionEvent> {

        @Override
        public void handle(javafx.event.ActionEvent event) {

        }
    }

}
