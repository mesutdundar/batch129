package day24accessmodifiersinheritiance;

public class Animal {
    /*
          Inheritance'in faydalari;
      1) Code standardında tekrar iyi değildir.
      2) Code değişime açık olmalıdır.Hatayı düzeltmek kolay olmalı.
      3) Gelişime update'e açık olmalıdır
      4) Code atomic yapıda olmalı.
      Note 1:  "parent class"(super class)(ortak ozellikleri icerir)-"child class"(sub class)(Class'a ozel ozellikleri icerir)
      Note 2: Bir parent class'a bağlı child class'ı belirtmek için "extends" keyword kullanırız
      Note 3: "public" methodlar "child classlar tarafindan kullanilabilir".
              "child classlar tarafindan kullanilabilir" demek "inherit edilebilir" demektir.
      Note 4: "protected" methodlar "inherit edilebilir".
              Cunku "protected" olan method ve variabler child'ler tarafindan kullanilir.
      Note 5: "default" method'lar object ile ayni package'de olduklari surece "inherit edilebilir".
              Ama default method ile object'in uretildigi class farkli package'lerde ise inherit edilemezler.
      Note 6: "private" method'lar "inherit edilemezler.
      Note 7: Java birden fazla parent'i(multiple inheritance Java tarafindan desteklenmez) onaylamaz.
      Note 8: Child ==> Parent ==> GrandParent ==> GrandGrandParent...seklinde ilerleyen inheritance'lara multi-level inheritance denir.
      Note 9: Java'da "Object Class" tum Java Class'larinin ortak parent'idir.
      Note 10: Java'da parent'i olmayan tek class "Object Class"tir.
      Note 11: Java'da "parent" dan "child"a olan iliskilere "HAS-A Relationship" denir.
               Java'da "child" dan "parant"a olan iliskilere "IS-A Relationship" denir.
      Note 12: Java'da her classin bir tane default constructori vardir.
               Bu default constructr classin icinde gorunmez cunku defaut constructor "Object Class" icindedir.
               Bizim classimiz default constructor'a ihtiyac duydugunda parent olan "Object Class" a gider ve ordaki constructor'i kullanir.


     */
    protected void eat(){
        System.out.println("Animals eat...");
    }
     void drink(){
        System.out.println("Animals drink...");
    }

    }

