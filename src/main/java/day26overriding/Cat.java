package day26overriding;

public class Cat extends Mammal {
    public void meow (){
        System.out.println("Cats meow...");
    }

    @Override // Override Annotation :Override kurallarina uyulup uyulmadigini kontrol eder.
    public void eat() {
        System.out.println("Cats eat...");
    }

    @Override
    public void drink() {
        System.out.println("Cats drink...");
    }

    @Override
    public Cat creat() {
        return new Cat();
    }

    @Override
    public int add(int a, int b) {
        return a+b;
    }

    @Override
    public Integer multiply(int a, int b) {
        return a*b;
    }
}
