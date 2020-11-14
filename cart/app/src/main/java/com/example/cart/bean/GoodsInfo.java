package com.example.cart.bean;

import com.example.cart.R;

import java.util.ArrayList;

public class GoodsInfo {
    public long rowid; // 行号
    public int sn; // 序号
    public String name; // 名称
    public String desc; // 描述
    public float price; // 价格
    public String thumb_path; // 小图的保存路径
    public String pic_path; // 大图的保存路径
    public int thumb; // 小图的资源编号
    public int pic; // 大图的资源编号

    public GoodsInfo() {
        rowid = 0L;
        sn = 0;
        name = "";
        desc = "";
        price = 0;
        thumb_path = "";
        pic_path = "";
        thumb = 0;
        pic = 0;
    }

    // 声明一个手机商品的名称数组
    private static String[] mNameArray = {
            "孤单星球", "白夜行", "幻夜", "三体", "黑暗森林", "描述幸福","35岁前，铺平人生的道路","嫌疑人x的献身"
    };
    // 声明一个手机商品的描述数组
    private static String[] mDescArray = {
            "孤单星球 独木舟著",
            "白夜行 东野圭吾著 ",
            "幻夜 东野圭吾著 白夜行的姊妹篇",
            "三体 刘慈欣著",
            "黑暗森林 三体的续作，刘慈欣著",
            "描述幸福  教会你为何自己不幸福",
            "35岁前，铺平人生的道路 教会你如何变得成功",
            "嫌疑人x的献身 东野圭吾著"
    };
    // 声明一个手机商品的价格数组
    private static float[] mPriceArray = {68, 399, 29, 28, 98, 56,55,54};
    // 声明一个手机商品的小图数组
    private static int[] mThumbArray = {
            R.drawable.a, R.drawable.b, R.drawable.c,
            R.drawable.d, R.drawable.e, R.drawable.f,R.drawable.third
            ,R.drawable.xianyiren
    };
    // 声明一个手机商品的大图数组
    private static int[] mPicArray = {
            R.drawable.a, R.drawable.b, R.drawable.c,
            R.drawable.d, R.drawable.e, R.drawable.f,R.drawable.third,R.drawable.huawei
    };

    // 获取默认的手机信息列表
    public static ArrayList<GoodsInfo> getDefaultList() {
        ArrayList<GoodsInfo> goodsList = new ArrayList<GoodsInfo>();
        for (int i = 0; i < mNameArray.length; i++) {
            GoodsInfo info = new GoodsInfo();
            info.name = mNameArray[i];
            info.desc = mDescArray[i];
            info.price = mPriceArray[i];
            info.thumb = mThumbArray[i];
            info.pic = mPicArray[i];
            goodsList.add(info);
        }
        return goodsList;
    }
}
