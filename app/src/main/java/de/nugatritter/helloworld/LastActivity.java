package de.nugatritter.helloworld;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class LastActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_last);
    }
    public void openPreviousActivity(View view) {
        Intent intent = new Intent(this, AnotherActivity.class);
        startActivity(intent);
    }

    public void openTriangleActivity(View view) {
        Intent intent = new Intent(this, TriangleActivity.class);
        startActivity(intent);
    }
}
