/**
 * Write a program that demonstrates that, no matter how many objects
 * you create of a particular class, there is only one instance of a particular static field in that
 * class.
 */

public class OnlyOneInstanceClassTask8 {

    static int number;

    private int instance;
    private String instanceName;

    public int getInstance() {
        return instance;
    }

    public void setInstance(int instance) {
        this.instance = instance;
    }

    public String getInstanceName() {
        return instanceName;
    }

    public void setInstanceName(String instanceName) {
        this.instanceName = instanceName;
    }
}

