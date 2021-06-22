package pekerjaan_lapas;
/**
 *
 * @author ARUL
 */
public class Pemadam_Kebakaran extends Pekerjaan{
    private final String tempatpemadamkebakaran;
    public Pemadam_Kebakaran(String tempatpemadamkebakaran){
        this.tempatpemadamkebakaran = tempatpemadamkebakaran;
    }
    public String gettempatpemadamkebakaran(){
        return this.tempatpemadamkebakaran;
    }
    public String getPemadam(){
        String output = "Pemadam Kebakaran";
        return output;
    }
    @Override
    public String getpekerjaan() {
        String output = "\n\tPekerjaan Pemadam Kebakaran\nPemadam Kebakaran merupakan orang atau pasukan yang bertugas memadamkan kebakaran, melakukan penyelamatan, dan menanggulangi bencana atau kejadian lainya\nDitempatkan pada : " +gettempatpemadamkebakaran();
        return output;
    } 
}
