package com.weijiadev.tmall;

public class Singleton {

    // 直接创建对象
    public static Singleton instance = new Singleton();
    // 私有化构造函数
    private Singleton() {
    }

    // 返回对象实例
    public static Singleton getInstance() {
        return instance;
    }

}
