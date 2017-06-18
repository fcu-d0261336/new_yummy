package com.example.niu.yummy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.view.View.OnClickListener;

public class CuisineActivity2 extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Button main_button=(Button)findViewById(R.id.main_btn);
        main_button.setOnClickListener(back_main);
        Button res_button=(Button)findViewById(R.id.res_btn);
        res_button.setOnClickListener(res);
        Button test_button=(Button)findViewById(R.id.btn_user);
        test_button.setOnClickListener(test);

    }



    private OnClickListener test=new OnClickListener() {
        @Override
        public void onClick(View view) {

            Intent intent=new Intent();
            intent.putExtra("testIntent", "http://mp.weixin.qq.com/s/qXuXhBu6nuvWleKnrWbUFA");
            intent.setClass( CuisineActivity2.this,
                    webviewActivity.class);
            startActivity(intent);
        }
    };






    private OnClickListener back_main=new OnClickListener() {
        @Override
        public void onClick(View view) {Intent intent=new Intent();
            intent.setClass( CuisineActivity2.this,
                    MainActivity.class);
            startActivity(intent);
        }
    };
    private OnClickListener res=new OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent=new Intent();
            intent.setClass(CuisineActivity2.this,
                    ResActivity2.class);
            startActivity(intent);
        }
    };

}
