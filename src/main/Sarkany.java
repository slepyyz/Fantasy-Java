package main;

public class Sarkany {

    private int eletpont;
    private String elem;
    private int meret;
    
    public Sarkany(int hp, String elem, int meret){
        this.eletpont = hp;
        this.elem = elem;
        this.meret = meret;
    }
    
    //setterek
    public void setElet(int eletpont){
        this.eletpont= eletpont;
    }
    public void setElem(String elem){
        this.elem= elem;
    }
    public void setMeret(int meret){
        this.meret= meret;
    }
    
    //getterek
    public int getElet(){
        return this.eletpont;
    }
    public String getElem(){
        return this.elem;
    }
    public int getMeret(){
        return this.meret;
    }

    
    public void etetes(){
        meret+= 100;
    }
    
    public void varazslas(String kivantElem){
        this.elem=kivantElem;
    }
    
}
