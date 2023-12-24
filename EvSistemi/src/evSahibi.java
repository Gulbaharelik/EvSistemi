import java.util.ArrayList;
public class evSahibi {
    Bina bina;
    String isim;
    String soyisim;
    Daire daire;
    //Burada birden fazla daire tanımlaması yapabilmek için daire listesi oluşturduk
    ArrayList<Daire> daireler;

    public evSahibi(String isim,String soyisim,Bina bina){
        this.bina=bina;
        this.isim=isim;
        this.soyisim=soyisim;
        daireler = new ArrayList<>();
    }
    public void displayInfo(){ //İstenen bilgilerin görüntülendiği kısımdır.
        System.out.print("Ev sahibi ismi: " + isim + "\nEv sahibi soyismi: " + soyisim +"\nBinasının adresi: "
                + bina.address + "\nBinasının kat sayısı: " + bina.getNumberOfFloors());
    }
    //Daire nesnesini alır ve daireler listesine ekler(binada birdedn fazla daire vardır)
    public void addApartment(Daire daire){
        daireler.add(daire);
    }
}