public class Lion extends Animals{

    public Lion(String name) {
        super(name);
    }

    public void eatCow(Cow cow){
        if (cow.isAlive()==true) {
            cow.die();
            System.out.println(this.getName()+" ate "+cow.getName());
        }
        else{
            System.out.println(cow.getName()+" is already lion poop");
        }
    }

    public void rest(){
        System.out.println("ZZZZzzzZZzz....");
    }

    @Override
    void makeSound() {
        System.out.println("raawwwrrr");
    }
}
