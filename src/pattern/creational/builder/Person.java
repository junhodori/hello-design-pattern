package pattern.creational.builder;

public class Person {
    private String name;
    private int age;
    private String phoneNum;
    private int height;

    Person() { }

    Person(String name, int age, String phoneNum, int height) {
        this.name = name;
        this.age = age;
        this.phoneNum = phoneNum;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "name : " + this.name + " / " + "age : " + this.age + " / " + "phoneNum : " + this.phoneNum + " / " + "height : " + this.height;
    }
}
