package day09incrementdecrementternaryswitch;

public class Switch01 {
    public static void main(String[] args) {
        //Example 1: gün isimlerini verince kacıncı gün oldugunu yazdıran kodu yazınız
        //sunday==>1 , saturday==>7

        String dayName = "SUNDAY";

        //I.YOL if-else

        if (dayName.equalsIgnoreCase("Sunday")){
            System.out.println(1);
        }else if (dayName.equalsIgnoreCase("Monday")){
            System.out.println(2);
        }else if (dayName.equalsIgnoreCase("Tuesday")) {
            System.out.println(3);
        }else if (dayName.equalsIgnoreCase("Wednesday")) {
            System.out.println(4);
        }else if (dayName.equalsIgnoreCase("Thursday")) {
            System.out.println(5);
        }else if (dayName.equalsIgnoreCase("Friday")) {
            System.out.println(6);
        }else if (dayName.equalsIgnoreCase("Saturday")) {
            System.out.println(7);
        }else System.out.println("Geçerli bir gün giriniz");

        //II:YOL switch
        switch (dayName.toLowerCase()){
            case "sunday":
                System.out.println(1);
                break;
            case "monday":
                System.out.println(2);
                break;
            case "tuesday":
                System.out.println(3);
                break;
            case "wednesday":
                System.out.println(4);
                break;
            case "thursday":
                System.out.println(5);
                break;
            case "friday":
                System.out.println(6);
                break;
            case "saturday":
                System.out.println(7);
                break;
            default:
                System.out.println("Lütfen gecerli gün ismi giriniz");
        }



    }
}
