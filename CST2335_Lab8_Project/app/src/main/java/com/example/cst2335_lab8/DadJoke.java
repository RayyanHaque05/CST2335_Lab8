package com.example.cst2335_lab8;

import android.os.Bundle;
import com.google.android.material.navigation.NavigationView;

public class DadJoke extends BaseActivity implements NavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dad_joke);
        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle("Dad Joke");
        }
    }
}
