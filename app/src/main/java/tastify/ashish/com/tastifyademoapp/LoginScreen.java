package tastify.ashish.com.tastifyademoapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class LoginScreen extends AppCompatActivity {
    private ImageView img4,img5;
    private TextView txt2;
    private EditText edt1;
    private Button btnn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_screen);
        img4 = findViewById(R.id.imageView4);
        img5 = findViewById(R.id.imageView5);
        txt2 = findViewById(R.id.textView2);
        edt1 = findViewById(R.id.editText);
        btnn = findViewById(R.id.button2);

        btnn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(edt1.getText().toString().equals(""))
                    edt1.setError("Phone is Required");
                else if(edt1.getText().toString().length()!=10)
                    edt1.setError("Mobile No must contains 10 digit ");
                else {
                    Intent i = new Intent(LoginScreen.this, otpScreen.class);
                    startActivity(i);
                }

            }
        });


    }
}
