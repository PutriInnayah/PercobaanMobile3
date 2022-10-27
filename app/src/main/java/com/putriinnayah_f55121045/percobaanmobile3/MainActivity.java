package com.putriinnayah_f55121045.percobaanmobile3;

import static com.putriinnayah_f55121045.percobaanmobile3.R.*;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.annotation.SuppressLint;
import android.os.Bundle;

import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    private TabLayout tabLayout;
    private AppBarLayout appBarLayout;
    private ViewPager viewPager;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(layout.activity_main);
        tabLayout = (TabLayout) findViewById(id.tablayout_id);
        appBarLayout = (AppBarLayout) findViewById(id.appBar_id);
        viewPager = (ViewPager) findViewById(id.viewpager_id);
        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
        adapter.ADDFragment(new FragmentHome(), "Home");
        adapter.ADDFragment(new FragmentExplore(), "Explore");
        adapter.ADDFragment(new FragmentAccount(),"Account");
        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);
    }
}

