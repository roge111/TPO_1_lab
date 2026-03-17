package main.java.task3;

abstract class Person {
    private String condition;
    private String name;

    public Person(String name, String condition) {
        this.name = name;
        this.condition = condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
        
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCondition() {
        return condition;
    }

    public String getName() {
        return name;
    }

}
