package com.henallux.freegarden.view;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import com.henallux.freegarden.controller.TweetAdapter;
import com.henallux.freegarden.model.Tweet;

import com.henallux.freegarden.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by DarK LorD on 09/12/2016.
 */

public class MainMenuActivity extends AppCompatActivity {

    ListView mGardenList;
    String[] gardens = new String[]{
            "La poterne des peupliers", "Rainbow garden", "Les roses de Martha",
            "Le poireau Agile", "Le Semi Urbain", "La Note Bleue"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);

        mGardenList = (ListView) findViewById(R.id.gardenList);
/*
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(MainMenuActivity.this,
                android.R.layout.simple_list_item_1, gardens);
        mGardenList.setAdapter(adapter);*/

        //afficherListeNoms();
        afficherListeTweets();
    }
    private void afficherListeNoms(){
        //android.R.layout.simple_list_item_1 est une vue disponible de base dans le SDK android,
        //Contenant une TextView avec comme identifiant "@android:id/text1"

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(MainMenuActivity.this, android.R.layout.simple_list_item_1, gardens);
        mGardenList.setAdapter(adapter);
    }

    private List<Tweet> genererTweets(){
        List<Tweet> tweets = new ArrayList<Tweet>();
        tweets.add(new Tweet(Color.BLACK, "Florent", "Mon premier tweet !"));
        tweets.add(new Tweet(Color.BLUE, "Kevin", "C'est ici que ça se passe !"));
        tweets.add(new Tweet(Color.GREEN, "Logan", "Que c'est beau..."));
        tweets.add(new Tweet(Color.RED, "Mathieu", "Il est quelle heure ??"));
        tweets.add(new Tweet(Color.GRAY, "Willy", "On y est presque"));
        return tweets;
    }

    private void afficherListeTweets(){
        List<Tweet> tweets = genererTweets();

        TweetAdapter adapter = new TweetAdapter(MainMenuActivity.this, tweets);
        mGardenList.setAdapter(adapter);
    }
}
