package com.example.group.bean;

import com.example.group.R;

import java.util.ArrayList;

public class GoodsInfo1 {
    public long rowid; // 行号
    public int sn; // 序号
    public String name; // 名称
    public String desc; // 描述
    public float price; // 价格
    public String thumb_path; // 小图的保存路径
    public String pic_path; // 大图的保存路径
    public int thumb; // 小图的资源编号
    public int pic; // 大图的资源编号

    public GoodsInfo1() {
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
            "解忧杂货铺", "谁杀了他", "我杀了他", "白夜行", "落幕时祈祷", "大雪中的村庄","浡论13","恶意"
    };
    // 声明一个手机商品的描述数组
    private static String[] mDescArray = {
            "解忧杂货店+嫌疑X的献身+恶意+时生 东野圭吾全套共4册外国恐怖悬疑【新华正版",
            "【正版包邮】谁杀了她 侦探推理悬疑小说 正版图书籍东野圭吾作品:加贺探案集3 ",
            "谁杀了她+我杀了他 日本悬疑推理小说大师东野圭吾作品 排行榜书籍",
            "东野圭吾四大杰作【4册】白夜行",
            "祈祷落幕时 东野圭吾作品 感人至深的亲情力作 荣获2014年吉川英治文学奖 畅销",
            "大雪中的山庄 东野圭吾作品 新华书店正版畅销图书籍 ",
            "悖论13 东野圭吾 末世悬疑经典小说：13个幸存者困守废墟之城",
            "恶意 东野圭吾著"
    };
    // 声明一个手机商品的价格数组
    private static float[] mPriceArray = {27, 27, 28, 29, 30, 33,70,95};
    // 声明一个手机商品的小图数组
    private static int[] mThumbArray = {
            R.drawable.ddd, R.drawable.dddd, R.drawable.ddddd,
            R.drawable.dddddd, R.drawable.dddddddd, R.drawable.zzz,R.drawable.zzzz
            ,R.drawable.qqq
    };
    // 声明一个手机商品的大图数组
    private static int[] mPicArray = {
            R.drawable.ddd, R.drawable.dddd, R.drawable.ddddd,
            R.drawable.dddddd, R.drawable.dddddddd, R.drawable.zzz,R.drawable.zzzz
            ,R.drawable.qqq
    };

    // 获取默认的手机信息列表
    public static ArrayList<GoodsInfo1> getDefaultList() {
        ArrayList<GoodsInfo1> goodsList = new ArrayList<GoodsInfo1>();
        for (int i = 0; i < mNameArray.length; i++) {
            GoodsInfo1 info = new GoodsInfo1();
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
