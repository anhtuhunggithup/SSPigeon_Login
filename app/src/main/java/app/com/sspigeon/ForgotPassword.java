package app.com.sspigeon;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ForgotPassword extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.forgot_password);
    }

    public void IntentLogin(View view) {
        Intent intent = new Intent(ForgotPassword.this, Login.class);
        startActivity(intent);
    }
}
