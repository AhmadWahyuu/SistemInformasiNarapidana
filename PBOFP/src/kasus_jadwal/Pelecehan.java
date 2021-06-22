package kasus_jadwal;
/*
    *@author Fatwa Zuhri
*/
public class Pelecehan extends Kasus{
    private final String umur;
    private String KPelecehan;
    public Pelecehan(String umur,String krb,String tmpt,String jmlh){
        super(krb,tmpt,jmlh);
        this.umur = umur;
    }
    
    String getUmur(){
        return this.umur;
    }
    public String getPelecehan(){
        String output = "Pelecehan";
        return output;
    }
    @Override
    public String getKasus(){
        this.KPelecehan = "\tPELECEHAN"
                + "\nPelecehan seksual adalah tindakan seksual melalui sentuhan fisik atau non-fisik dengan sasaran organ seksual atau seksualitasi dari korban"
                + "\nNama korban : "+this.getKorban()
                + "\nJumlah Kasus : "+this.getJumlah()
                + "\nTempat penangkapan : "+this.getTempat()
                + "\nUmur korban: "+this.getUmur()
                + "\nMasa hukuman percobaan : 3 Tahun penjara";
        return this.KPelecehan;
    }
}
