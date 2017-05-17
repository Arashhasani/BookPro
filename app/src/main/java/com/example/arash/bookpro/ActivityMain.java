package com.example.arash.bookpro;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class ActivityMain extends AppCompatActivity {

    ViewPager viewpager;
    TabLayout tabstrip;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTabOption();

    }

    private void setTabOption() {
        viewpager=(ViewPager)findViewById(R.id.viewpager);
        viewpager.setAdapter(new AdapterFragment(getSupportFragmentManager()));
        tabstrip=(TabLayout)findViewById(R.id.tab);
        tabstrip.setupWithViewPager(viewpager);
    }
}
