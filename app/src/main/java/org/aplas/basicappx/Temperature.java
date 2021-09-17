package org.aplas.basicappx;

public class Temperature {
    private double celcius;

    public Temperature() {
        this.celcius = 0;
    }

    public double getCelcius() {
        return celcius;
    }

    public void setCelcius(double celcius) {
        this.celcius = celcius;
    }

    public double setFahrenheit(double fahrenheit) {
        return celcius = (fahrenheit-32)/9*5;
    }

    public double getFahrenheit() {
        return (this.celcius * 9/5) + 32;
    }

    public double setKelvins(double kelvins) {
        return this.celcius = kelvins-273.15;
    }

    public double getKelvins() {
        return this.celcius + 273.15;
    }

    public double convert(String oriUnit, String convUnit, double value) {
        if(oriUnit.equals("°C") && convUnit.equals("°F")) return this.getFahrenheit();
        else if(oriUnit.equals("°C") && convUnit.equals("K")) return this.getKelvins();
        else if(oriUnit.equals("°F") && convUnit.equals("K")) return this.getKelvins();
        else if (oriUnit.equals("°F") && convUnit.equals("°F")) return this.getFahrenheit();
        else if (oriUnit.equals("°F") && convUnit.equals("°C")) return  this.getCelcius();
        else if (oriUnit.equals("K") && convUnit.equals("°F")) return this.getFahrenheit();
        else if (oriUnit.equals("K") && convUnit.equals("°C")) return this.getCelcius();
        else if (oriUnit.equals("K") && convUnit.equals("K")) return this.getKelvins();
        return value;
    }

}
