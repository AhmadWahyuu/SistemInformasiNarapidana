package pekerjaan_lapas;
/**
 *
 * @author ARUL
 */
public class Juru_Masak extends Pekerjaan{

    
    private final String tempatjurumasak;
    
    public Juru_Masak(String tempatjurumasak){
        
        this.tempatjurumasak = tempatjurumasak;
    }
    public String gettempatjurumasak(){
        return this.tempatjurumasak;
    }
    public String getJuruMasak(){
        String output = "Juru Masak";
        return output;
    }
    @Override
    public String getpekerjaan() {
        String output = "\n\tPekerjaan Juru Masak\nJuru Masak merupakan orang yang menyiapkan makanan untuk disantap\nDitempatkan pada : " +gettempatjurumasak();
        return output;
    } 
}
