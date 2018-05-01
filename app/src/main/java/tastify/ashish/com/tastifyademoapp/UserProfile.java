package tastify.ashish.com.tastifyademoapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class UserProfile extends AppCompatActivity {
    private ImageView img7,iomg9,img10,img11,img12;
    private Button btn34,btn35;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_profile);
        img7 = findViewById(R.id.imageView7);
        iomg9 = findViewById(R.id.imageView9);
        img10 = findViewById(R.id.imageView10);
        img11 = findViewById(R.id.imageView11);
        img12 = findViewById(R.id.imageView12);
        img12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(UserProfile.this,Biker.class);
                startActivity(i);
            }
        });

    }

}
