package pattern.creational.builder;

public class GoodPerson {
    private String name;
    private int age;
    private String phoneNum;
    private int height;

    public static class Builder {
        private String name;
        private int age;
        private String phoneNum;
        private int height;

        public Builder name(String name) {
            this.name = name;
            return this;
        }
        public Builder age(int age) {
            this.age = age;
            return this;
        }
        public Builder phoneNum(String phoneNum) {
            this.phoneNum = phoneNum;
            return this;
        }
        public Builder height(int height) {
            this.height = height;
            return this;
        }
        public GoodPerson build() {
            return new GoodPerson(this);
        }
    }

    private GoodPerson(Builder builder) {
        this.name = builder.name;
        this.age = builder.age;
        this.phoneNum = builder.phoneNum;
        this.height = builder.height;
    }
}
