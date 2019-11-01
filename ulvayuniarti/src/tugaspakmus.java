import java.util.Scanner
public class tugaspakmus {
    public static void main(String[] args) {
        double sisi,luaspermukaan,volume,luassisikubus;
        Scanner input = new Scanner(System.in);
        
        System.out.print("Panjang Sisi: ");
        sisi=input.nextDouble();
        luassisikubus=sisi*sisi;
        System.out.println("luas sisi kubusnya adalah "+luassisikubus);
        luaspermukaan=6*luassisikubus;
        System.out.println("luas permukaannya: "+luaspermukaan);
        System.out.println("Mencari volume!!!");
        volume=sisi*sisi*sisi;
        System.out.print("volumenyass adalah: "+ volume);
        
    }
  
}
