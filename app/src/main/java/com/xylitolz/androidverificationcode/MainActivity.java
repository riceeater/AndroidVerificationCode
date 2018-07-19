package com.xylitolz.androidverificationcode;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.xylitolz.androidverificationcode.view.VerificationCodeView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private VerificationCodeView viewVerification;
    private Button btnSubmit;
    private Button btnClear;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewVerification = findViewById(R.id.view_verification);
        btnSubmit = findViewById(R.id.btn_submit);
        btnClear = findViewById(R.id.btn_clear);

        btnSubmit.setOnClickListener(this);
        btnClear.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_submit:
                if(viewVerification.isFinish()) {
                    Toast.makeText(this,"输入验证码是:"+viewVerification.getContent(),Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(this,"请输入完整验证码",Toast.LENGTH_SHORT).show();
                } 
                break;
            case R.id.btn_clear:
                viewVerification.clear();
                break;
        }
    }
}
