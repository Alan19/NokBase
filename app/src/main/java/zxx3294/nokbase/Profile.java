package zxx3294.nokbase;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Profile extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
    }

    protected void goToMain(View view){
        Intent intent = new Intent(Profile.this, MainActivity.class);
        startActivity(intent);
    }
}
