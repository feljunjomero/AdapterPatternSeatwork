public class AttendanceSystemAdapter {
    private AttendanceSystem mark;
    public AttendanceSystemAdapater(AttendanceSystem mark) {
        this.mark = mark;
    }

    @Override
    public void integrateSystem() {
        mark.markAttendance();        
    }
}





