package Latihan2;
/**
 *
 * @author MirzaUY
 */
public class Bus {
    private int penumpang;
    private int maxPenumpang;
    //konstruktor class Bus
    public Bus(int maxPenumpang){
        this.maxPenumpang = maxPenumpang;
        penumpang =0;
    }
    //method mutator untuk menambahkan penumpang
    public void addPenumpang(int penumpang){
    int temp;
    temp = this.penumpang+penumpang;
    if(temp >= maxPenumpang){
    System.out.println("Penumpang melebihi kuota");
    }else{
    this.penumpang = temp;
    }
    }
    public void cetak(){
    System.out.println("Penumpang Bus Sekarang adalah " + penumpang);
    System.out.println("Penumpang Maksimum Bus Seharusnya " + maxPenumpang);
    }
}