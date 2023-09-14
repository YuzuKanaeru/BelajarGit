package com.alfandy.belajargit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class NegaraActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {
    private ListView lvnegara;
    ArrayAdapter<CharSequence> adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_negara);
        lvnegara = findViewById(R.id.listnegara);

        adapter = ArrayAdapter.createFromResource(this,R.array.daftarnegara, android.R.layout.simple_list_item_1);
        lvnegara.setAdapter(adapter);
        lvnegara.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        Toast.makeText(this, adapter.getItem(i), Toast.LENGTH_SHORT).show();


    }
}