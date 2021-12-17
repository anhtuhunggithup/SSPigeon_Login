package app.com.sspigeon;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

public class Profile extends Activity {

    AutoCompleteTextView textMonth, textGender;
    String[] months, genders;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.profile);
        Begin();
        CreateGender();
        CreateMonth();
    }

    private void Begin() {
        textMonth = (AutoCompleteTextView) findViewById(R.id.Month);
        textGender = (AutoCompleteTextView) findViewById(R.id.Gender);
    }

    private void CreateMonth() {
        months = getResources().getStringArray(R.array.Months);
        ArrayAdapter<String> monthAdapter = new ArrayAdapter<>(Profile.this, R.layout.support_simple_spinner_dropdown_item, months);
        textMonth.setDropDownHeight(400);
        textMonth.setAdapter(monthAdapter);
    }

    private void CreateGender() {
        genders = getResources().getStringArray(R.array.Genders);
        ArrayAdapter<String> monthAdapter = new ArrayAdapter<>(Profile.this, R.layout.support_simple_spinner_dropdown_item, genders);
        textGender.setAdapter(monthAdapter);
    }
}
