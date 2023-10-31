class Person {
    private String name;
    private int age;

    // Конструктор класса
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Метод для вывода информации о человеке
    public void displayInfo() {
        System.out.println("Имя: " + name);
        System.out.println("Возраст: " + age + " лет");
    }
}