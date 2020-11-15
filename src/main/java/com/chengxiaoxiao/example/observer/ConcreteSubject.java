package com.chengxiaoxiao.example.observer;

/**
 * 具体主题实现类
 *
 * @Description:
 * @Author: Cheng XiaoXiao  (🍊 ^_^ ^_^)
 * @Date: 2020-11-15 15:25
 */
public class ConcreteSubject extends Subject {
    private String state;

    public String getState() {
        return state;
    }


    /**
     * 状态发生改变，通知所有观察者
     * @param newState 状态信息
     */
    public void change(String newState) {
        this.state = newState;
        this.notifyObserver(newState);
    }

}
