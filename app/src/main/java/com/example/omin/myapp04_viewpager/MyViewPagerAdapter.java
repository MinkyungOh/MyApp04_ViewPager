package com.example.omin.myapp04_viewpager;

import android.app.Fragment;
import android.app.FragmentManager;
import android.support.v13.app.FragmentStatePagerAdapter;

public class MyViewPagerAdapter extends FragmentStatePagerAdapter {

    int images[] = {R.drawable.image1, R.drawable.image2, R.drawable.image3, R.drawable.image4};
    public MyViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int i) {
        return ImageFragment.newInstance(images[i]);
    }

    @Override
    public int getCount() {
        return images.length;
    }
}
