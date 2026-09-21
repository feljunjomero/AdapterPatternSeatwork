public class LibrarySystemAdapter {
    private LibrarySystem manage;
    public LibrarySystemAdapter(LibrarySystem manage) {
        this.manage = manage;
    }
    @Override
    public void integrateSystem() {
        manage.manageBooks();
    }
}