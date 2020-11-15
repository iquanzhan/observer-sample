package com.chengxiaoxiao.example.observer.java;

import java.util.Observable;

/**
 * Watched
 *
 * @Description:
 * @Author: Cheng XiaoXiao  (🍊 ^_^ ^_^)
 * @Date: 2020-11-15 16:56
 */
public class Watched extends Observable {
    private String data="";

    public String getData() {
        return data;
    }

    public void setData(String data) {
        if(!this.data.equals(data)){
            this.data = data;
            this.setChanged();
        }
        notifyObservers();
    }
}
