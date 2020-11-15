package com.chengxiaoxiao.example.observer.pull;

/**
 * ConcreateSubject
 *
 * @Description:
 * @Author: Cheng XiaoXiao  (🍊 ^_^ ^_^)
 * @Date: 2020-11-15 16:44
 */
public class ConcreateSubject extends Subject {
    private String state;

    public String getState() {
        return state;
    }

    /**
     * 状态改变
     */
    public void change(String state) {
        this.state = state;
        this.notifyObservers();
    }
}
