package sd.test.patterns.adapter;

public class Client {
    public static void main(String[] args) {
        LeaveWSC leaveWSC = new LeaveWSCData();
        Leave leave = new LeaveAdapter();
        leave.populateLeave(leaveWSC);
    }
}
