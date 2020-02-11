
package kopi;

public class mesinKopi {

    static String get(String asal) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    static String get(int pilihanasal) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    private String JenisKopi;
    private String Topping;
    private String asalKopi;

    public String getJenisKopi(){
        return JenisKopi;
    }
    public void setJenisKopi(String JenisKopi){
        this.JenisKopi=JenisKopi;
    }
    public String getTopping(){
        return Topping;
    }
    public void setTopping(String Topping){

        this.Topping=Topping;
    }
     public String getasalKopi(){
        return asalKopi;
    }
    public void setasalKopi(String asalKopi){
        this.asalKopi=asalKopi;
    }  
}

