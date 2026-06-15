abstract class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void getDescription();
}

class Employee extends Person {
    private String department;

    public Employee(String name, String department) {
        super(name);
        this.department = department;
    }

    @Override
    public void getDescription() {
        System.out.println("在" + department + "工作的职工");
    }
}

class Student extends Person {
    private String school;

    public Student(String name, String school) {
        super(name);
        this.school = school;
    }

    @Override
    public void getDescription() {
        System.out.println("在" + school + "上学的学生");
    }
}
