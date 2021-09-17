package org.aplas.basicappx;

public class Weight {
    private double gram;

    public Weight() {
        this.gram = 0;
    }

    public void setGram(double gram) {
        this.gram = gram;
    }

    public void setOunce(double ounce) {
        this.gram = ounce*28.3495231;
    }

    public void setPound(double pound) {
        this.gram = pound*453.59237;
    }

    public double getGram() {
        return this.gram;
    }

    public double getOunce() {
        return this.gram/28.3495231;
    }

    public double getPound() {
        return this.gram/453.59237;
    }

    public double convert(String oriUnit, String convUnit, double value) {
        if(oriUnit.equals("Grm") && convUnit.equals("Onc")) return this.getOunce();
        else if(oriUnit.equals("Grm") && convUnit.equals("Pnd")) return this.getPound();
        else if(oriUnit.equals("Onc") && convUnit.equals("Grm")) return this.getGram();
        else if(oriUnit.equals("Onc") && convUnit.equals("Pnd")) return this.getPound();
        else if(oriUnit.equals("Pnd") && convUnit.equals("Grm")) return this.getGram();
        else if(oriUnit.equals("Pnd") && convUnit.equals("Onc")) return this.getOunce();
        return value;
    }
}
