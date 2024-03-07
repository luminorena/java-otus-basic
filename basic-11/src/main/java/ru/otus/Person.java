package ru.otus;

public class Person {
    private Long id;
    private String name;
    private Position position;

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Position getPosition() {
        return position;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", position=" + position +
                '}';
    }

    public Person(Long id, String name, Position position) {
        this.id = id;
        this.name = name;
        this.position = position;
    }
}
