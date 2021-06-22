package pekerjaan_lapas;
/**
 * @author ARUL
 */
public class Builder extends Pekerjaan{
    private final String tempatbuilder;
    public Builder(String tempatbuilder){
        this.tempatbuilder = tempatbuilder;
    }
    String gettempatbuilder(){
        return this.tempatbuilder;
    }
    public String getBuilder(){
        String output = "Builder";
        return output;
    }
    @Override
    public String getpekerjaan() {
        String output = "\n\tPekerjaan Builder\nBuilder'atau biasa disebut dengan kuli/pekerja bangunan' merupakan orang yang bekerja dengan menggunakan kekuatan fisiknya\nDitempatkan pada : " +gettempatbuilder();
        return output;
    }   
    
}
