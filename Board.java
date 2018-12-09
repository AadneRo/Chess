import javafx.scene.layout.GridPane;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Board {
    Square[][] ruter;
    public int antX, antY;

    Board(Square[][] r){
        this.ruter = r;
        this.skrivUtLab();
    }

    private void skrivUtLab(){
        for (Square[] aRuter : ruter) {
            for (Square anARuter : aRuter) {
                System.out.print(anARuter.getSign());
            }
            System.out.println();
        }
    }
    public static Board lesFraFil(File fil,GridPane rutenett, Vindu.Klikkbehandler klikk) throws FileNotFoundException {
        Scanner sc = new Scanner(fil); // scanner filen
        Square[][] ruter = new Square[8][8];
        String[] allS = new String[36];

        while(sc.hasNextLine()) {
            char[] symboler = sc.nextLine().toCharArray();
            for(char symbol : symboler) {
                 // legger alle symbolene til i en liste som senere legges til i 2d liste
            }
        }
        sc.close();
        int tX = 0;
        int tY = 0;


        for (int i = 0; i < labSym.stoerrelse(); i++){ // lager alle rutene utifra listen med symbolene.




            ruter[tY][tX].setOnAction(klikk);

            if (tX < x-1){ tX++; }
            else { tX = 0; tY++; }

        }
        Board b = new Board(ruter);
        return b;
    }
}

