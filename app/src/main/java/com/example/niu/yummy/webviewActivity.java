package com.example.niu.yummy;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.KeyEvent;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by NIU on 6/18/17.
 */
//webviewAcitivity 测试可行
public class webviewActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.webviewlayout);
        Button main_button=(Button)findViewById(R.id.main_btn);
        main_button.setOnClickListener(back_main);
        Button res_button=(Button)findViewById(R.id.res_btn);
        res_button.setOnClickListener(res);
        Button cuisine_button=(Button)findViewById(R.id.cuisine_btn);
        cuisine_button.setOnClickListener(cuisine);


        Intent intent=getIntent();
        String urltest=intent.getStringExtra("testIntent");




/////////////////////////////////////////////////////////////////////////////////////////////
        //WebView
        WebView browser=(WebView)findViewById(R.id.Toweb);
        browser.getSettings().setJavaScriptEnabled(true);
        browser.getSettings().setBlockNetworkImage(false);
        browser.loadUrl(urltest);

        //设置可自由缩放网页
        browser.getSettings().setSupportZoom(true);
        browser.getSettings().setBuiltInZoomControls(true);

        // 如果页面中链接，如果希望点击链接继续在当前browser中响应，
        // 而不是新开Android的系统browser中响应该链接，必须覆盖webview的WebViewClient对象
        browser.setWebViewClient(new WebViewClient() {
            public boolean shouldOverrideUrlLoading(WebView view, String url)
            {
                //  重写此方法表明点击网页里面的链接还是在当前的webview里跳转，不跳到浏览器那边
                view.loadUrl(url);
                return true;
            }
        });
/////////////////////////////////////////////////////////////////////////////////////////////

    }

    public URL str2url(String str){
        String S = str;
        try {
            URL url = new URL(str);
            return url;
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        return null;
    }


    private View.OnClickListener back_main=new View.OnClickListener() {
        @Override
        public void onClick(View view) {Intent intent=new Intent();
            intent.setClass( webviewActivity.this,
                    MainActivity.class);
            startActivity(intent);
        }
    };
    private View.OnClickListener cuisine=new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent=new Intent();
            intent.setClass(webviewActivity.this,
                    CuisineActivity2.class);
            startActivity(intent);
        }
    };
    private View.OnClickListener res=new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent=new Intent();
            intent.setClass(webviewActivity.this,
                    ResActivity2.class);
            startActivity(intent);
        }
    };
    //////////////////////////////////////////////////////////////////////////////////////////////
    //go back
    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        WebView browser=(WebView)findViewById(R.id.Toweb);
        // Check if the key event was the Back button and if there's history
        if ((keyCode == KeyEvent.KEYCODE_BACK) && browser.canGoBack()) {
            browser.goBack();
            return true;
        }
        //  return true;
        // If it wasn't the Back key or there's no web page history, bubble up to the default
        // system behavior (probably exit the activity)
        return super.onKeyDown(keyCode, event);
    }
}
