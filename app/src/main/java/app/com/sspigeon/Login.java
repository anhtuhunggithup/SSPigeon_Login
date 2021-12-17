package app.com.sspigeon;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Login extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
    }

    public void IntentSignUp(View view) {
        Intent intent = new Intent(Login.this, SignUp.class);
        startActivity(intent);
    }

    public void IntentForgotPassword(View view) {
        Intent intent = new Intent(Login.this, ForgotPassword.class);
        startActivity(intent);
    }
}
