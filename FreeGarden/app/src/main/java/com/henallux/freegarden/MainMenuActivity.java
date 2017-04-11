package com.henallux.freegarden;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

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

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(MainMenuActivity.this,
                android.R.layout.simple_list_item_1, gardens);
        mGardenList.setAdapter(adapter);
    }
}
