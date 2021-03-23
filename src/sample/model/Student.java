package sample.model;

public class Student {
    String name;
    Integer mark;
    String address;

    public Student(String name, Integer mark, String address) {
        this.name = name;
        this.mark = mark;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getMark() {
        return mark;
    }

    public void setMark(Integer mark) {
        this.mark = mark;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
