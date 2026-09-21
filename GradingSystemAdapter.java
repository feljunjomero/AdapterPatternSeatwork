public class GradingSystemAdapter{
    private GradingSystem record;
    public GradingSystemAdapter(GradingSystem record) {
        this.record = record;
    } 
    @Override
    public void integrateSystem() {
        record.recordGrades();
    }
}  