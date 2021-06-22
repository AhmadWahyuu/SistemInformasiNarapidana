package kasus_jadwal;
/*
    author fatwa zuhri 
*/
public class Korupsi extends Kasus{
    private String jabatan,KKorupsi;
    public Korupsi(String jabatan,String krb,String tmpt,String jmlh){
        super(krb,tmpt,jmlh);
        this.jabatan = jabatan;
    }
    
    String getJabatan(){
        return this.jabatan;
    }
    public String getKorupsi(){
        String output = "Korupsi";
        return output;
    }
    @Override
    public String getKasus(){
        this.KKorupsi = "\tKORUPSI\nKorupsi atau korupsi politis adalah penyalah gunaan jabatan resmi untuk keuntungan pribadi\nInstansi yang dirugikan : "+this.getKorban()+ "\nJumlah uang yang dikorupsi : "+this.getJumlah()
                + "\nTempat Penangkapan : "+this.getTempat()
                + "\nJabatan : "+this.getJabatan()
                + "\nMasa hukuman : 4 - 20 tahun penjara dan denda Rp.200jt - Rp.1 miliar";
        return this.KKorupsi;
    }
}
