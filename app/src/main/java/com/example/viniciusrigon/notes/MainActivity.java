package com.example.viniciusrigon.notes;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import static android.provider.AlarmClock.EXTRA_MESSAGE;

public class MainActivity extends AppCompatActivity {
    public final static String EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void saveNote(View view) {
        Intent intent = new Intent(this, NotesActivity.class);
        EditText editTitle = (EditText) findViewById(R.id.title_note);
        EditText editNote = (EditText) findViewById(R.id.text_note);

        String title = editTitle.getText().toString();
        String note = editNote.getText().toString();

        String[] messagens = {title, note };

        intent.putExtra(EXTRA_MESSAGE, messagens);

        startActivity(intent);
    }
}
