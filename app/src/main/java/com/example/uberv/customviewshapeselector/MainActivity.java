package com.example.uberv.customviewshapeselector;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button btnSelect;
    private ShapeSelectorView shapeSelector;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        shapeSelector= (ShapeSelectorView) findViewById(R.id.shape_selector);

        btnSelect = (Button) findViewById(R.id.btn_select);
        btnSelect.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "You selected: " +
                        shapeSelector.getSelectedShape(), Toast.LENGTH_LONG).show();
            }
        });

    }
}
