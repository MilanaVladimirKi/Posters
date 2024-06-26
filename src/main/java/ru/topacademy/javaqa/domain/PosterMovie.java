package ru.topacademy.javaqa.domain;

public class PosterMovie {
    private String name = "";
    private String style = "";
    private int age = 0;

    public PosterMovie(String name, String style, int age) {
        this.style = style;
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getStyle() {
        return style;
    }
    public void setStyle(String style) {
        this.style = style;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
}
