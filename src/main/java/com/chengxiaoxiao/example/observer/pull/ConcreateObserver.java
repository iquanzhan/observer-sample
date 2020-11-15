package com.chengxiaoxiao.example.observer.pull;

/**
 * ConcreateObserver
 *
 * @Description:
 * @Author: Cheng XiaoXiao  (🍊 ^_^ ^_^)
 * @Date: 2020-11-15 16:43
 */
public class ConcreateObserver implements Observer {
    public void change(Subject subject) {

        String state = ((ConcreateSubject) subject).getState();

        System.out.println("观察者状态为："+state);
    }
}
