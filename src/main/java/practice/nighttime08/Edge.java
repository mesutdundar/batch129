package practice.nighttime08;

import jdk.jfr.Percentage;

public class Edge extends Browser {
    public Edge(){}

@Override
    public void search(){
        System.out.println("Edge Web sayfasinda arastirma yapar");
    }

    @Override
    public void sifreKaydetme() {
        System.out.println("Edge cookiesleri kabul edilenlerin"+
                "istenildiginde sifresini kaydeder");
    }
}
