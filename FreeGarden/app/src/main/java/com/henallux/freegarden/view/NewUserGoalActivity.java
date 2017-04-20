package com.henallux.freegarden.view;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.henallux.freegarden.R;

public class NewUserGoalActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_user_goal);
    }
/*
    public void goToFindGarden(View view) {
        Intent intent = new Intent(this, FindGardenActivity.class);
        startActivity(intent);
    }
    */
    public void goToNewGarden(View view) {
        Intent intent = new Intent(this, GardenRegisterActivity.class);
        startActivity(intent);
    }
}
