import Pices.Pice;

public class Square {
    String pos;
    Pice pice;

    Square(String s){
        this.pos = s;
    }


    String getSign(){
        if (pice == null){
            return "   ";
        }else{
            return pice.getSign();
        }
    }

}
