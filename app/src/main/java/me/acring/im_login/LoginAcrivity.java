package me.acring.im_login;

import android.support.design.widget.TextInputEditText;
import android.support.design.widget.TextInputLayout;
import android.support.v4.view.ScrollingView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;

public class LoginAcrivity extends AppCompatActivity {
    private ImageView topPicture ;
    private EditText userName;
    private EditText passWord;
    private ImageView showPassword;
    private Button loginButton;
    private Button loginByMessage;
    private ImageView loginByQQ;
    private ImageView loginByWechat;
    private ImageView loginByWeibo;
    private TextView forgetPassword;
    private LinearLayout activityMain ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        topPicture = (ImageView) findViewById(R.id.top_picture);
        userName = (EditText) findViewById(R.id.username);
        passWord = (EditText) findViewById(R.id.password);
        loginButton = (Button) findViewById(R.id.login_button);
        loginByMessage = (Button) findViewById(R.id.login_message);
        loginByQQ = (ImageView) findViewById(R.id.qq_login);
        loginByWechat = (ImageView) findViewById(R.id.wechat_login);
        loginByWeibo = (ImageView) findViewById(R.id.weibo_login);
        activityMain = (LinearLayout) findViewById(R.id.activity_main);

        //显示动画
        final TranslateAnimation mShowAction = new TranslateAnimation(Animation.RELATIVE_TO_SELF, 0.0f,
                Animation.RELATIVE_TO_SELF, 0.0f, Animation.RELATIVE_TO_SELF,
                -1.0f, Animation.RELATIVE_TO_SELF, 0.0f);
        mShowAction.setDuration(500);

        //隐藏动画
        final TranslateAnimation mHiddenAction = new TranslateAnimation(Animation.RELATIVE_TO_SELF,
                0.0f, Animation.RELATIVE_TO_SELF, 0.0f,
                Animation.RELATIVE_TO_SELF, 0.0f, Animation.RELATIVE_TO_SELF,
                -1.0f);
        mHiddenAction.setDuration(1000);
        passWord.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if (hasFocus){
//                    topPicture.startAnimation(mHiddenAction);
                    topPicture.setVisibility(View.GONE);
                }
                else{
                    topPicture.startAnimation(mShowAction);
                    topPicture.setVisibility(View.VISIBLE);
                }
            }
        });


    }


}
