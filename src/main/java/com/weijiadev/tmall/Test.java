package com.weijiadev.tmall;

public class Test {

    public static void main(String args[]) {
        System.out.println("Hello World! test");
        Singleton.getInstance();

    }

//    // 直接创建对象
//    public static Test instance = new Test();
//    // 私有化构造函数
//    private Test() {
//    }
//    // 返回对象实例
//    public static Test getInstance() {
//        return instance;
//    }

}