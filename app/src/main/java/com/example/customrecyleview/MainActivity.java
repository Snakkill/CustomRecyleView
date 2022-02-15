package com.example.customrecyleview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    RecyclerView r1;
    String s1[],s2[];
    int imageResource[] = {R.drawable.aladdin,R.drawable.captin_hook,R.drawable.peter_pan,R.drawable.jafar};



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        r1 = (RecyclerView) findViewById(R.id.myRecycler);

        //Get string data
        s1 = getResources().getStringArray(R.array.Disney_name);
        s1 = getResources().getStringArray(R.array.Disney_H_or_V);

        MyOwnAdapter ad = new MyOwnAdapter(this,s1,s2,imageResource);
        r1.setAdapter(ad);

        r1.setLayoutManager(new LinearLayoutManager(this));
    }
}