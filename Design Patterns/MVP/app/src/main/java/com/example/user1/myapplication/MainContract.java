package com.example.user1.myapplication;

/**
 * Created by user1 on 2016/11/23.
 */

public interface MainContract {
    interface View {
        void showCount(int i);
    }

    interface Presenter {

        void addCount();
    }
}
