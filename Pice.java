package Pices;

public abstract class Pice {
    String sign;
    String pos;
    boolean white;

    Pice(String sign, String pos, boolean white){
        this.pos = pos;
        this.sign = sign;
        this.white = white;
    }

    public void setPos(String pos) { this.pos = pos; }
    public String getSign() { return sign; }
    public String getPos() {  return pos;  }
    boolean isWhite()   {  return white; }

}
