package com.hiebuzz.loginformdesign;

import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewStub;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    Button tabLoginBtn,tabRegisterBtn,loginBtn;
    ImageView loginArrow,registerArrow;
    TextView tvRegister,tvAlready;
    View loginInclude,registerInclude;
    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tabLoginBtn=findViewById(R.id.tab_btn_login);
        tabRegisterBtn=findViewById(R.id.tab_btn_register);
        loginBtn=findViewById(R.id.login_btn);
        loginArrow=findViewById(R.id.iv_login_arrow);
        registerArrow=findViewById(R.id.iv_register_arrow);
        tvAlready=findViewById(R.id.tv_already);
        tvRegister=findViewById(R.id.tv_register);
        loginInclude=findViewById(R.id.login_include);
        registerInclude=findViewById(R.id.register_include);
        setLoginView();
        tabLoginBtn.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
            @Override
            public void onClick(View view)
            {
                setLoginView();
            }
        });
        tabRegisterBtn.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
            @Override
            public void onClick(View view)
            {
                setRegisterView();
            }
        });
        tvRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                if(tvRegister.getText().toString().equalsIgnoreCase("register now"))
                {
                    setRegisterView();
                }
                else
                {
                    setLoginView();
                }
            }
        });
        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                if(loginBtn.getText().toString().equalsIgnoreCase("login"))
                {
                    Toast.makeText(MainActivity.this,"Login Clicked",Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Toast.makeText(MainActivity.this,"Register Clicked",Toast.LENGTH_SHORT).show();

                }
            }
        });

    }

    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
    private void setRegisterView()
    {

        tabLoginBtn.setBackgroundColor(getResources().getColor(android.R.color.transparent));
        tabRegisterBtn.setBackground(getResources().getDrawable(R.drawable.tab_btn_bg));
        loginArrow.setVisibility(View.INVISIBLE);
        registerArrow.setVisibility(View.VISIBLE);
        loginInclude.setVisibility(View.INVISIBLE);
        registerInclude.setVisibility(View.VISIBLE);
        loginBtn.setText("Register");
        tvAlready.setText("Already have an account?");
        tvRegister.setText("Login now");
    }
    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
    private void setLoginView()
    {
        tabRegisterBtn.setBackgroundColor(getResources().getColor(android.R.color.transparent));
        tabLoginBtn.setBackground(getResources().getDrawable(R.drawable.tab_btn_bg));
        registerArrow.setVisibility(View.INVISIBLE);
        loginArrow.setVisibility(View.VISIBLE);
        registerInclude.setVisibility(View.INVISIBLE);
        loginInclude.setVisibility(View.VISIBLE);
        loginBtn.setText("Login");
        tvAlready.setText("Want to create new account?");
        tvRegister.setText("Register now");
    }
}
