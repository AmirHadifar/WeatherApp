package ir.ac.aut.ceit.core;


import org.json.JSONObject;

import static ir.ac.aut.ceit.core.Constant.*;

public class CurrentWeather extends BaseWeather {

    private static final String TYPE_WEATHER = "weather";


    @Override
    protected String parseJson(String json) {

        JSONObject jsonObject = new JSONObject(json);
        JSONObject jsonObjectCoord = jsonObject.getJSONObject(CONST_COORD);
        Double resultLon = jsonObjectCoord.getDouble(CONST_LON);
        Double resultLat = jsonObjectCoord.getDouble(CONST_LAT);
        JSONObject jsonObjectSys = jsonObject.getJSONObject(CONST_SYS);
        String resultCountry = jsonObjectSys.getString(CONST_COUNTRY);

        //parse rest of result yourself...

        return CONST_LAT + ":" + resultLon + " " + CONST_LAT + ":" + resultLat + " " +
                CONST_COUNTRY + ":" + resultCountry + " ";
    }

    @Override
    protected String getWeatherType() {
        return TYPE_WEATHER;
    }
}
