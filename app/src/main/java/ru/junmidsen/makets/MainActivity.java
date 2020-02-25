package ru.junmidsen.makets;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button showSberbankMainActivityButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        showSberbankMainActivityButton = (Button) findViewById(R.id.button_sberbank_main);
        showSberbankMainActivityButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showSberbankMainActivity();
            }
        });
    }

    private void showSberbankMainActivity() {
        Intent intent = new Intent(this, SberbankMainActivity.class);
        startActivity(intent);
    }
}
