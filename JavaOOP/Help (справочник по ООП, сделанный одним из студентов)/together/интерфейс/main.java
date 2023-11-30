public class main {
    public static void main(String[] args) {
        Bear bear = new Bear("Потапыч",2);
        Cow cow = new Cow("Буренка",4);

        System.out.println(cow);
        System.out.println(bear);
        System.out.println("//--------------------");
        cow.eating();
    }
}
