package pekerjaan_lapas;

/**
 *
 * @author ARUL
 */
public class Programmer extends Pekerjaan{

    private final String tempatprogrammer;
    
    public Programmer(String tempatprogrammer){
        this.tempatprogrammer = tempatprogrammer;
    }
    
    public String gettempatprogrammer(){
        return this.tempatprogrammer;
    }
    public String getProgramer(){
        String output = "Programmer";
        return output;
    }
    @Override
    public String getpekerjaan() {
        String output = "\n\tPekerjaan Programmer\nProgrammer merupakan profesi yang menulis program menggunakan bahasa pemrograman\nDitempatkan pada : " +gettempatprogrammer();
        return output;
    } 
    
}
