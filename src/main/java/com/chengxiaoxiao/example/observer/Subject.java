package com.chengxiaoxiao.example.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 抽象主题
 *
 * @Description:
 * @Author: Cheng XiaoXiao  (🍊 ^_^ ^_^)
 * @Date: 2020-11-15 15:15
 */
public abstract class Subject {
    private List<Observer> list = new ArrayList<Observer>();

    /**
     * 注册观察者
     *
     * @param observer 观察者对象
     */
    public void attach(Observer observer) {
        list.add(observer);
    }

    /**
     * 删除观察者
     *
     * @param observer 观察者对象
     */
    public void detach(Observer observer) {
        list.remove(observer);
    }

    /**
     * 通知所有观察者状态更新
     *
     * @param newState 状态
     */
    public void notifyObserver(String newState) {
        for (Observer observer : list) {
            observer.change(newState);
        }
    }


}
