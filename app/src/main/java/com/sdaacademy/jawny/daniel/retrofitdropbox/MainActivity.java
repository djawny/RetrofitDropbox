package com.sdaacademy.jawny.daniel.retrofitdropbox;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.user_data)
    TextView mUserData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

    }

    @OnClick(R.id.get_user_data)
    public void getUserData() {
        String response = sendDropboxRequest();
        mUserData.setText(response);
    }

    private String sendDropboxRequest() {
        String response = "";


        return response;
    }
}
