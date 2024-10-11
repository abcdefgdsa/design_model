package singleton;

import java.util.Objects;

public class Student {
    private Integer id;
    private Integer age;
    private String name;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student student)) return false;
        return Objects.equals(id, student.id) && Objects.equals(age, student.age) && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, age, name);
    }

    public static void main(String[] args) {
        Student student = new Student();
        System.out.println(student.getClass());
    }
}
