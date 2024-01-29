package task3.students;

import task3.strategyOfstudents.ThirdTypeStrategy;


public class StudentThirdType extends Student {

    public StudentThirdType(String name, double talent) {
        super(name, talent);
        this.teach = new ThirdTypeStrategy();
    }
}
