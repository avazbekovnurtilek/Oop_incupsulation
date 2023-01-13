public class Main {
    public static void main(String[] args){
        Fish fish = new Fish();
        System.out.println("тип рыбы?");
        fish.setKind("farel");
        System.out.println("В чем отличие у рыбы?");
        fish.setMemory(0.3);
        System.out.println("Вес рыбы?");
        fish.setWeight(1.5);
        System.out.println(fish.getKind());
        System.out.println(fish.getMemory());
        System.out.println(fish.getWeight());

        System.out.println("-------------------------------------------------------");

        Cat cat = new Cat();
        System.out.println("как зовут кота?");
        cat.setName("tom");
        System.out.println("Сколько ему лет?");
        cat.setAge(3);
        System.out.println("Сколько весит?");
        cat.setWeight(3.4);
        System.out.println(cat.getName());
        System.out.println(cat.getAge());
        System.out.println(cat.getWeight());

        System.out.println("-------------------------------------------------------");

        Parrot parrot = new Parrot();
        System.out.println("Как зовут попугая?");
        parrot.setName("Biscvik");
        System.out.println("какого цвета попугай?");
        parrot.setColor("red");
        System.out.println("сколько ему лет?");
        parrot.setAge(2);
        System.out.println("Сколько весит попугай?");
        parrot.setWeight(1.9);

        System.out.println(parrot.getName());
        System.out.println(parrot.getColor());
        System.out.println(parrot.getAge());
        System.out.println(parrot.getWeight());

        System.out.println("-------------------------------------------------------");

        Dog dog = new Dog();
        System.out.println("Как зовут собаки?");
        dog.setName("Reiks");
        System.out.println(dog.getName());
        System.out.println("Кто хозяин Рейкса?");
        dog.setOnwer("Nurtilek");
        System.out.println("Какого рода?");
        dog.setKind("Alabai");
        System.out.println("Сколько лет Рейксу?");
        dog.setAge(4);
        System.out.println(dog.getOnwer());
        System.out.println(dog.getKind());
        System.out.println(dog.getAge());


    }
}