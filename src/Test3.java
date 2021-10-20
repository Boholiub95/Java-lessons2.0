public class Test3 {
    public static void main(String[] args) {
        /*Animal animal = new Animal();
        Dog dog = new Dog();
        animal.eat();
        dog.eat();*
        Animal animal = new Dog();
        animal.eat();
        Dog dog = new Dog();
        dog.eat();
        dog.bark();
         */
        Animal animal = new Dog();
        Dog dog = new Dog();
        Cat cat = new Cat();
        test(animal);
        test(dog);
        test(cat);

    }
    public  static void  test (Animal animal) {
        animal.eat();
    }

}
