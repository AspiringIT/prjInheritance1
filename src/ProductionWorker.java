public class ProductionWorker extends Employee {
    protected String Shift; // 1 = day shift, 2 = night shift
    protected double HourlyRate;

    public void setHourlyRate(double hourlyRate) {
        HourlyRate = hourlyRate;
    }

    public double getHourlyRate() {
        return HourlyRate;
    }

    public void setShift(int Shift){
        if(Shift == 1) {
            this.Shift = "Day Shift";
        }
            else if(Shift ==2) {
            this.Shift = "Night Shift";


        }
    }

    public String getShift() {
        return Shift;
    }
}
