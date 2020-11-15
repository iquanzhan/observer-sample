package com.chengxiaoxiao.example.observer.pull;

import java.util.ArrayList;
import java.util.List;

/**
 * 抽象主题类
 *
 * @Description:
 * @Author: Cheng XiaoXiao  (🍊 ^_^ ^_^)
 * @Date: 2020-11-15 16:39
 */
public abstract class Subject {

    List<Observer> list = new ArrayList<Observer>();

    /**
     * 添加观察者
     * @param observer 观察者
     */
    public void attach(Observer observer){
        list.add(observer);
    }

    /**
     * 删除观察者
     * @param observer
     */
    public void detach(Observer observer){
        list.remove(observer);
    }

    /**
     * 通知变化
     */
    public void notifyObservers() {
        for (Observer observer : list) {
            observer.change(this);
        }
    }


}
