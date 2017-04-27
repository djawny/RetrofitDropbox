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
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.observers.DisposableObserver;
import io.reactivex.schedulers.Schedulers;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.user_data)
    TextView mUserData;

    private CompositeDisposable compositeDisposable;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @Override
    protected void onResume() {
        super.onResume();
        if (compositeDisposable == null) {
            compositeDisposable = new CompositeDisposable();
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (compositeDisposable != null) {
            compositeDisposable.clear();
        }
    }

    @OnClick(R.id.get_user_data)
    public void getUserData() {
        sendDropboxRequest();
    }

    private void sendDropboxRequest() {
        String authorization = "Bearer 1uEZkPo7nYAAAAAAAAABE7vG19rzn8aZBf491aBu3mGN8dqZz_80juHNNpAOTnrn";

        compositeDisposable.add(DropboxService
                .Factory
                .makeDropboxService()
                .getCurrentAccount(authorization)
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
                }));
    }
}
