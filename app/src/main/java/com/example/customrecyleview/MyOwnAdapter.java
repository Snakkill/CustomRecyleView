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
    public static String[] data1;
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
          //  holder.t1.setText(data1(position));
          //  holder.t2.setText(data2(position));
          //  holder.myimage.setImageResource(img(position));

    }

   


    @Override
    public int getItemCount() {
        return data1.length;
    }

    public class MyOwnHolder extends RecyclerView.ViewHolder{  //initilzes layout iteams
        TextView t1,t2;
        ImageView myimage;
        public MyOwnHolder(@NonNull View itemView) {
            super(itemView);
            t1=(TextView) itemView.findViewById(R.id.text1);
            t1=(TextView) itemView.findViewById(R.id.text2);
            myimage = (ImageView) itemView.findViewById(R.id.myImage);
        }
    }
}
