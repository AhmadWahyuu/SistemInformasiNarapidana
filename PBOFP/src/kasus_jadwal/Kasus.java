package kasus_jadwal;
public abstract class Kasus {
    public String korban,tempat,jumlah;
    public Kasus(String krb,String tmpt,String jmlh){
        this.korban = krb;
        this.tempat = tmpt;
        this.jumlah = jmlh;
    }
    String getKorban(){
        return this.korban;
    }
    
    String getJumlah(){
        return this.jumlah;
    }
    
    String getTempat(){
        return this.tempat;
    }
    
    abstract public String getKasus();
}
