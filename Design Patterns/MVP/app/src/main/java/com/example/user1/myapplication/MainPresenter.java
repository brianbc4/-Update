package com.example.user1.myapplication;

/**
 * Created by user1 on 2016/11/23.
 */

public class MainPresenter implements MainContract.Presenter {

    private MainContract.View view;
    private Model model;

    public MainPresenter(MainContract.View view) {
        this.view = view;
        model = new Model();
    }

    @Override
    public void addCount() {
        model.setCount(model.getCount() + 1);   //Change model's attribute
        view.showCount(model.getCount());       //Get the view to change
    }
}
