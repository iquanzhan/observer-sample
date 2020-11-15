package com.chengxiaoxiao.example.observer.pull;


/**
 * Client
 *
 * @Description:
 * @Author: Cheng XiaoXiao  (🍊 ^_^ ^_^)
 * @Date: 2020-11-15 16:48
 */
public class Client {
    public static void main(String[] args) {

        ConcreateSubject subject = new ConcreateSubject();

        Observer observer = new ConcreateObserver();

        subject.attach(observer);

        subject.change("你好");

    }
}
