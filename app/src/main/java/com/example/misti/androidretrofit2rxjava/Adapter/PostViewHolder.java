package com.example.misti.androidretrofit2rxjava.Adapter;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.example.misti.androidretrofit2rxjava.R;

import org.w3c.dom.Text;

public class PostViewHolder extends RecyclerView.ViewHolder {

    TextView txt_title , txt_content , txt_author ;
    public PostViewHolder(View itemView){
        super(itemView);

        txt_title = (TextView) itemView.findViewById(R.id.txt_title);
        txt_content= (TextView) itemView.findViewById(R.id.txt_content);
        txt_author= (TextView) itemView.findViewById(R.id.txt_author);
    }
}
