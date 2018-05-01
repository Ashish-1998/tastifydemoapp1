package tastify.ashish.com.tastifyademoapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    private ImageView img,img2;
    private Button btn1;
    private TextView mytxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        img = findViewById(R.id.imageView2);
        img2 = findViewById(R.id.imageView3);
        mytxt= findViewById(R.id.textView);
        btn1 = findViewById(R.id.button);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i= new Intent(Main2Activity.this,LoginScreen.class);
                startActivity(i);
            }
        });
    }
}
