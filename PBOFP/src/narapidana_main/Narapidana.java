package narapidana_main;
import java.util.ArrayList;
/**
 *
 * @author ahmad
 */
public class Narapidana {
    public String nama,alamat,tmpttgll;
    public int umur,ID;
    //inisialisasi array list
    public ArrayList<String> data = new ArrayList<String>();
    //method menyimpan data di array list
    public void Crate(String tambah){
        //fungsi array list tambah data
        data.add(tambah);
    }
    //method menampilkan data
    public void Read(){
        System.out.println("ID\tNama\tJenis Kelamin\t\tAlamat\t\tTTL\t\tUmur\tKasus\t\tLapas\t\tKerja");
        //melakukan looping sampai panjang dari array list tidak ada isi data
        for(int i = 0;i<data.size();i++){
            //fungsi array list mengambil data
            System.out.println((i+1)+".\t"+data.get(i));
        }
    }
    public void Edit(int id,String edit){
        //fungsi array menggati isi data
        data.set(id, edit);
    }
    public void Delete(int id){
        //fungsi arraylist menghapus data
        data.remove(id);
    }
    public void Search(int id){
        System.out.println("Data terdapat di index-"+(id+1));
        System.out.println("ID\tNama\tJenis Kelamin\t\tAlamat\t\tTTL\t\tUmur\tKasus\t\t\tLapas\t\tKerja");
        System.out.println(data.get(id));
    }
}
