public class Main {

    public static void main(String[] args) {

        Cat cat = new Cat("Garfield");
        Mouse mouse = new Mouse("jerry");
        Cow cow=new Cow("hedva");
        Lion lion=new Lion("mufasa");

        Lion[] lions=new Lion[1];
        Cat[] cats = new Cat[2];
        Cow[] cows= new Cow[5];
        Mouse[] mouses=new Mouse[5];
        


        cat.makeSound();
        mouse.makeSound();
        cow.makeSound();
        lion.makeSound();

        cat.DrinkMilk(cow);
        lion.eatCow(cow);
        lion.eatCow(cow);
        cat.DrinkMilk(cow);
        cat.eatMouse(mouse);
        cat.eatMouse(mouse);


        }

    }



