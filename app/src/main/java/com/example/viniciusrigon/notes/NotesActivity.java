package com.example.viniciusrigon.notes;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class NotesActivity extends AppCompatActivity {
    private ListView mListView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notes);

        Intent intent = getIntent();
        String[] messages = intent.getStringArrayExtra(MainActivity.EXTRA_MESSAGE);

        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.activity_list_item, messages);

        mListView = (ListView)findViewById(R.id.mobile_list);
        mListView.setAdapter(adapter);


    }
}
/*

super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);
        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
        TextView textView = new TextView(this);
        textView.setTextSize(40);
        textView.setText(message);
        ViewGroup layout = (ViewGroup) findViewById(R.id.activity_display_message);
        layout.addView(textView);



        */