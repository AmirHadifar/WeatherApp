package ir.ac.aut.ceit;

import ir.ac.aut.ceit.core.BaseWeather;
import ir.ac.aut.ceit.core.CurrentWeather;
import ir.ac.aut.ceit.core.ForecastWeather;
import ir.ac.aut.ceit.io.OutputWriter;
import ir.ac.aut.ceit.utility.Utility;

public class Main {


    public static void main(String[] args) {

        BaseWeather weather1 = new CurrentWeather();
        String result1 = weather1.getInfoByName("London");
        OutputWriter.write(result1, Utility.getNewPath());
        System.out.println(result1);

        BaseWeather weather2 = new ForecastWeather();
        String result2 = weather2.getInfoById("2643743");
        OutputWriter.write(result2, Utility.getNewPath());
        System.out.println(result2);

        BaseWeather weather3 = new CurrentWeather();
        String result3 = weather3.getInfoByName("Newyork");
        OutputWriter.write(result3, Utility.getNewPath());
        System.out.println(result3);


        BaseWeather weather4 = new ForecastWeather();
        String result4 = weather4.getInfoById("5128581");
        OutputWriter.write(result4, Utility.getNewPath());
        System.out.println(result4);
    }

}
