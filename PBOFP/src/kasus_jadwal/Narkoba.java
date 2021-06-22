package kasus_jadwal;
/*
    *@author Fatwa Zuhri
*/
public class Narkoba extends Kasus{
    private final String jenis;
    private String KNarkoba;
    public Narkoba(String jenis,String krb,String tmpt,String jmlh){
        super(krb,tmpt,jmlh);
        this.jenis = jenis;
    }
    
    String getJenis(){
        return this.jenis;
    }
    public String getNarkoba(){
        String output = "Narkoba";
        return output;
    }
    @Override
    public String getKasus(){
        this.KNarkoba = "\tNARKOBA"
                + "\nNarkoba adalah singkatan dari narkotika, psikotropika, dan obat terlarang"
                + "\nKeterlibatan : "+this.getKorban()
                + "\nberat barang bukti : "+this.getJumlah()
                + "\nTempat penangkapan: "+this.getTempat()
                + "\nJenis Narkoba : "+this.getJenis()
                + "\nMasa hukuman pecandu : Rehabilitasi"
                + "\nMasa hukuman pengedar : 6 tahun - hukuman mati";
        return this.KNarkoba;
    }
}
