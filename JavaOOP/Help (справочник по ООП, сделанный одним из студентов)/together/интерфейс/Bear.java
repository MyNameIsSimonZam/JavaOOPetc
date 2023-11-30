public class Bear extends Animal{
    private int foot;

    public Bear(String name, int foot) {
        super(name);
        this.foot = foot;
    }

    @Override
    public String toString() {
        return super.toString() + ", ходит на лапах: " + foot;
    }
}
