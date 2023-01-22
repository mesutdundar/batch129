package day01variables;

public class Variables01 {

    public static void main(String[] args) {
        //Variable oluşturmak
        //Access modifier yazmazsanız "access modifier" "default" demektir.
        // Javada eşittir demek "=="
        //Data type + variable name ==> Variable Declaration
        //assignment operator + variable value ==> Assignment
        //Eğer variable declaration yapar, Assignment yapmazsanız Java kendi değerlerini " default" koyar.
        //default değerler sayılar(int) için sıfırdır.
        // Data type'nı yazınız.Variable ismi yazınız.Assignment Operator(atama operatörü).variable değeri.ingilizcedeki nokta gibi

              int                  age                               =                          13               ;
           // Ornek1 : Öğrenci ismi variable olusturup değer olarak Ali Can atayınız.
        //Stringlere verilen değerler ".." içinde olmalıdır.
        //Stringler için "default value" , "null" dır.
        String studentName = "Ali Can";
        /*
        Javada temelde iki tip data vardır;
         1) primitive data type(ilkel);
          char-boolean-byte-short-int-long-float-double
         2)non-primitive data type(ilkel olmayan)
         */
        //örnek2 : char data tipinde ilk ismin ilk harfi olarak bir variable ve bir değer atayınız
        char ilkHarf = 'M';
        //ornek3:boolean kullanarak emekli misin variable olustur ve false degeri ata.
        boolean emekliMisin = false;
        //ornek4: byte data type'nda ogrenci yasi icin bir variable olusturunuz ve deger atayınız.
        byte studentAge = 23;
        //ornek5: site nufusu icin bir variable olusturup deger atayiniz.
        short siteNufusu = 1200;
        //ornek6:ulke nufusu icin bir deger ataması
        int countryPopulation = 1888846546;
        //ornek7: insan vucudundaki hücre sayısı varuable olustur.
        long cellNumberInHumanBody = 4562548634543215L;


    }
}
