import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InputOutput {
    
    static Scanner sc;
    static FileWriter wr;
    
    final static String FILE_TO_READ = "items.txt";
    final static String FILE_TO_WRITE = "basket.txt";
    
    public List<Item> readItems(){
        List<Item> items = new ArrayList();
        try{
            sc = new Scanner(new FileReader(new File(FILE_TO_READ)));
            while(sc.hasNext()){
                String megnevezes;
                String tipus;
                int ar;
                int gyartasiEv;
            
                String egyed = sc.nextLine();
                
                String sor[] = egyed.split(";");
                                
                Item anItem = new Item(sor[0],sor[1],Integer.parseInt(sor[2]),Integer.parseInt(sor[3]));
                
                items.add(anItem);
            }
            sc.close();
        }
        catch(FileNotFoundException ex){
            System.out.println("Nem található a fájl");
        } 
        return items;
    }
    
    public void writeBasket(Basket aBasket){
        try{
            wr =  new FileWriter(FILE_TO_WRITE);
            for(int i=0; i<aBasket.getBasketSize(); i++){
                wr.write(aBasket.getAnItem(aBasket,i).getName() + ";" + aBasket.getAnItem(aBasket,i).getType() + ";"
                        + aBasket.getAnItem(aBasket,i).getPrice() + ";" + aBasket.getAnItem(aBasket,i).getYearOfProduction() + "\n");
            }
            wr.close();
            
        }
        catch(IOException|NullPointerException ex){
            System.out.println("Nem található a fájl");
        }
    }
}
