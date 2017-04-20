package com.henallux.freegarden.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;

import com.henallux.freegarden.R;

public class NewAccountActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_account);
    }
    public void goToNewGoal(View view) {
        Intent intent = new Intent(this, NewUserGoalActivity.class);
        startActivity(intent);
    }
}
