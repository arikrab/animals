public class Cow extends Animals {

    public Cow(String name) {

        super(name);
    }

    public void giveMilk(){
        System.out.println("exetacting milk from "+this.getName());
    }

    public void die() {
    if (this.isAlive()==true){
        setAlive(false);
    }

    }

    @Override
    void makeSound() {
        System.out.println("moo");
    }
}
