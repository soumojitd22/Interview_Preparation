package sd.test.patterns.adapter;

public class LeaveAdapter implements Leave {
    @Override
    public void populateLeave(LeaveWSC leaveWSCData) {
        System.out.println("Populating " + leaveWSCData.getLeaveData().replaceFirst("WSC ", ""));
    }
}
