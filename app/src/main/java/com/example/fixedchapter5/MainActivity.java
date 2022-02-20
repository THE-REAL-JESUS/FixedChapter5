package com.example.fixedchapter5;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ListActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String[] attractions= {"Art institute of Chicago","Magnificent mile","Willis Tower","Navy pier","Water tower"};
        setListAdapter(new ArrayAdapter<String>(this,R.layout.activity_main,R.id.travel,attractions));


    }

    protected void onListItemClick(ListView l, View v, int position,long id) {
        switch(position){
            case 0:startActivity(new Intent(Intent.ACTION_VIEW,Uri.parse("http://artic.edu")));break;
            case 1: startActivity(new Intent(MainActivity.this,MainActivity2.class));
        }
    }



}