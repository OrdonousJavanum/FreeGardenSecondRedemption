package com.henallux.freegarden.view;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.henallux.freegarden.R;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void goToCreateNewAccount(View view)
    {
        Intent intent = new Intent(this, NewAccountActivity.class);
        final Intent msg = intent.putExtra("msg", "Données trop classes");
        startActivityForResult(intent, 1);
    }

    public void goToMainMenu(View view) {
        Intent intent = new Intent(this, MainMenuActivity.class);
        startActivity(intent);
    }
}
