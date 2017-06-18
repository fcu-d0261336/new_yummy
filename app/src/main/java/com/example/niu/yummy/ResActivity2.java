package com.example.niu.yummy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ListView;

import java.util.ArrayList;

public class ResActivity2 extends AppCompatActivity {
    ListView lv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        Button main_button=(Button)findViewById(R.id.main_btn);
        main_button.setOnClickListener(back_main);
        Button cuisine_button=(Button)findViewById(R.id.cuisine_btn);
        cuisine_button.setOnClickListener(cuisine);
        Button res_button=(Button)findViewById(R.id.res_btn);
        res_button.setOnClickListener(res);


        ////ImageButton///////
        ImageButton test_button=(ImageButton)findViewById(R.id.r1);
        test_button.setOnClickListener(test);
        ////////////////////

    }

//ImageButton Intent 打开网页测试（成功可行）//
    private View.OnClickListener test=new View.OnClickListener() {
        @Override
        public void onClick(View view) {


            Intent intent=new Intent();
            intent.putExtra("testIntent", "http://mp.weixin.qq.com/s/-xO57_qJJsnZA_7ZHijBBA");
            intent.setClass( ResActivity2.this,
                    webviewActivity.class);
            startActivity(intent);
        }

    };
//////////////////////////////////////////////



    private View.OnClickListener back_main=new View.OnClickListener() {
        @Override
        public void onClick(View view) {Intent intent=new Intent();
            intent.setClass( ResActivity2.this,
                    MainActivity.class);
            startActivity(intent);
        }
    };
    private View.OnClickListener cuisine=new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent=new Intent();
            intent.setClass(ResActivity2.this,
                    CuisineActivity2.class);
            startActivity(intent);
        }
    };
    private View.OnClickListener res=new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent=new Intent();
            intent.setClass(ResActivity2.this,
                    ResActivity2.class);
            startActivity(intent);
        }
    };
}
