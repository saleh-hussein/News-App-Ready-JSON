package com.example.newsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

   //declare arrayList to store the news (Article name, article section and article date)
    ArrayList<Article> data;

    private static String jsonResponse = "{\"response\":{\"status\":\"ok\",\"userTier\":\"developer\",\"total\":26187,\"startIndex\":1,\"pageSize\":10,\"currentPage\":1,\"pages\":2619,\"orderBy\":\"relevance\",\"results\":[{\"id\":\"politics/2019/nov/04/tv-election-debates-must-include-the-lib-dems-leader\",\"type\":\"article\",\"sectionId\":\"politics\",\"sectionName\":\"Politics\",\"webPublicationDate\":\"2019-11-04T17:52:51Z\",\"webTitle\":\"TV election debates must include the Lib Dems’ leader | Letters\",\"webUrl\":\"https://www.theguardian.com/politics/2019/nov/04/tv-election-debates-must-include-the-lib-dems-leader\",\"apiUrl\":\"https://content.guardianapis.com/politics/2019/nov/04/tv-election-debates-must-include-the-lib-dems-leader\",\"isHosted\":false,\"pillarId\":\"pillar/news\",\"pillarName\":\"News\"},{\"id\":\"politics/2019/oct/30/liberal-democrats-face-being-frozen-out-of-live-tv-debates-general-election\",\"type\":\"article\",\"sectionId\":\"politics\",\"sectionName\":\"Politics\",\"webPublicationDate\":\"2019-10-30T19:00:46Z\",\"webTitle\":\"Lib Dems face being frozen out of any live TV debates\",\"webUrl\":\"https://www.theguardian.com/politics/2019/oct/30/liberal-democrats-face-being-frozen-out-of-live-tv-debates-general-election\",\"apiUrl\":\"https://content.guardianapis.com/politics/2019/oct/30/liberal-democrats-face-being-frozen-out-of-live-tv-debates-general-election\",\"isHosted\":false,\"pillarId\":\"pillar/news\",\"pillarName\":\"News\"}]}}";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //store the news arrayList in data
        data = JSONData.jsonExtractData(jsonResponse);




        //declare adapter
        CustomAdapter adapter = new CustomAdapter(this, data);

        //declare list item
        ListView listView = (ListView) findViewById(R.id.list_view);

        //set list item with adapter
        listView.setAdapter(adapter);

    }
}
