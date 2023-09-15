public class ProductionWorker extends Employee {
    protected int Shift; // 1 = day shift, 2 = night shift
    protected double HourlyRate;

    public void setHourlyRate(double hourlyRate) {
        HourlyRate = hourlyRate;
    }

    public double getHourlyRate() {
        return HourlyRate;
    }

    public void setShift(int Shift){
        this.Shift = Shift;
    }

    public int getShift() {
        return Shift;
    }
}
