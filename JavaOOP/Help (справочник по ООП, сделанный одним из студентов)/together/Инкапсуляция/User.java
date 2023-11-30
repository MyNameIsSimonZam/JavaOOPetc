public class User {

    // создаем приватные поля
    private String userName;
    private int userAge;
    // создаем приватный метод
    private void work(){
        System.out.println("Я работаю на заводе");
    }

    public User(String userName) {
        this.userName = userName;
    }

    // создаем публичные методы, через них будем в main задавать возраст и вызывать метод work()
    public void setUserAge(int userAge) {
        this.userAge = userAge;
    }

    public void getWork(){
        this.work();
    }
    
    @Override
    public String toString() {
        return "имя: " + userName + "возраст: " + userAge;
    }
}
