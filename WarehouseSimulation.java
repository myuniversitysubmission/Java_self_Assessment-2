import java.util.ArrayList;
import java.util.List;

// ------------------- AGV CLASS -------------------
class AGV {
    private String id;
    private double batteryLoad;   // percentage
    private double consumption;   // energy per operation
    private double chargingTime;  // in minutes
    private String position;
    private float maxSpeed;
    private float actSpeed;

    public AGV(String id, double batteryLoad, double consumption, double chargingTime,
               String position, float maxSpeed, float actSpeed) {
        this.id = id;
        this.batteryLoad = batteryLoad;
        this.consumption = consumption;
        this.chargingTime = chargingTime;
        this.position = position;
        this.maxSpeed = maxSpeed;
        this.actSpeed = actSpeed;
    }

    public double getConsumption() {
        return consumption;
    }

    public String getId() {
        return id;
    }
}

// ------------------- OPERATION CLASS -------------------
class IOperation {
    private String id;
    private String description;
    private double nominalTime;   // duration in minutes
    private List<AGV> resources;  // AGVs used

    public IOperation(String id, String description, double nominalTime) {
        this.id = id;
        this.description = description;
        this.nominalTime = nominalTime;
        this.resources = new ArrayList<>();
    }

    public void addAGV(AGV agv) {
        resources.add(agv);
    }

    public double getDuration() {
        return nominalTime;
    }

    public List<AGV> getResources() {
        return resources;
    }
}

// ------------------- INDUSTRIAL PROCESS CLASS -------------------
class IndustrialProcess {
    private String id;
    private List<IOperation> operations;

    public IndustrialProcess(String id) {
        this.id = id;
        this.operations = new ArrayList<>();
    }

    public void addOperation(IOperation operation) {
        operations.add(operation);
    }

    // Calculate total time
    public double processDuration() {
        double total = 0;
        for (IOperation op : operations) {
            total += op.getDuration();
        }
        return total;
    }

    // Calculate energy consumption
    public double processResources() {
        double energy = 0;
        for (IOperation op : operations) {
            for (AGV agv : op.getResources()) {
                energy += agv.getConsumption();
            }
        }
        return energy;
    }

    // Count AGVs used
    public int countAGVs() {
        int count = 0;
        for (IOperation op : operations) {
            count += op.getResources().size();
        }
        return count;
    }
}

// ------------------- MAIN SIMULATION -------------------
public class WarehouseSimulation {
    public static void main(String[] args) {
        // Create AGVs
        AGV agv1 = new AGV("AGV1", 100, 5, 30, "Dock1", 20, 15);
        AGV agv2 = new AGV("AGV2", 90, 6, 25, "Dock2", 18, 12);

        // Create Operations
        IOperation op1 = new IOperation("OP1", "Load items", 15);
        op1.addAGV(agv1);

        IOperation op2 = new IOperation("OP2", "Transport items", 20);
        op2.addAGV(agv2);

        // Create Industrial Process
        IndustrialProcess process = new IndustrialProcess("Process1");
        process.addOperation(op1);
        process.addOperation(op2);

        // Print Simulation Results
        System.out.println("Total Process Duration: " + process.processDuration() + " minutes");
        System.out.println("Total AGVs used: " + process.countAGVs());
        System.out.println("Total Energy Consumption: " + process.processResources() + " units");
    }
}