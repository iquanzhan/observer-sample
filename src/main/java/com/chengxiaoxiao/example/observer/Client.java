package com.chengxiaoxiao.example.observer;

/**
 * Client
 *
 * @Description:
 * @Author: Cheng XiaoXiao  (🍊 ^_^ ^_^)
 * @Date: 2020-11-15 16:28
 */
public class Client {
    public static void main(String[] args) {
        ConcreteSubject concreteSubject = new ConcreteSubject();

        //创建观察者
        Observer observer = new ConcreteObserver();
        Observer observer1 = new ConcreteObserver();

        concreteSubject.attach(observer);
        concreteSubject.attach(observer1);

        concreteSubject.change("新状态");

    }
}
