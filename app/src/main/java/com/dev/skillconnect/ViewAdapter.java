package com.dev.skillconnect;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by Admin on 02-03-2018.
 */

public class ViewAdapter extends FragmentPagerAdapter{



    private Context mContext;
    public ViewAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    // This determines the fragment for each tab
    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new User_login();
        }
        else if (position == 1)
        {
            return new Register();
        }
        else
            return null;
    }

    // This determines the number of tabs
    @Override
    public int getCount() {
        return 2;
    }

    // This determines the title for each tab
    @Override
    public CharSequence getPageTitle(int position) {
        // Generate title based on item position
        switch (position) {
            case 0:
                return mContext.getString(R.string.LOGIN);
            case 1:
                return mContext.getString(R.string.REGISTER);
                default:
                    return null;
        }
    }

}
