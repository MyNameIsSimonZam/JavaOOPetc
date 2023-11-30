public class Animal {
    protected String nameAnimal;

    public Animal(String nameAnimal) {
        this.nameAnimal = nameAnimal;
    }

    public void foot(){
        System.out.println("Я передвигаюсь на 4 лапах");
    }

    @Override
    public String toString() {
        return "животное: " + nameAnimal;
    }
}
