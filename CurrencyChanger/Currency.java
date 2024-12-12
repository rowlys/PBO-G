import java.util.List;
import java.util.ArrayList;

public class Currency {
    protected String name;
    protected double rateFromIDR;
    private List<Double> history;

    public Currency(String name, double rateFromIDR) {
        this.name = name;
        this.rateFromIDR = rateFromIDR;
        this.history = new ArrayList<>();
        this.history.add(rateFromIDR);        
    }

    public String getName() {
        return name;
    }

    public double getRateFromIDR() {
        return rateFromIDR;
    }

    public void fluctuateRate() {
        double fluctuation = 0.95 + (1.05 - 0.95) * Math.random(); // ±5% fluctuation
        rateFromIDR *= fluctuation;
        history.add(rateFromIDR);
    }
    
    public void economicalCrash() {
        rateFromIDR = rateFromIDR * (0.05 + (0.1) * Math.random());
    }
}
