
public class PatientsList {
    
    public Patient current;
    private Patient head;
    private Patient tail;

    public PatientsList() {
        current = null;
        head = null;
        tail = null;
    }

    public void newPatient(String name, Integer identifier, Status currentStatus) {
        Patient entry = new Patient(name, identifier, currentStatus);

        if (head == null) {
            head = entry;
            tail = entry;
        } else {
            tail.setNextPatient(entry);
            tail = entry;
        }
    }

    public void listPatients() {

        if (head != null) {
            current = head;
            while (current != tail) {
                System.out.println("Patient: " + current.getIdentifier());
                System.out.println("Name: " + current.getName() + " Status: " + current.getCurrentStatus());
                current = current.getNextPatient();
            }
            System.out.println("Patient: " + tail.getIdentifier());
            System.out.println("Name: " + tail.getName() + " Status: " + tail.getCurrentStatus());
        }
    }    

    public void excludePatient(Integer identifier) {

        if (head != null) {

            if (head.getIdentifier() == identifier) {
                //exclude head
                head = head.getNextPatient();
            } else {
                Patient previous = head;
                current = head.getNextPatient();
                while (current != tail) {
                    
                    if (current.getIdentifier() == identifier) {
                        previous.setNextPatient(current.getNextPatient());
                        break;
                    } 
                    previous = current;                   
                    current = current.getNextPatient();
                }
                if (tail.getIdentifier() == identifier) {
                    previous.setNextPatient(null);
                    tail = previous;
                }
            }
        }
    }

    public static void main(String[] args) {
        PatientsList myList = new PatientsList();

        //init
        myList.newPatient("James", 1, Status.OK);

        //include 4
        myList.newPatient("Lana", 10, Status.OK);
        myList.newPatient("Rafa", 23, Status.NEED_CTI);
        myList.newPatient("Miranda", 2, Status.SICK);
        myList.newPatient("Carlinhos", 62, Status.OK);

        //print
        myList.listPatients();

        // System.out.println("Trying excluding head");

        // //exclude head
        // myList.excludePatient(1);
        // //print
        // myList.listPatients();

        // System.out.println("Trying excluding tail");

        // //exclude tail
        // myList.excludePatient(62);
        // //print
        // myList.listPatients();

        System.out.println("Trying excluding anything");

        //exclude 10
        myList.excludePatient(10);
        //print
        myList.listPatients();
    }

}
