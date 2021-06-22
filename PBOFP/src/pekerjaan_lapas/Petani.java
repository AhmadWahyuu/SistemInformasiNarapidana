package pekerjaan_lapas;
/**
 *
 * @author ARUL
 */
public class Petani extends Pekerjaan {
      
    private final String tempatpetani;
    
    public Petani(String tempatpetani){
        this.tempatpetani = tempatpetani;
    }
    
    public String gettempatpetani(){
        return this.tempatpetani;
    }
    public String getPetani(){
        String output = "Petani";
        return output;
    }
    @Override
    public String getpekerjaan() {
        String output = "\n\tPekerjaan Petani\nPetani merupakan seseorang yang bergerak di bidang pertanian, utamanya dengan cara melakukan pengelolaan tanah dengan tujuan untuk menumbuhkan dan memelihara tanaman\nDitempatkan pada : " +gettempatpetani();
        return output;
    } 
    
}
