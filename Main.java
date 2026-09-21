public class Main {
    public static void main(String[] args) {
        AttendanceSystem attendanceSystem = new AttendanceSystem();
        GradingSystem gradingSystem = new GradingSystem();
        LibrarySystem librarySystem = new LibrarySystem();

        SchoolManagementApp attAdapter = new AttendanceSystemAdapter(attendanceSystem);
        SchoolManagementApp gradeAdapter = new GradingSystemAdapter(gradingSystem);
        SchoolManagementApp libAdapter = new LibrarySystemAdapter(librarySystem);

        System.out.println("---Testing Adapters---");
        attAdapter = integrateSystem();
        gradeAdapter = integrateSystem();
        libAdapter = integrateSystem();
    }
}

