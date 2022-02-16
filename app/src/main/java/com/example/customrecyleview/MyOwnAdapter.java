package com.example.customrecyleview;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyOwnAdapter extends RecyclerView.Adapter<MyOwnAdapter.MyOwnHolder> {
    String[] data1;
    String[] data2;
    int img[];
    Context ctx;

    public MyOwnAdapter(Context ct, String s1[], String s2[], int i1[]){
        ctx=ct;
        data1 = s1;
        data2 = s2;
        img=i1;
    }

    @NonNull
    @Override
    public MyOwnHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater myInflator = LayoutInflater.from(ctx);
       View myOwnView= myInflator.inflate(R.layout.my_row,parent,false);  //view group is parent and we dont wanna attach it so false
        return new MyOwnHolder(myOwnView);
    }

    @Override
    public void onBindViewHolder(@NonNull MyOwnHolder holder, int position) {
         holder.title.setText(data1[position]);
          holder.subtitle.setText(data2[position]);
          holder.myimage.setImageResource(img[position]);

    }




    @Override
    public int getItemCount() {
        return data1.length;
    }

    public class MyOwnHolder extends RecyclerView.ViewHolder{  //initilzes layout iteams
        TextView title,subtitle;
        ImageView myimage;
        public MyOwnHolder(@NonNull View itemView) {
            super(itemView);
            title=(TextView) itemView.findViewById(R.id.titleTv);
            subtitle=(TextView) itemView.findViewById(R.id.subtitleTv);
            myimage = (ImageView) itemView.findViewById(R.id.myImage);
        }
    }
}
