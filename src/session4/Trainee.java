package session4;

public class Trainee {
    private static final String COHORT_CODE = "CHNAJ19004";
    int employeeId;
    String name;

    public int getEmployeeId() {
        return employeeId;

    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;

    }

    public void setName(String name) {
        this.name = name;
    }

    public String getohartCode() {
        return COHORT_CODE;
    }

    void display(Trainee[] t) {
        for (Trainee train : t) {
            System.out.printf(+train.employeeId + "\t" + train.name + "\t" + COHORT_CODE + "\n");
        }
    }

}