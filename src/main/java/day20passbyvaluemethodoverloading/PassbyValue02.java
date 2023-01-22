package day20passbyvaluemethodoverloading;

public class PassbyValue02 {
    public static void main(String[] args) {


        String name = "Tom Hanks";
        String updatedNamed=updateName(name,"Jr.");
        System.out.println(updatedNamed);
    }

    public static String updateName(String name, String add) {

        name = name + " " + add;

        return name;
    }
}