package us.ossowitz;

public class TestBean {
    private final String name;

    public TestBean(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "TestBean{" +
               "name='" + name + '\'' +
               '}';
    }
}
