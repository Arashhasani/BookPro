package com.example.arash.bookpro;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by Arash on 5/17/2017.
 */

public class AdapterFragment extends FragmentPagerAdapter {

    final int page_count=3;
    private String tabtitle[]=new String[]{"علمی" , "تفریحی" , "علاقه مندی"};

    public AdapterFragment(FragmentManager fm){
        super(fm);
    }
    @Override
    public Fragment getItem(int position) {
        return PageFragment.newInstance(position+1);
    }

    @Override
    public int getCount() {
        return page_count;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return tabtitle[position];
    }
}
