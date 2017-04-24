package ir.ac.aut.ceit.webservice;


import ir.ac.aut.ceit.io.InputReader;
import org.json.JSONException;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ApiWeather {

    public String getRawResponse(String url) {
        String result = "";
        try {
            URL urlWeather = new URL(url);
            HttpURLConnection httpURLConnection = (HttpURLConnection) urlWeather.openConnection();
            if (httpURLConnection.getResponseCode() == HttpURLConnection.HTTP_OK) {
                result = InputReader.read(httpURLConnection.getInputStream());
            }
        } catch (IOException | JSONException e) {
            Logger.getLogger(ApiWeather.class.getName()).log(Level.SEVERE, null, e);
            System.exit(0);
        }
        return result;
    }


}
