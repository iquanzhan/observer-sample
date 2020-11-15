package com.chengxiaoxiao.example.observer;

/**
 * 具体观察者
 *
 * @Description:
 * @Author: Cheng XiaoXiao  (🍊 ^_^ ^_^)
 * @Date: 2020-11-15 16:26
 */
public class ConcreteObserver implements Observer {
    //观察者的状态
    private String observerState;

    public void change(String state) {
        this.observerState = state;
        System.out.println("state = " + state);
    }
}
