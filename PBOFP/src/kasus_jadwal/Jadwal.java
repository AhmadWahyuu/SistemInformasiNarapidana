package kasus_jadwal;
/*
    *@author Fatwa Zuhri
*/
public class Jadwal {
    private String jadwal; 
    public String getJadwal(){
        this.jadwal = "05.00 - 06.00 : Bangun tidur dan Membersihkan tempat tidur"
                + "\n06.00 – 07.00 : Olahraga dan mandi"
                + "\n07.00 – 08.00 : Sarapan pagi"
                + "\n08.00 – 11.00 : Bekerja "
                + "\n11.00 – 11.45 : Istirahat "
                + "\n11.45 – 12.30 : Sholat dhuhur berjamaah (Jika muslim)"
                + "\n12.30 – 13.00 : Makan siang"
                + "\n13.00 – 14.00 : Melanjutkan Pekerjaan"
                + "\n14.30 – 15.30 : Sholat ashar berjamaah (Jika muslim)"
                + "\n15.30 – 16.30 : Makan Sore"
                + "\n16.30 – 17.00 : Istirahat"
                + "\n17.00 – 21.00 : Masuk kamar dan di lanjutkan dengan kegiatan keagamaan"
                + "\n21.00 – 05.00 : Istirahat di lanjutkan dengan Tidur";
        return this.jadwal;
    }
}
