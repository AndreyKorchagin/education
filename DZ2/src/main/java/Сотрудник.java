public class Сотрудник {
    public int getAge() {
        return age;
    }
    public String getName() {
        return name;
    }
    private String name;
    private int age;

    public Сотрудник(String name, int age) {
        this.name = name;
        this.age = age;

    }

    public Сотрудник() {
        this.name = "Andrey";
        this.age = 18;
    }

}
