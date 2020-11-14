package com.example.morescreen;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ListActivity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Toast;

public class MainActivity extends ListActivity {

    String[] things = {"Рубик", "Иллюзия", "Картина", "Часы"}
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ArrayAdapter<String> adapter;
        Context context;
        adapter = new ArrayAdapter<String>(context:this, android.R.layout.simple_list_item_1, things);
        setListAdapter(adapter);

        AdapterView.OnItemClickListener itemClickListener = new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Switch(position){

                    case 0:
                        Intent packageContext;
                        Intent intent1 = new Intent( packageContext: MainActivity.this, Rubik.class);
                        startActivity(intent1)

                        break;

                    case 1:
                        Intent intent2 = new Intent( packageContext: MainActivity.this, Clock.class);
                        startActivity(intent2)
                        break;

                    case 2:
                        Intent intent3 = new Intent( packageContext: MainActivity.this, Image.class);
                        startActivity(intent3)
                        break;

                    case 3:
                        Intent intent4 = new Intent( packageContext: MainActivity.this, illusion.class);
                        startActivity(intent4)
                        break;

                }
                Toast.makeText(getApplicationContext(),"Вы выбрали"
                        + parent.getItemAtPosition(position).toString(), Toast.LENGTH_SHORT).show();
            }
        };
        AdapterView.OnItemClickListener itemListener;
        getListView().setOnItemClickListener(itemListener);
    }

    private void Switch(int position) {
    }
}