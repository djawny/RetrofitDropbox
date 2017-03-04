package com.sdaacademy.jawny.daniel.retrofitdropbox;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

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
        Retrofit retrofit = new Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl("https://api.dropboxapi.com")
                .build();
        DropboxService service = retrofit.create(DropboxService.class);


        return response;
    }
}
