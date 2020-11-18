package pattern.creational.builder;

public class Builder {
    private String name;
    private int age;
    private String phoneNum;
    private int height;

    public Builder setName(String name) {
        this.name = name;
        return this;
    }

    public Builder setAge(int age) {
        this.age = age;
        return this;
    }

    public Builder setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
        return this;
    }

    public Builder setHeight(int height) {
        this.height = height;
        return this;
    }

    public Person builde() {
        return new Person(name, age, phoneNum, height);
    }
}
