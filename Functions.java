import java.util.ArrayList;

public class Functions {

  /*
   * Fungsi Untuk Melihat Jumlah data pada ArrayList
   * */
  public void sizeOfArray() {
    ArrayList<String> dataArray = new ArrayList<>();
    dataArray.add("Satu");
    dataArray.add("Dua");
    dataArray.add("Tiga");
    dataArray.add("Empat");
                              // size => Untuk mengambil jumlah data array
    System.out.println(dataArray.size());
  }

  public void loopFromLast2First() {
    int data[] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14};
                                                 // 5 Param untuk jumlah data yang ingin di tampilkan dari ujung berapa.
    for (int i = data.length - 1 ; i >= data.length-5 ; i--) {
        System.out.println(data[i]);
    }
}
}