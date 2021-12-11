package app.com.sspigeon;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class Login extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
        startActivity(new Intent(Login.this, SignUp.class));
    }
}
