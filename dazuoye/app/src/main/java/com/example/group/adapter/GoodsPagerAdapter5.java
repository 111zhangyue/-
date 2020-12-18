package com.example.group.adapter;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import com.example.group.fragment.BookCoverFragment5;
import com.example.group.fragment.BookDetailFragment5;
import com.example.group.fragment.BookfourFragment5;
import com.example.group.fragment.BookthreeFragment5;

import java.util.ArrayList;


public class GoodsPagerAdapter5 extends FragmentStatePagerAdapter {
    private ArrayList<String> mTitleArray; // 声明一个标题文字队列

    // 碎片页适配器的构造函数，传入碎片管理器与标题队列
    public GoodsPagerAdapter5(FragmentManager fm, ArrayList<String> titleArray) {
        super(fm);
        mTitleArray = titleArray;
    }

    // 获取指定位置的碎片Fragment
    public Fragment getItem(int position) {
        if (position == 0) { // 第一页展示书籍封面
            return new BookCoverFragment5();
        } else if (position == 1) { // 第二页展示书籍详情
            return new BookDetailFragment5();
        }
        else if (position == 2){
            return new BookthreeFragment5();}
        else if (position == 3) {
            return new BookfourFragment5();
        }
        return new BookCoverFragment5();
    }

    // 获取碎片Fragment的个数
    public int getCount() {
        return mTitleArray.size();
    }

    // 获得指定碎片页的标题文本
    public CharSequence getPageTitle(int position) {
        return mTitleArray.get(position);
    }
}