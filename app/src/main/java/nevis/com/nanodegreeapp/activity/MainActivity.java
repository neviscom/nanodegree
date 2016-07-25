package nevis.com.nanodegreeapp.activity;

import android.support.annotation.NonNull;
import android.support.annotation.StringRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import nevis.com.nanodegreeapp.R;
import nevis.com.nanodegreeapp.presenter.MainPresenter;
import nevis.com.nanodegreeapp.view.MainView;

public class MainActivity extends AppCompatActivity implements MainView {

    private MainPresenter mPresenter;


    public void onProjectOneClicked(View view) {
        mPresenter.openProjectOne();
    }

    public void onProjectTwoClicked(View view) {
        mPresenter.openProjectTwo();
    }

    public void onProjectThreeClicked(View view) {
        mPresenter.openProjectThree();
    }

    public void onProjectForeClicked(View view) {
        mPresenter.openProjectFour();
    }

    public void onProjectFiveClicked(View view) {
        mPresenter.openProjectFive();
    }

    public void onProjectSixClicked(View view) {
        mPresenter.openProjectSix();
    }


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ac_main);

        mPresenter = new MainPresenter(this, this);
    }


    @Override
    public void showText(@NonNull String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }
}
