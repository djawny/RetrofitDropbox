package com.sdaacademy.jawny.daniel.retrofitdropbox;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.sdaacademy.jawny.daniel.retrofitdropbox.api.DropboxService;
import com.sdaacademy.jawny.daniel.retrofitdropbox.model.DropboxCurrentAccountResponse;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.observers.DisposableObserver;
import io.reactivex.schedulers.Schedulers;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
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
        sendDropboxRequest();
    }

    private void sendDropboxRequest() {
        String authorization = "Bearer 1uEZkPo7nYAAAAAAAAABE7vG19rzn8aZBf491aBu3mGN8dqZz_80juHNNpAOTnrn";
//        Retrofit retrofit = new Retrofit.Builder()
//                .addConverterFactory(GsonConverterFactory.create())
//                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
//                .baseUrl("https://api.dropboxapi.com")
//                .build();
//        DropboxService service = retrofit.create(DropboxService.class);
        DropboxService.makeDropboxService().getCurrentAccount(authorization)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeWith(new DisposableObserver<DropboxCurrentAccountResponse>() {
                    @Override
                    public void onNext(DropboxCurrentAccountResponse response) {
                        mUserData.setText(response.getAccount_id());
                    }

                    @Override
                    public void onError(Throwable e) {

                    }

                    @Override
                    public void onComplete() {

                    }
                });
    }
}
