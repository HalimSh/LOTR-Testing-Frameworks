package org.example;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;

import static java.lang.String.valueOf;

public class LOTRReader {
    static ObjectMapper objectMapper = new ObjectMapper();
    private HttpURLConnection httpURLConnection;

    public static LOTRPOJO readLOTRasJSON(String path) {
        LOTRPOJO lotrpojo = new LOTRPOJO();
        try {
            objectMapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
            lotrpojo = objectMapper.readValue(new URL(path), LOTRPOJO.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return lotrpojo;
    }

    public HttpURLConnection getHeader(String path) {

        try {
            URL url = new URL(path);
            HttpURLConnection httpurlConnection = (HttpURLConnection) url.openConnection();
        } catch (IOException e) {
            e.printStackTrace();
        } return httpURLConnection;
    }

    public String getStatus(String path) {
        String response = "";
        try {
            URL url = new URL(path);
            URLConnection urlConnection = url.openConnection();
            HttpURLConnection httpURLConnection = (HttpURLConnection)url.openConnection();
            response = String.valueOf(httpURLConnection.getResponseCode());
        } catch (IOException e) {
            e.printStackTrace();
        } return response;
    }
}
