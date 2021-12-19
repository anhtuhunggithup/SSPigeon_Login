package app.com.sspigeon;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class SignUp extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signup);
    }

    public void IntentLogin(View view) {
        Intent intent = new Intent(SignUp.this, Login.class);
        startActivity(intent);
    }

}
