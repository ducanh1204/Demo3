package vn.edu.poly.demo3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
public class SpinnerAdapterActivity extends AppCompatActivity {


    private Spinner spinner;
    String[] items= {"Java", "Javascript","PHP","Android"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinner_adapter);

        spinner = findViewById(R.id.spn);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this,android.R.layout.simple_spinner_item,items);
        spinner.setAdapter(arrayAdapter);
    }
}
