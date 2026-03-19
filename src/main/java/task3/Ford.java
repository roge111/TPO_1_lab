package task3;

public class Ford extends Person {
    public Ford(String name, String condition) {
        super(name, condition);
    }

    public void say() {
        System.out.println("I am Ford, " + getName() + ", and I am " + getCondition());
    }

    public void setCondition(String condition) {
        super.setCondition(condition);
    }

    public void setName(String name){
        super.setName(name);
    }
    
}
