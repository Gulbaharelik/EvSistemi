//Bina ve onut abstract class'ını kalıtır ve adres özelliğine sahip olur
public class Bina extends Konut{
    private int numberOfFloors;
    //super metodu ile uml'de verilen constructer oluşturduk
    public Bina(String address,int katSayisi) {
        super(address);
        this.setNumberOfFloors(katSayisi);
    }
    @Override
    void displayInfo(){
        //üst sınıftan metod çağrılır
        super.displayInfo();
        System.out.println("Kat sayısı: " + getNumberOfFloors());
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }
}
