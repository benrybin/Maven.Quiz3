package rocks.zipcode.io.quiz3.collections;

/**
 * @author leon on 10/12/2018.
 */
public class Lab {
    String labName;

    public Lab() {


        Lab lab;
    }

    public Lab(String labName) {
    }


    public String getName() {
        return this.labName;
    }

    public void setStatus(LabStatus labStatus) {
        //LabStatus.PENDING;


    }

    public LabStatus getStatus() {
        return LabStatus.PENDING;
    }
}
