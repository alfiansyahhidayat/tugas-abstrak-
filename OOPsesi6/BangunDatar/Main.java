package OOPsesi6.BangunDatar;

public class Main {
    public static void main(String[] args) {
        BangunDatar segitiga=new Segitiga();
        Lingkaran lingkaran=new Lingkaran(60);

        System.out.println("Luas dari bangun datar segitiga : "+segitiga.getLuas());
        System.out.println("Luas dari bangun datar luangkaran : "+lingkaran.getLuas());
    }
}
