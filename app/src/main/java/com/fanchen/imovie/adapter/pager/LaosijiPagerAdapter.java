package com.fanchen.imovie.adapter.pager;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;

import com.fanchen.imovie.base.BaseFragmentAdapter;
import com.fanchen.imovie.fragment.VideoListFragment;
import com.fanchen.imovie.retrofit.service.LaosijiService;

/**
 * LaosijiPagerAdapter
 * Created by fanchen on 2018/7/27.
 */
public class LaosijiPagerAdapter extends BaseFragmentAdapter {
    private final String[] TITLES = new String[]{"首页","电视剧", "电影", "动漫","综艺"};
    private final String[] PATHS = new String[]{"","dianshiju", "dianying", "dongman","zongyi"};
    private final Boolean[] BANGUMI = new Boolean[]{true,false,false,true,false};

    public LaosijiPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public String[] getTitles() {
        return TITLES;
    }

    @Override
    public Fragment createFragment(int position) {
        return VideoListFragment.newInstance(PATHS[position], getExtendInfo().toString(), 1, false, false, false, null, BANGUMI[position]);
    }

    @Override
    public Object getExtendInfo() {
        return LaosijiService.class.getName();
    }
}
