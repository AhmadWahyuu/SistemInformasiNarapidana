package narapidana_main;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;
import kasus_jadwal.*;
import pekerjaan_lapas.*;
/**
 *
 * @author ahmad
 */
public class PBOFP {
     //inisisalisasi array list untuk menyimpan identitas Narapidana
    static ArrayList<String> data = new ArrayList<>();
        //inisialisasi array list untuk menyimpan rincian kasus Narapidana
    static ArrayList<String> rckasus = new ArrayList<>();
        //inisialisasi array list untuk menyimpan rincian pekerjaan Narapidana
    static ArrayList<String> rcpekerjaan = new ArrayList<>();
    public static int[] kapasitas ={10,10,10,10,10};
    public static String input(int i,int a) throws IOException{
        //inisialisasi varible inputan dan kondisi pilihan user
        String nama,alamat,ttl,kerja = null,casus = null,lapas = null,narapidana,jeniskelamin;
        String tempat,korban,jmlh,barang,umur;
        //kondisi inputan user ketika memilih menu
        String pil1,pil2,pil3;
        //ini colletion untuk menerima inputan user,disini saya buat untuk inputan integer
        Scanner input = new Scanner(System.in);
        //ini colletion untuk menerima inputan user,disini saya buat untuk inputan String
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        //input data pribadi narapidana
        System.out.print("masukkan nama:");
        nama = br.readLine();
        System.out.print("masukkan jenis kelamin:");
        jeniskelamin = br.readLine();
        System.out.print("masukkan alamat:");
        alamat = br.readLine();
        System.out.print("masukkan tanggal lahir(DD/MM/YYYY):");
        ttl=br.readLine();
        System.out.print("masukkan umur:");
        umur=br.readLine();
        //inisialisasi kondisi dalam menu kasus
        int kasus=0;
        //inputan kasus
        while(kasus!=1){
        System.out.println("\t\t##Menu memasukkan kasus##");
        System.out.println("1.Korupsi\n2.Narkoba\n3.Pelecehan\n4.Pembunuhan\n5.Pencurian");
        System.out.print(">>>");
        pil3 = br.readLine();
        switch(pil3){
        //menu korupsi
        case "1":
            //inputan rincian Korupsi
            System.out.println("Kasus Korupsi");
            System.out.print("masukkan jabatan pelaku:");
            String jabatan = br.readLine();
            System.out.print("masukkan instansi yang dirugikan:");
            korban = br.readLine();
            System.out.print("masukkan tempat penangkapan:");
            tempat = br.readLine();
            System.out.print("masukkan barang bukti:");
            jmlh = br.readLine();
            //memanggil class Korupsi
            Korupsi kor = new Korupsi(jabatan,korban,tempat,jmlh);
            //menyimpan rincian di arraylist
            rckasus.add(kor.getKasus());
            //nama kasus di casus agar ditampilan hanya menampilkan jenis kasusnya saja
            casus = kor.getKorupsi();
            //kondisi dimana user telah input rincian kasus
            kasus = 1;
            break;
        //menu narkoba
        case "2":
            //inputan rincian Narkoba
            System.out.println("Kasus Narkoba");
            System.out.print("masukkan barang bukti(jenis):");
            barang = br.readLine();
            System.out.print("masukkan keterlibatan pelaku:");
            String keterlibatan = br.readLine();
            System.out.print("masukkan tempat penangkapan:");
            tempat = br.readLine();
            System.out.print("masukkan berat barang bukti:");
            jmlh = br.readLine();
            //memanggil Class Narkoba
            Narkoba nar = new Narkoba(barang,keterlibatan,tempat,jmlh);
            //menyimpan rincian kasus di arraylist
            rckasus.add(nar.getKasus());
            casus = nar.getNarkoba();
            kasus = 1;
            break;
        //menu pelecehan
        case "3":
            //inputan rincian Pelecehan
            System.out.println("Kasus Pelecehan");
            System.out.print("masukkan umur korban:");
            String umurkorban = br.readLine();
            System.out.print("masukkan korban pelecehan:");
            korban = br.readLine();
            System.out.print("masukkan tempat penangkapan:");
            tempat = br.readLine();
            System.out.print("masukkan pelaku melakukan sebanyak:");
            jmlh = br.readLine();
            //memanggil Class Pelecehan
            Pelecehan pel = new Pelecehan(umurkorban,korban,tempat,jmlh);
            //menyimpan rincian kasus di arraylist
            rckasus.add(pel.getKasus()); 
            casus = pel.getPelecehan();
            kasus = 1;
            break;
        //menu pembunuhan
        case "4":
            //inputan rincian Pembunuhan
            System.out.println("Kasus Pembunuhan");
            System.out.print("masukkan alat yang dipakai:");
            String alat = br.readLine();
            System.out.print("masukkan nama korban:");
            korban = br.readLine();
            System.out.print("masukkan tempat penangkapan:");
            tempat = br.readLine();
            System.out.print("masukkan pelaku melakukan sebanyak:");
            jmlh = br.readLine();
            //memanggil Class Pembunuhan
            Pembunuhan bunuh = new Pembunuhan(alat,korban,tempat,jmlh);
            //menyimpan rincian kasus di arraylist
            rckasus.add(bunuh.getKasus());
            casus = bunuh.getPembunuhan();
            kasus = 1;
            break;
        //menu pencurian
        case "5":
            //inputan rincian Pencurian
            System.out.println("Kasus Pencurian");
            System.out.print("masukkan barang yang dicuri:");
            barang = br.readLine();
            System.out.print("masukkan korban pencurian:");
            korban = br.readLine();
            System.out.print("masukkan tempat penangkapan:");
            tempat = br.readLine();
            System.out.print("masukkan pelaku melakukan sebanyak:");
            jmlh = br.readLine();
            //memanggil Class Pencurian
            Pencuri curi = new Pencuri(barang,korban,tempat,jmlh);
            //menyimpan rincian kasus di arraylist
            rckasus.add(curi.getKasus());
            casus = curi.getPencuri();
            kasus = 1;
            break;
        default :
            System.out.println("perintah salah, inputkan kasus lagi");
            //jadi nanti akan looping samapai inputannya benar
            kasus = 0;
            }
        }
        //inisialisasi untuk kemungkinan inputan user saat memilih ruangan
        int ruangan = 0;
        //memanggil Class Lapas
        Lapas lp = new Lapas();
        //menu inputan ruang lapas
        while(ruangan != 1){
            System.out.println("\n\t\t##Menu pilih ruangan lapas##");
            System.out.println("1."+lp.Ruang1(1, kapasitas[0])+"\n2."+lp.Ruang2(2, kapasitas[1])+"\n3."+lp.Ruang3(3, kapasitas[2])+"\n4."+lp.Ruang4(4, kapasitas[3])+"\n5."+lp.Ruang5(5, kapasitas[4]));
            System.out.print(">>>");
            pil1 = br.readLine();
            switch(pil1){
                //menu ruang lapas 001
                case "1":
                    System.out.println("Narapidana masuk ruangan (001)");
                    //jika user memilih ruang , maka kapasitas dari ruangan tsb akan berkurang
                    kapasitas[0]=kapasitas[0]-a;
                    //menyimpan string untuk di tampilkan di menu tampilan
                    lapas = "001";
                    //kondisi bahwa user telah memilih ruangan
                    ruangan = 1;
                    break;
                //menu ruang lapas 002
                case "2":
                    System.out.println("Narapidana masuk ruangan (002)");
                    kapasitas[1]=kapasitas[1]-a;
                    lapas = "002";
                    ruangan = 1;
                    break;
                //menu ruang lapas 003
                case "3":
                    System.out.println("Narapidana masuk ruangan (003)");
                    kapasitas[2]=kapasitas[2]-a;
                    lapas = "003";
                    ruangan = 1;
                    break;
                //menu ruang lapas 004
                case "4":
                    System.out.println("Narapidana masuk ruangan (004)");
                    kapasitas[3]=kapasitas[3]-a;
                    lapas = "004";
                    ruangan = 1;
                    break;
                //menu ruang lapas 005
                case "5":
                    System.out.println("Narapidana masuk ruangan (005)");
                    kapasitas[4]=kapasitas[4]-a;
                    lapas = "005";
                    ruangan = 1;
                    break;
                default :
                    System.out.println("perintah salah, inputkan ruangan lagi");
                    //jadi nanti akan looping samapai inputannya benar
                    ruangan = 0;
                            
                }
            }
            //kondisi user saat memilih menu pekerjaan
            int pekerjaan=0;
            while(pekerjaan != 1){
                System.out.println("\t\t##Menu memilih pekerjaan selama di Lapas##");
                System.out.println("1.Builder\n2.Juru Masak\n3.Pemadam Kebakaran\n4.Petani\n5.Programmer");
                System.out.print(">>>");
                pil2 = br.readLine();
                switch(pil2){
                    //menu builder
                    case "1":
                        //inputan rincian builder
                        System.out.println("Narapidana dibina menjadi Builder");
                        System.out.print("masukkan tempat pembinaaan:");
                        tempat = br.readLine();
                        //memanggil Class Builder
                        Builder bd = new Builder(tempat);
                        //menyimpan rincian di array list
                        rcpekerjaan.add(bd.getpekerjaan());
                        //nama pembinaa di kerja agar ditampilan hanya menampilkan jenis nama pembinaannya saja
                        kerja = bd.getBuilder();
                        //kondisi bahwa user telah menginputkan pembinaan
                        pekerjaan=1;
                        break;
                    //menu juru masak
                    case "2":
                        //inputan rincian Juru Masak
                        System.out.println("Narapidana dibina menjadi Juru Masak");
                        System.out.print("masukkan tempat pembinaaan:");
                        tempat = br.readLine();
                        //memanggil Class Juru Masak
                        Juru_Masak jm = new Juru_Masak(tempat);
                        //menyimpay rincian di array list
                        rcpekerjaan.add(jm.getpekerjaan());
                        kerja = jm.getJuruMasak();
                        pekerjaan=1;
                        break;
                    //menu pemadam kebakaran 
                    case "3":
                        //inputan rincian Pemadam Kebakaran
                        System.out.println("Narapidana dibina menjadi Pemadam Kebakaran");
                        System.out.print("masukkan tempat pembinaaan:");
                        tempat = br.readLine();
                        //memanggil Class Pemadam Kebakaran
                        Pemadam_Kebakaran pk = new Pemadam_Kebakaran(tempat);
                        //menyimpan rincian di array list
                        rcpekerjaan.add(pk.getpekerjaan());
                        kerja = pk.getPemadam();
                        pekerjaan=1;
                        break;
                    //menu petani
                    case "4":
                        //inputan rincian Petani
                        System.out.println("Narapidana dibina menjadi Petani");
                        System.out.print("masukkan tempat pembinaaan:");
                        tempat = br.readLine();
                        //memanggil Class Petani
                        Petani tani = new Petani(tempat);
                        //menyimpan rincian di arraylist
                        rcpekerjaan.add(tani.getpekerjaan());
                        kerja = tani.getPetani();
                        pekerjaan=1;
                        break;
                    //menu programer
                    case "5":
                        //inputan rincian Programer
                        System.out.println("Narapidana dibina menjadi Programmer");
                        System.out.print("masukkan tempat pembinaaan:");
                        tempat = br.readLine();
                        //memanggil Class Programmer
                        Programmer program = new Programmer(tempat);
                        //menyimpan rincian di array list
                        rcpekerjaan.add(program.getpekerjaan());
                        kerja = program.getProgramer();
                        pekerjaan=1;
                        break;
                    default :
                        System.out.println("perintah salah, inputkan pekerjaan lagi");
                        //jadi nanti akan looping sampai inputannya benar
                         pekerjaan = 0;   
                }
            }
            //menyimpan semua inputan menjadi String
            narapidana = nama+"\t"+jeniskelamin+"\t\t"+alamat+"\t\t"+ttl+"\t"+umur+"\t"+casus+"\t\t"+lapas+"\t\t"+kerja;
        return narapidana;
    }
    public static void main(String[] args) throws IOException {
        // memanggi Class Narapidana
        Narapidana np = new Narapidana();
        //inisialisasi kondisi inputan user
        int kondisi = 0;
        String pil,pil2;
        int i=0,ID;
        //ini colletion untuk menerima inputan user,disini saya buat untuk inputan integer
        Scanner input = new Scanner(System.in);
        //ini colletion untuk menerima inputan user,disini saya buat untuk inputan String
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        while(kondisi != 1){
            System.out.println("\t\t### Sistem Informasi ###\n\t\t\tNarapidana");
            System.out.println("1.Menambahkan data\n2.Membaca data\n3.Edit data\n4.Delete data\n5.Search data\n6.Keluar");
            System.out.print("pilih:");
            pil = br.readLine();
            switch(pil){
                //menu inputan
                case "1" :
                    //memanggil method create dari class narapidana
                    np.Crate(input(i,1));
                    i++;
                break;
                //menu tampilan
                case "2":
                    //kondisi dimana ketika user telah menginputkan data di menu input, maka akan masuk di if
                    if (i>=1){
                        //memanggil method read dari class narapidana
                        np.Read();
                        System.out.println("\n1.lihat rincian pekerjaan\n2.lihat rincian kasus\n3.lihat rincian jadwal kegiatan\n4.kembali menu");
                        System.out.print(">>>");
                        pil2 = br.readLine();
                        switch(pil2){
                            //menu lihat rincian pekerjaan
                            case "1":
                                System.out.print("masukkan id yang ingin dilihat:");
                                int pilih = input.nextInt();
                                //kondisi dimana user harus menginputkan id yang telah ada,jika tidak maka akan else
                                if(pilih> 0 && pilih<=i){
                                    Pekerjaan krj = new Pekerjaan() {
                                        @Override
                                        public String getpekerjaan() {
                                            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                                        }
                                    };
                                    //menapilkan rincian pembinaan yang ingin di lihat
                                    System.out.println(krj.readPekerjaan(pilih-1, rcpekerjaan));
                                }else{
                                    System.out.println("id yang anda masukkan tidak ada!");
                                }
                            break;
                            //menu lihat rincian kasus
                            case "2":
                                System.out.print("masukkan id yang ingin dilihat:");
                                pilih = input.nextInt();
                                //kondisi dimana user harus menginputkan id yang telah ada,jika tidak maka akan else
                                if(pilih>0 && pilih<=i){
                                    //menampilkan rincian kasus yang ingin dilihat
                                    System.out.println(rckasus.get(pilih-1));
                                }else{
                                    System.out.println("id yang anda masukkan tidak ada!");
                                }
                            break;
                            //menu lihat rincian jadwal
                            case "3":
                                //memanggil Class Jadwal
                                Jadwal jadwal = new Jadwal();
                                System.out.println(jadwal.getJadwal());
                            break;
                            case "4":
                                System.out.println(" ");
                            break;
                            default :
                                System.out.println("perintah yang anda masukkan salah");
                            
                        }
                    }else System.out.println("masukkan data di menu tambah data terlebih dahulu");
                    
                break;
                //menu edit data
                case "3":
                    if(i>=1){
                        //menampilkan data,agar user mudah dalam mengedit
                        np.Read();
                        System.out.print("masukkan id yang ingin diganti:");
                        ID = input.nextInt();
                        //kondisi dimana user harus menginputkan id yang telah ada,jika tidak maka akan else
                        if(ID> 0 && ID<=i){
                            //memanggil method edit yang di Narapidana
                            np.Edit(ID-1, input(ID-1,0));
                        }else{
                            System.out.println("id tidak ada,masukkan data terlebih dahulu");
                        }
                    }else{
                        System.out.println("masukkan data terlebih dahulu di menu input");
                    }
                break;
                //menu hapus data
                case "4":
                    //menampilkan data-data, agar user mudah dalam menghapus data
                    np.Read();
                    System.out.print("masukkan id yang ingin dihapus:");
                    ID = input.nextInt();
                    //kondisi dimana user harus menginputkan id yang telah ada,jika tidak maka akan else
                    if(ID> 0 && ID<=i){
                        //memanggil method delete yang di Narapidana 
                        np.Delete(ID-1);
                        //array list dari rincian kasus dan pembinaan juga dihapus
                        rckasus.remove(ID-1);
                        rcpekerjaan.remove(ID-1);
                        //indeks akan berkurang
                        i--;
                    }else{
                        System.out.println("id yang anda masukkan tidak ada!");
                    }
                    
                break;
                //menu searching
                case "5":
                    System.out.print("masukkan id yang ingin dicari:");
                    ID = input.nextInt();
                    //kondisi dimana user harus menginputkan id yang telah ada,jika tidak maka akan else
                    if(ID>0 && ID<=i){
                        //memanggil method search yang ada di Narapidana
                        np.Search(ID-1);
                    }else{
                        System.out.println("id yang anda masukkan tidak ada!");
                    }
                    
                break;
                //menu keluar
                case "6":
                    System.out.println("Terimakasih!!");
                    kondisi = 1;
                break;
                default : System.out.println("perintah salah");
            }
            //kondisi dimana user tidak memilih menu utama keluar
            if(kondisi == 0){
                System.out.println("\n\n");
                System.out.print("tekan enter untuk lanjut>>");
                br.readLine();
                System.out.println("\n\n");
            }
        }
    }
    
}
