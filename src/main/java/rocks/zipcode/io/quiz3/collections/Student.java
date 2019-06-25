package rocks.zipcode.io.quiz3.collections;

import java.util.List;

/**
 * @author leon on 10/12/2018.
 */
public class Student {
    Lab lab;
    List<Lab> labs;

    public Student() {
        this(null);
    }

    public Student(List<Lab> labs) {

        this.labs = labs;
    }

    public Lab getLab(String labName) {

        for (int i = 0; i <labs.size() ; i++) {
            if(labs.get(i).getName()==labName){
                return labs.get(i);
            }

        }

        return null;
    }

    public void setLabStatus(String labName, LabStatus labStatus) {
        lab.labName=labName;
        lab.setStatus(labStatus);

    }

    public void forkLab(Lab lab) {
        this.lab = lab;
    }

    public LabStatus getLabStatus(String labName) {

       return this.lab.getStatus();
    }
}
