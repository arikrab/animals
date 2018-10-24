abstract public class Animals {

    private String name;
    private boolean alive;

    public Animals(String name) {
        this.name = name;
        this.alive = true;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isAlive() {
        return alive;
    }

    public void setAlive(boolean alive) {
        this.alive = alive;
    }

    abstract void makeSound();

}
