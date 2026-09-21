public class Main {
    public static void main(String[] args) {
        AttendanceSystem attendanceSystem = new AttendanceSystem();
        GradingSystem gradingSystem = new GradingSystem();
        LibrarySystem librarySystem = new LibrarySystem();

        SchoolManagementApp attAdapter = new AttendanceSystemAdapter(mark);
        SchoolManagementApp gradeAdapter = new GradingSystemAdapter(record);
        SchoolManagementApp libAdapter = new LibrarySystemAdapter(manage);

        System.out.println("---Testing Adapters---");
        attAdapter = integrateSystem();
        gradeAdapter = integrateSystem();
        libAdapter = integrateSystem();
    }
}

