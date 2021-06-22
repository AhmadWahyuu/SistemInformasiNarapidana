package kasus_jadwal;
/*
    *@author Fatwa Zuhri
*/
public class Pencuri extends Kasus{
    private final String barang;
    private String KPencuri;
    public Pencuri(String barang,String krb,String tmpt,String jmlh){
        super(krb,tmpt,jmlh);
        this.barang = barang;
    }
    
    String getBarang(){
        return this.barang;
    }
    public String getPencuri(){
        String output = "Pencuri";
        return output;
    }
    @Override
    public String getKasus(){
        this.KPencuri = "\tPENCURIAN"
                + "\nPencurian Adalah pengambilan properti milik orang lain secara tidak sah, tanpa seizin pemilik"
                + "\nKorban : "+this.getKorban()
                + "\nJumlah Kasus : "+this.getJumlah()
                + "\nTempat : "+this.getTempat()
                + "\nBarang : "+this.getBarang()
                + "\nMasa hukuman : 10 Tahun penjara";
        return this.KPencuri;
    }
}