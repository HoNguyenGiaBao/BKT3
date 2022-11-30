package ute.application.bkt3;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class SubActivity extends AppCompatActivity {

    TextView tv;
    ImageView img;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);
        tv= findViewById(R.id.textViewBookNameActivity);
        img = findViewById(R.id.imageAuthorActivity);

        Intent myintent = getIntent();
        String name = myintent.getStringExtra("name");
        int image = myintent.getIntExtra("image",1);

        img.setImageResource(image);
        tv.setText(name);

    }
}