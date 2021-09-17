package org.aplas.basicappx;

public class Distance {
    private double meter;

    public Distance() {
        this.meter = 0;
    }

    public void setMeter(double meter) {
        this.meter = meter;
    }

    public void setInch(double inch) {
        this.meter = inch/39.3701;
    }

    public void setMile(double mile) {
        this.meter = mile/0.000621371;
    }

    public void setFoot(double foot) {
        this.meter = foot/3.28084;
    }

    public double getMeter() {
        return this.meter;
    }

    public double getInch() {
        return this.meter * 39.3701;
    }

    public double getMile() {
        return this.meter * 0.000621371;
    }

    public double getFoot() {
        return this.meter * 3.28084;
    }

    public double convert(String oriUnit, String convUnit, double value) {
        if(oriUnit.equals("Mtr") && convUnit.equals("Inc")) return this.getInch();
        else if(oriUnit.equals("Mtr") && convUnit.equals("Mil")) return this.getMile();
        else if(oriUnit.equals("Mtr") && convUnit.equals("Ft")) return this.getFoot();
        else if(oriUnit.equals("Inc") && convUnit.equals("Mtr")) return this.getMeter();
        else if(oriUnit.equals("Inc") && convUnit.equals("Mil")) return this.getMile();
        else if(oriUnit.equals("Inc") && convUnit.equals("Ft")) return this.getFoot();
        else if(oriUnit.equals("Mil") && convUnit.equals("Mtr")) return this.getMeter();
        else if(oriUnit.equals("Mil") && convUnit.equals("Inc")) return this.getInch();
        else if(oriUnit.equals("Mil") && convUnit.equals("Ft")) return this.getFoot();
        else if(oriUnit.equals("Ft") && convUnit.equals("Mtr")) return this.getMeter();
        else if(oriUnit.equals("Ft") && convUnit.equals("Inc")) return this.getInch();
        else if(oriUnit.equals("Ft") && convUnit.equals("Mil")) return this.getMile();
        return value;
    }
}
