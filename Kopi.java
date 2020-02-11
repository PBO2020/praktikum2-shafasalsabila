
package kopi;
import java.util.ArrayList;
import java.util.Scanner;
public class Kopi {

    public static void main(String[] args) {
        
        ArrayList<String> kopi   = new ArrayList<>();
        ArrayList<String> topping = new ArrayList<>();
        ArrayList<String> asalKopi = new ArrayList<>();
        
        mesinKopi robusta = new mesinKopi();
        robusta.setJenisKopi("Robusta");
        robusta.setasalKopi("Eropa");
        kopi.add(robusta.getJenisKopi());
        asalKopi.add(robusta.getasalKopi());

        mesinKopi florest = new mesinKopi();
        florest.setJenisKopi("Florest");
        florest.setasalKopi("Asia");
        kopi.add(florest.getJenisKopi());
        asalKopi.add(robusta.getasalKopi());

        mesinKopi arabica = new mesinKopi();
        arabica.setJenisKopi("Arabica");
        arabica.setasalKopi("Timur Tengah");
        kopi.add(arabica.getJenisKopi());
        asalKopi.add(robusta.getasalKopi());

        robusta.setTopping("Cream");
        topping.add(robusta.getTopping());
        robusta.setTopping("gula");
        topping.add(robusta.getTopping());
        
        for(int i=0; i< kopi.size();i++){
            int j= i+1;                                  
            System.out.println("Pilihan kopi adalah"+j+" "+kopi.get(i));
        }
       
        for(int i=0; i< topping.size();i++){
            int j= i+1;
            System.out.println("Pilihan topping adalah"+j+" "+topping.get(i));
        }
        
        try{
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Masukan kopi yang mau dipilih ");
        int pilihanKopi = keyboard.nextInt() -1;
        int pilihantopping = keyboard.nextInt() -1; 
        
        System.out.println("Pesanan anda adalah kopi" + kopi.get(pilihanKopi)+" yang berasal dari " + asalKopi.get(pilihanKopi)+ " dengan topping" + topping.get(pilihantopping));
        } catch (Exception E){
            System.out.println("");
            System.out.println(E + "\n");
        }
        
    }
}
    

    
    

