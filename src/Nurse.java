public class Nurse {
    private String username;
    private String nurseName;
    private String sex;
    private int age;
    private String position;
    private String shiftSchedule;
    private String areaAssignment;
    private String patientsFolder;
    
    public Nurse(String username, String nurseName, int age, String sex, String position, String shiftSchedule, String areaAssignment, String patientsFolder){
        this.username = username;
        this.nurseName = nurseName;
        this.age = age;
        this.position = position;
        this.shiftSchedule = shiftSchedule;
        this.areaAssignment = areaAssignment;
        this.patientsFolder = patientsFolder;
    }

    public void setPosition(String position){
        this.position = position;
    }

    public void setShiftSchedule(String shiftSchedule){
        this.shiftSchedule = shiftSchedule;
    }

    public void setAreaAssignment(String areaAssignment){
        this.areaAssignment = areaAssignment;
    }

    public void setPatientFolder(String patientsFolder){
        this.patientsFolder = patientsFolder;
    }

    public String getUsername(){
        return username;
    }

    public String getNurseName(){
        return nurseName;
    }

    public int getAge(){
        return age;
    }

    public String getSex(){
        return sex;
    }

    public String getPosition(){
        return position;
    }

    public String getShiftSchedule(){
        return shiftSchedule;
    }

    public String getAreaAssignment(){
        return areaAssignment;
    }

    public String getPatientsFolder(){
        return patientsFolder;
    }

    /* public static void NursePage(Scanner scan, String username){
        Nurse nurse = NurseDatabase.getNurse(username);

        System.out.println(getNurseName);
        System.out.println(getAge);
        System.out.println(getSex);
        System.out.println(getPosition);
        System.out.println(getShiftSchedule);
        System.out.println(getAreaAssignment);
        System.out.println(getPatientFolder);
        
    } 
    
    
    
    */

}
