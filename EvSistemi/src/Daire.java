//Daire class'ı konut abstact class'ını kalıtır ve adres özelliğine sahip olur
public class Daire extends Konut{
    private int apartmentNumber;
    int daireSirasi;

    //Daire constructer'ı str int diğerleri alır ve üst sınıfın yapıcı metodunu çağırır.
    Daire(String address,int apartmentNumber,int daireSirasi) {
        super(address);
        this.apartmentNumber= apartmentNumber;
        this.daireSirasi=daireSirasi;
    }
    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Daire numarası: " + apartmentNumber);
    }
    // Burada kullanılan compare to sınıfı sayesinde apartman numarasın durumu kontrol edildi.
    int compareTo(Daire daire) {
        if(this.apartmentNumber < daire.apartmentNumber){
            return -1;
        } else if (this.apartmentNumber == daire.apartmentNumber){
            return 0;
        } else{
            return 1;
        }
    }
    public int getApartmentNumber() {
        return apartmentNumber;
    }
}