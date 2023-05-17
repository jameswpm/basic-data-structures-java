public class Patient {

    private String name;
    private Integer identifier;
    private Status currentStatus;
    
    private Patient nextPatient;


    public Patient(String name, Integer identifier, Status currentStatus) {
        this.name = name;
        this.identifier = identifier;
        this.currentStatus = currentStatus;   
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getIdentifier() {
        return this.identifier;
    }

    public void setIdentifier(Integer identifier) {
        this.identifier = identifier;
    }

    public Status getCurrentStatus() {
        return this.currentStatus;
    }

    public void setCurrentStatus(Status currentStatus) {
        this.currentStatus = currentStatus;
    }

    public Patient getNextPatient() {
        return this.nextPatient;
    }

    public void setNextPatient(Patient nextPatient) {
        this.nextPatient = nextPatient;
    }
}
