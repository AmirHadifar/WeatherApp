package ir.ac.aut.ceit.core;


import org.json.JSONException;
import org.json.JSONObject;

import static ir.ac.aut.ceit.core.Constant.*;

public class ForecastWeather extends BaseWeather {

    private static final String TYPE_FORECAST = "forecast";


    @Override
    protected String parseJson(String json) throws JSONException {
        JSONObject jsonObject = new JSONObject(json);
        JSONObject jsonObjectCity = jsonObject.getJSONObject(CONST_CITY);
        String resultCountry = jsonObjectCity.getString(CONST_COUNTRY);
        String resultName = jsonObjectCity.getString(CONST_NAME);
        JSONObject jsonObjectCoord = jsonObjectCity.getJSONObject(CONST_COORD);
        Double resultLat = jsonObjectCoord.getDouble(CONST_LAT);
        Double resultLon = jsonObjectCoord.getDouble(CONST_LON);

        //parse rest of result yourself...

        return CONST_LAT + ":" + resultLon + " " + CONST_LAT + ":" + resultLat + " " +
                CONST_COUNTRY + ":" + resultCountry + " " + CONST_NAME + ":" + resultName;
    }


    @Override
    protected String getWeatherType() {
        return TYPE_FORECAST;
    }

}
