package com.example.android.tourguide;


import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class FragmentPageAdapter extends FragmentPagerAdapter {
    private Context mContext;

    public FragmentPageAdapter (Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new InfoFragment();
            case 1:
                return new CityFragment();
            case 2:
                return new HistoricalFragment();
            case 3:
                return new EventFragment();
        }
        return null;
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return mContext.getString(R.string.info);
            case 1:
                return mContext.getString(R.string.city);
            case 2:
                return mContext.getString(R.string.historical);
            case 3:
                return mContext.getString(R.string.event);
        }
        return super.getPageTitle(position);
    }
}