public class Cat extends Animals {

    public Cat(String name) {
        super(name);
    }

    public void eatMouse(Mouse mouse){
        mouse.die();
        System.out.println(" by "+this.getName());
    }

    public void DrinkMilk(Cow cow){
        if(cow.isAlive()==false){
            System.out.println("this cow is dead choose other cow");
        }
        else{
            cow.giveMilk();
            System.out.println(cow.getName()+ " gave to "+this.getName()+" milk");
        }
    }


    @Override
    void makeSound() {
        System.out.println("meou");
    }
}
