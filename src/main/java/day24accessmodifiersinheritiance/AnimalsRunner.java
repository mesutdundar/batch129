package day24accessmodifiersinheritiance;

import day23datetimestringbuilder.Snake;

public class AnimalsRunner {
    public static void main(String[] args) {
        Cat myCat =new Cat();
        myCat.meow();
        myCat.drink();
        myCat.eat();
        //Snake'i day23 package a koyduk.defaultu gormedigini kanitlamak icin
        Snake yourSnake =new Snake();
        yourSnake.tiss();
        yourSnake.eat();
    }
}
