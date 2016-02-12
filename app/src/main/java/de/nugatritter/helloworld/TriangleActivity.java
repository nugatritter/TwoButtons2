package de.nugatritter.helloworld;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

public class TriangleActivity extends AppCompatActivity {
    TwoButtons buttons;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_triangle);
        buttons = (TwoButtons) findViewById(R.id.twoButtons1);
        buttons.setOnButtonClickEvent(new TwoButtons.ButtonClickEvents() {

            @Override
            public void redButtonClick() {
                // TODO Auto-generated method stub
                Toast.makeText(getApplicationContext(), "red",
                        Toast.LENGTH_SHORT).show();

            }

            @Override
            public void blueButtonClick() {
                // TODO Auto-generated method stub
                Toast.makeText(getApplicationContext(), "blue",
                        Toast.LENGTH_SHORT).show();

            }
        });

    }
}
