package com.example.newsapp;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

public class JSONData  {


    //receive the parameter jsonResponse, then extract the data fields and return arrayList with articles
    public static ArrayList<Article> jsonExtractData(String jsonResponse){

        //declare arrayList to store the articles
        ArrayList<Article> jsonExtractedData = new ArrayList<>();

        try {
            JSONObject rootJson = new JSONObject(jsonResponse);
            JSONObject response = rootJson.getJSONObject("response");
            JSONArray jsonResultArray = response.getJSONArray("results");
            for(int i =0; i < jsonResultArray.length(); i++){

                JSONObject currentJsonObject = jsonResultArray.getJSONObject(i);
                String articleTitle = currentJsonObject.getString("webTitle");
                String articleSection = currentJsonObject.getString("sectionName");
                String articleDate = currentJsonObject.getString("webPublicationDate");

                jsonExtractedData.add(new Article(articleTitle,articleSection,articleDate));

            }



        } catch (JSONException e) {
            e.printStackTrace();
        }


        return jsonExtractedData;

    }

}
