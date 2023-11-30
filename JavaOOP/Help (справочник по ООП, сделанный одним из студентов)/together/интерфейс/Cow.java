public class Cow extends Animal implements Making{
    private int foot;

    public Cow(String name, int foot) {
        super(name);
        this.foot = foot;
    }
    @Override
    public String toString() {
        return super.toString() + ", ходит на лапах: " + foot;
    }
    public void eating(){
        System.out.println("Я кушаю траву");
    }
}
