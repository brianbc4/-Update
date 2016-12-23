package com.example.user1.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity
        extends AppCompatActivity
        implements MainContract.View {

    private TextView textView;
    private Button button;
    private MainContract.Presenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        presenter = new MainPresenter(this);
        initView();
        initHandler();
    }

    public void initView() {
        setContentView(R.layout.activity_main);
        textView = (TextView) findViewById(R.id.text_view);
        button = (Button) findViewById(R.id.button);
    }

    private void initHandler() {
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                presenter.addCount();
            }
        });
    }

    @Override
    public void showCount(int i) {
        textView.setText(String.valueOf(i));
    }
}
