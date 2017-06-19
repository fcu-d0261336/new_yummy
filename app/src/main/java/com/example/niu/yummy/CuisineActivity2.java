package com.example.niu.yummy;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class CuisineActivity2 extends AppCompatActivity {

    ListView lv;

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
        ArrayList<PutPtr> ptrItem = new ArrayList<PutPtr>();
        ptrItem.add(new PutPtr(R.drawable.c1,"http://mp.weixin.qq.com/s/DoEhNTskP0h_FiMCX7MEXQ"));
        ptrItem.add(new PutPtr(R.drawable.c2,"http://mp.weixin.qq.com/s/D1Kp7T56MY5kjGTdDG3zcw"));
        ptrItem.add(new PutPtr(R.drawable.c3,"http://mp.weixin.qq.com/s/4zS0PYhZTZfaCc9bNxE1Lw"));
        ptrItem.add(new PutPtr(R.drawable.c4,"http://mp.weixin.qq.com/s/qvc8d25UWN-mvBaCKwYe5A"));
        PtrArrayAdapter adapter =new PtrArrayAdapter(this,ptrItem);
        lv=(ListView)findViewById(R.id.res_listview);
        lv.setAdapter(adapter);
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
