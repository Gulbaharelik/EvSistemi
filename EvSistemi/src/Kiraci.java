public class Kiraci {
    String isim;
    String soyisim;
    evSahibi evSahibi;
    Kiraci(String isim,String soyisim,evSahibi evSahibi){
        this.isim=isim;
        this.evSahibi=evSahibi;
        this.soyisim=soyisim;
    }
    //İstenen bilgilerin görüntülendiği kısımdır.
    void displayInfo(){
        System.out.println("Kiracının ismi: "+isim+"\nKiracının soyismi: "+soyisim +"\n\nEv Sahibinin ve Binasının Bilgileri: ");
        evSahibi.displayInfo(); //evsahibi sınıfının displayInfosunu çalıştırdık çünkü 1 kiracının 1 sahibi vardır 1-1
    }
}
