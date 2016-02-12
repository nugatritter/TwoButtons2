package de.nugatritter.helloworld;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class AnotherActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_another);
    }
    public void openLastActivity(View view) {
        Intent intent = new Intent(this, LastActivity.class);
        startActivity(intent);
    }
    public void openFirstrActivity(View view) {
        Intent intent = new Intent(this, StartActivity.class);
        startActivity(intent);
    }
}
