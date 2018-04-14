package com.app.jasonchesney.fireauth;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class PagerViewAdapter extends FragmentPagerAdapter {
    public PagerViewAdapter(FragmentManager fm) {super(fm);}

        @Override
        public Fragment getItem(int position) {

            switch(position) {
                case 0:
                    ProfileFragment pf = new ProfileFragment();
                    return pf;

                case 1:
                    UserFragment uf = new UserFragment();
                    return uf;

                case 2:
                    NotificationFragment nf = new NotificationFragment();
                    return nf;

                default:
                    return null;
            }
        }

        @Override
        public int getCount() {
            return 3;
        }
}
