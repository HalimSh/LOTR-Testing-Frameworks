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

    public static LOTRPOJO readLOTRasJSON(String path) {
        LOTRPOJO lotrpojo = new LOTRPOJO();
        try {
            //objectMapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
            lotrpojo = objectMapper.readValue(new URL(path), LOTRPOJO.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return lotrpojo;
    }

    public String getHeader(String path) {
        String header = "";
        try {
            URL url = new URL(path);
            URLConnection urlConnection = url.openConnection();
            header = String.valueOf(urlConnection.getHeaderFields());
        } catch (IOException e) {
            e.printStackTrace();
        } return header;
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
