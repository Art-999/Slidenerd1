package com.example.arturmusayelyan.slidenerd1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    RelativeLayout main;
    EditText userNameValue, passwordValue;
    TextView message, userName, password;
    Button login;

    LayoutParams messageDimensions, userNameDimensions, userNameValueDimensions;

    int messageId = 1, userNameId = 2, userNameValueId = 3, passwordId = 4, passwordValueId = 5, loginId = 6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
        init();
        createMessageTextView();
        main.addView(message, messageDimensions);
        createUserNameTextView();
        main.addView(userName, userNameDimensions);
        createUserNameEditText();
        main.addView(userNameValue,userNameDimensions);
        setContentView(main);
    }

    private void init() {
        main = new RelativeLayout(this);
        LayoutParams mainDimensions = new LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.MATCH_PARENT);
        main.setLayoutParams(mainDimensions);

        userNameValue = new EditText(this);//here comes edit text with user name
        passwordValue = new EditText(this);
        message = new TextView(this);//Please login first
        userName = new TextView(this);// User Name
        password = new TextView(this);
        login = new Button(this);
    }

    private void createMessageTextView() {
        messageDimensions = new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT);
        messageDimensions.addRule(RelativeLayout.ALIGN_PARENT_LEFT);
        message.setText("Please Login First");
        message.setId(messageId);
        message.setLayoutParams(messageDimensions);
    }

    private void createUserNameTextView() {
        userNameDimensions = new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT);
        userName.setText("User Name");
        userName.setId(userNameId);
        userNameDimensions.addRule(RelativeLayout.ALIGN_PARENT_LEFT);
        userNameDimensions.addRule(RelativeLayout.BELOW, messageId);
    }

    private void createUserNameEditText() {
        userNameValueDimensions = new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT);
        userNameValue.setId(userNameValueId);
        userNameValueDimensions.addRule(RelativeLayout.BELOW,messageId);
        userNameValueDimensions.addRule(RelativeLayout.RIGHT_OF,userNameId);
        userNameValueDimensions.addRule(RelativeLayout.ALIGN_PARENT_RIGHT);
    }
}
