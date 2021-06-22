package kasus_jadwal;
/*
    *@author Fatwa Zuhri
*/
public class Pembunuhan extends Kasus{
    private final String alat;
    private String KPembunuhan;
    public Pembunuhan(String alat,String krb,String tmpt,String jmlh){
        super(krb,tmpt,jmlh);
        this.alat = alat;
    }
    
    String getAlat(){
        return this.alat;
    }
    public String getPembunuhan(){
        String output = "Pembunuhan";
        return output;
    }
    @Override
    public String getKasus(){
        this.KPembunuhan = "\tPEMBUNUHAN"
                + "\nPembunuhan adalah suatu tindakan untuk menghilangkan nyawa seseorang dengan cara yang melanggar hukum, maupun yang tidak melawan hukum"
                + "\nNama korban : "+this.getKorban()
                + "\nJumlah Kasus : "+this.getJumlah()
                + "\nTempat penangkapan: "+this.getTempat()
                + "\nAlat : "+this.getAlat()
                + "\nMasa hukuman paling lama : 15 Tahun penjara";
        return this.KPembunuhan;
    }
}
