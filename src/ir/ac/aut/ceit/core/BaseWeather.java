package ir.ac.aut.ceit.core;

import ir.ac.aut.ceit.webservice.ApiWeather;
import org.json.JSONException;

public abstract class BaseWeather {

    private static final String ENDPOINT = "http://api.openweathermap.org/data/2.5/";
    private static final String APP_ID = "&APPID=feaf4519da7db82076511ec7854ea2bb";

    private ApiWeather apiWeather = new ApiWeather();

    protected abstract String getWeatherType();

    protected abstract String parseJson(String json) throws JSONException;

    public String getInfoById(String id) {
        String json = getJsonById(id);
        return parseJson(json);
    }

    public String getInfoByName(String name) {
        String json = getJsonByName(name);
        return parseJson(json);
    }


    private String getJsonById(String id) {
        String url = ENDPOINT + getWeatherType() + "?id=" + id + APP_ID;
        return apiWeather.getRawResponse(url);
    }

    private String getJsonByName(String name) {
        String url = ENDPOINT + getWeatherType() + "?q=" + name + APP_ID;
        return apiWeather.getRawResponse(url);
    }

//    private String getJsonByCoord(String lat, String lon) {
//        //todo: implement this method yourself
//
//        return apiWeather.getRawResponse("");
//    }
//
//    public String getInfoByCoord(String lat, String lon) {
//        String json = getJsonByCoord(lat, lon);
//        return parseJson(json);
//    }
}
