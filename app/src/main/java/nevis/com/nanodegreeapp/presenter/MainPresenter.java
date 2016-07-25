package nevis.com.nanodegreeapp.presenter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.StringRes;

import nevis.com.nanodegreeapp.R;
import nevis.com.nanodegreeapp.view.MainView;

/**
 * @author Nikita Simonov
 */
public class MainPresenter {

    private final Context mContext;
    private final MainView mView;

    public MainPresenter(@NonNull Context context, @NonNull MainView view) {
        mContext = context;
        mView = view;
    }

    public void openProjectOne() {
        showText(R.string.project_name_1);
    }

    public void openProjectTwo() {
        showText(R.string.project_name_2);
    }

    public void openProjectThree() {
        showText(R.string.project_name_3);
    }

    public void openProjectFour() {
        showText(R.string.project_name_4);
    }

    public void openProjectFive() {
        showText(R.string.project_name_5);
    }

    public void openProjectSix() {
        showText(R.string.project_name_6);
    }

    private void showText(@StringRes int stringId) {
        final String name = mContext.getString(stringId);
        mView.showText(mContext.getString(R.string.launch_text, name));
    }
}
