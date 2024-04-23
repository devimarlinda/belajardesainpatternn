public interface Kendaraan {
    public void bergerak();
    public void berhenti();
}
 class Sepeda implements Kendaraan{
     @Override
     public void bergerak() {
         System.out.println("Digayuh");
     }

     @Override
     public void berhenti() {
         System.out.println("Di Rem");

     }
 }

 class SepedaMotor implements Kendaraan{
     @Override
     public void bergerak() {
         System.out.println("Gassssssss");
     }

     @Override
     public void berhenti() {
         System.out.println("Remmmmm");

     }
 }



