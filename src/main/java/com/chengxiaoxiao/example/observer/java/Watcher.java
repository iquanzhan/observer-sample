package com.chengxiaoxiao.example.observer.java;

import java.util.Observable;
import java.util.Observer;

/**
 * Watcher
 *
 * @Description:
 * @Author: Cheng XiaoXiao  (🍊 ^_^ ^_^)
 * @Date: 2020-11-15 16:58
 */
public class Watcher implements Observer {

    public Watcher(Observable observable) {
        observable.addObserver(this);
    }



    public void update(Observable o, Object arg) {

        System.out.println("状态发生改变：" + ((Watched)o).getData());
    }
}
