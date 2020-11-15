package com.chengxiaoxiao.example.observer.pull;

/**
 * Observer
 *
 * @Description:
 * @Author: Cheng XiaoXiao  (🍊 ^_^ ^_^)
 * @Date: 2020-11-15 16:38
 */
public interface Observer {
    /**
     * 变化的监听
     * @param subject
     */
    public void change(Subject subject);
}
