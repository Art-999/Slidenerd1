package com.example.arturmusayelyan.slidenerd1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    RelativeLayout main;
    EditText etUserNameValue, etPasswordValue;
    TextView tvMessage, tvUserName, tvPassword;
    Button btnLogin;

    LayoutParams messageDimensions, userNameDimensions, userNameValueDimensions, passwordDimensions, passwordValueDimensions, loginDimensions;

    int messageId = 1, userNameId = 2, userNameValueId = 3, passwordId = 4, passwordValueId = 5, loginId = 6;

    int paddingValue = 10;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
        init();
        createMessageTextView();
        createUserNameTextView();
        createUserNameEditText();
        createPasswordTextView();
        createPasswordEditText();
        createLoginButton();

        main.addView(tvMessage, messageDimensions);
        main.addView(tvUserName, userNameDimensions);
        main.addView(etUserNameValue, userNameValueDimensions);
        main.addView(tvPassword, passwordDimensions);
        main.addView(etPasswordValue, passwordValueDimensions);
        main.addView(btnLogin, loginDimensions);
        setContentView(main);
    }

    private void init() {
        main = new RelativeLayout(this);
        LayoutParams mainDimensions = new LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.MATCH_PARENT);
        main.setLayoutParams(mainDimensions);

        etUserNameValue = new EditText(this);//here comes edit text with user name
        etPasswordValue = new EditText(this);
        tvMessage = new TextView(this);//Please btnLogin first
        tvUserName = new TextView(this);// User Name
        tvPassword = new TextView(this);//tvPassword
        btnLogin = new Button(this);
    }

    private void createMessageTextView() {
        messageDimensions = new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT);
        messageDimensions.addRule(RelativeLayout.ALIGN_PARENT_LEFT);
        tvMessage.setText("Please Login First");
        tvMessage.setId(messageId);

        tvMessage.setPadding(paddingValue,100,paddingValue,paddingValue);
    }

    private void createUserNameTextView() {
        userNameDimensions = new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT);
        tvUserName.setText("User Name");
        tvUserName.setId(userNameId);
        userNameDimensions.addRule(RelativeLayout.ALIGN_PARENT_LEFT);
        userNameDimensions.addRule(RelativeLayout.BELOW, messageId);

        tvUserName.setPadding(paddingValue, paddingValue, paddingValue, paddingValue);
    }

    private void createUserNameEditText() {
        userNameValueDimensions = new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT);

        etUserNameValue.setId(userNameValueId);
        userNameValueDimensions.addRule(RelativeLayout.BELOW, messageId);
        userNameValueDimensions.addRule(RelativeLayout.RIGHT_OF, userNameId);
        userNameValueDimensions.addRule(RelativeLayout.ALIGN_PARENT_RIGHT);

        userNameValueDimensions.addRule(RelativeLayout.ALIGN_BASELINE, userNameId);
    }

    private void createPasswordTextView() {
        passwordDimensions = new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT);
        tvPassword.setText("Password");
        tvPassword.setId(passwordId);
        passwordDimensions.addRule(RelativeLayout.ALIGN_PARENT_LEFT);
        passwordDimensions.addRule(RelativeLayout.BELOW, userNameValueId);

        passwordDimensions.addRule(RelativeLayout.ALIGN_RIGHT, userNameId);
        tvPassword.setGravity(Gravity.RIGHT);
        tvPassword.setPadding(paddingValue, paddingValue, paddingValue, paddingValue);
    }

    private void createPasswordEditText() {
        passwordValueDimensions = new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT);
        etPasswordValue.setId(passwordValueId);
        passwordValueDimensions.addRule(RelativeLayout.RIGHT_OF, passwordId);
        passwordValueDimensions.addRule(RelativeLayout.ALIGN_PARENT_RIGHT);
        passwordValueDimensions.addRule(RelativeLayout.BELOW, userNameValueId);

        // userNameValueDimensions.addRule(RelativeLayout.ALIGN_BASELINE, passwordId);//? //sxal 62-i verj
    }

    private void createLoginButton() {
        loginDimensions = new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT);
        btnLogin.setId(loginId);
        btnLogin.setText("Login");
        loginDimensions.addRule(RelativeLayout.ALIGN_PARENT_RIGHT);
        loginDimensions.addRule(RelativeLayout.BELOW, passwordValueId);
    }
}
