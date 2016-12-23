package com.example.user1.myapplication;

import retrofit2.http.GET;

/**
 * Created by user1 on 2016/11/23.
 */

public class Model {
    private int count=0;

    public int getCount() {
        return count;
    }
    public void setCount(int count) {
        this.count = count;
    }
}
