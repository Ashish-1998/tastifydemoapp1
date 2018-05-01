package tastify.ashish.com.tastifyademoapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class otpScreen extends AppCompatActivity {
    private ImageView img6,img8;
    private TextView txt3;
    private EditText edit2;
    private Button btn2;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_otp_screen);
        img6 = findViewById(R.id.imageView6);
        img8 = findViewById(R.id.imageView8);
        txt3 = findViewById(R.id.textView3);
        edit2 = findViewById(R.id.editText2);
        btn2 = findViewById(R.id.button2);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(edit2.getText().toString().equals(""))
                    edit2.setError("Phone is Required");
                else if(edit2.getText().toString().length()!=4)
                    edit2.setError("Mobile No must contains 4 digit ");
                else {
                    Intent i = new Intent(otpScreen.this,UserProfile.class);
                    startActivity(i);
                }

            }
        });
    }
}
