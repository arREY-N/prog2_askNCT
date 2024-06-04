public class Patient {
    private String patientId;
    private String name;
    private int age;
    private String sex;
    private String diagnosis;

    public Patient(String patientId, String name, int age, String sex, String diagnosis) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.diagnosis = diagnosis;
    }

    public String getPatientId() {
        return patientId;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getSex() {
        return sex;
    }

    public String getDiagnosis() {
        return diagnosis;
    }
}