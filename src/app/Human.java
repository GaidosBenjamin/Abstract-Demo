package app;

public abstract class Human {

    private String name;

    private Integer age;

    protected Human(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    protected String getName() {
        return name;
    }

    protected void setName(String name) {
        this.name = name;
    }

    protected Integer getAge() {
        return age;
    }

    protected void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
