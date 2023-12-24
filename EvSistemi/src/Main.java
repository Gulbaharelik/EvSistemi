public class Main {
    public static void main(String[] args) {
        //Bir bina nesnesi oluşturup ev sahibine eşledik
        Bina bina = new Bina("Ümraniye / İstanbul",4);
        evSahibi evSahibi = new evSahibi("Erhan","Elik",bina);

        //Daire nesneleri oluşturup binaya ekledik çünkü bir binanın birden fazla dairesi olabilir
        Daire daire1 = new Daire("Atasehir / İstanbul",24,1);
        Daire daire2 = new Daire("Kadıköy / İstanbul",1,2);
        Daire daire3 = new Daire("Ümraniye / İstanbul",3,3);

        //evSahibi nesnesiyle daireleri ekledik
        evSahibi.addApartment(daire1);
        evSahibi.addApartment(daire2);
        evSahibi.addApartment(daire3);

        //Bir kiracı nesnesi oluşturduk ve kiracının ev sahibi atadık
        Kiraci kiraci = new Kiraci("Gülbahar","Elik",evSahibi);

        //Bilgilerin yazdırılması
        System.out.println("Ev Sahibi ve Binaları: ");
        evSahibi.displayInfo();
        System.out.println("\n\nBinanın Bilgileri ");
        bina.displayInfo();
        System.out.println("\nDaireler: ");
        daire1.displayInfo();
        daire2.displayInfo();
        daire3.displayInfo();
        System.out.println("\nKiracı:");
        kiraci.displayInfo();
    }
}