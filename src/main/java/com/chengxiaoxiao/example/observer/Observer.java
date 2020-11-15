package com.chengxiaoxiao.example.observer;

/**
 * 抽象观察者
 *
 * @Description:
 * @Author: Cheng XiaoXiao  (🍊 ^_^ ^_^)
 * @Date: 2020-11-15 15:15
 */
public interface Observer {

    /**
     * 更新接口
     * @param state 更新的状态
     */
    void change(String state);
}
