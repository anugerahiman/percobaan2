package percobaan2;

public class aanAksi {
     public static void main(String[] args){
       aan r1 = new aan();
       r1.tinggi = 10;
       r1.rendah = 4;
       
       r1.cetakInfo();
       System.out.println("rendah retengel = "+r1.hitungbangunan());
       r1.cetakbangunan();
       
       aan r2= new aan();
       r2.cetakInfo();
       
       aan r3= new aan(10,40);
       r3.cetakInfo();
   } 
}
