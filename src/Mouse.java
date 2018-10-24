public class Mouse extends Animals {

    public Mouse(String name) {
        super(name);
    }

    public void die(){
        if (this.isAlive()==true) {
            setAlive(false);
            System.out.print(this.getName()+" has been eaten");
        }
        else{
            System.out.println(this.getName()+" already been eaten");
        }
    }

    @Override
    void makeSound() {
        System.out.println("squik squik");
    }
}
