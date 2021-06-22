package pekerjaan_lapas;
import java.util.ArrayList;
/**
 * @author ARUL
 */
public abstract class Pekerjaan{
     //inisialisasi Array List
    public ArrayList<String> kerjaan = new ArrayList<>();
    //abstract class
    public String readPekerjaan(int id,ArrayList data){
        kerjaan =  data;
        String output = kerjaan.get(id);
        return output;
    }
    abstract public String getpekerjaan();
}
