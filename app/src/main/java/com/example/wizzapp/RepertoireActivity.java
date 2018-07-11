package com.example.wizzapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

public class RepertoireActivity extends AppCompatActivity {

    public static final String NAME = "com.example.wizzap.Name";
    private String[] ContactNames = {"Tommy", "Adrien", "Veronica", "Andrew", "Meliodas", "Elizabet", "Arlequin"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_repertoire);

        GridView gridview = (GridView) findViewById(R.id.gridview);
        gridview.setAdapter(new ContactAdapter(this, ContactNames));

        gridview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View v,
                                    int position, long id) {

                Intent intent = new Intent(RepertoireActivity.this, MainActivity.class);

                intent.putExtra(NAME, ContactNames[position]);
                startActivity(intent);
            }
        });
    }
}
