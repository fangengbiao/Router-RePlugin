package com.lzh.usercenetr;

import android.app.Activity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import com.lzh.nonview.router.anno.RouterRule;
import com.nio.compiler.parceler.Parceler;
import com.nio.compiler.parceler.annotation.Arg;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

@RouterRule("login")
public class LoginActivity extends Activity {

    @Arg
    String username;
    @Arg
    String password;

    @BindView(R.id.username)
    EditText name;
//    @BindView(R.id.password)
    EditText word;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Parceler.toEntity(this, getIntent());
        ButterKnife.bind(this);
//        name.setText(username);
//        word.setText(password);

        TextView textView = (TextView) this.findViewById(R.id.username);
        textView.setText(username);
    }

    @OnClick(R.id.login)
    void login() {
        finish();
    }
}
