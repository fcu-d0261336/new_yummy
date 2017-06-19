package com.example.niu.yummy;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.List;

/**
 * Created by 路人 on 2017/6/19.
 */

public class PtrArrayAdapter extends ArrayAdapter<PutPtr> {
    Context context;
    public PtrArrayAdapter(Context context, List<PutPtr> items){
        super(context,0,items);
        this.context=context;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        LayoutInflater inflater=LayoutInflater.from(context);
        LinearLayout itemlayout=null;
        if(convertView==null){
            itemlayout=(LinearLayout)inflater.inflate(R.layout.listitem,null);
        }else{
            itemlayout=(LinearLayout)convertView;
        }
        PutPtr item=(PutPtr) getItem(position);
        ImageButton imageButton=(ImageButton)itemlayout.findViewById(R.id.im_bt);
        imageButton.setImageResource(item.getPtrID());
        final TextView textView=(TextView)itemlayout.findViewById(R.id.ptr_url);
        textView.setText(item.getPtrUrl());
        textView.setVisibility(View.GONE);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent();
                intent.putExtra("testIntent", textView.getText().toString());
                intent.setClass( context,
                        webviewActivity.class);
                context.startActivity(intent);
            }
        });
        return itemlayout;
    }
}