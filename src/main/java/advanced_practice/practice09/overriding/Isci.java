package advanced_practice.practice09.overriding;

public class Isci extends Banka{
    @Override
    public double faizHesapla(double alinanKredi) {
        return alinanKredi*0.15;
    }
}
