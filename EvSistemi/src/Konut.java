// Konut sınıfı abstract olarak tanımladık ve Bina ve Daire sınıflarını extends ettik.
public abstract class Konut {
    String address;
    Konut(String address){
        this.address =address;
    }
    //İstenen bilgilerin görüntülendiği kısımdır.
    void displayInfo(){
        System.out.println("Adres: " + address);
    }
}