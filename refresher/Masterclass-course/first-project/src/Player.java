public class Player {
    public String name;
    public String power;
    public int health;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPower() {
        return power;
    }

    public void setPower(String power) {
        this.power = power;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public Player(String name, String power, int health) {
        this.name = name;
        this.power = power;
        this.health = health;
    }


    public void printDetails() {

        System.out.println(name);
        System.out.println(power);
        System.out.println(health);
    }
}
