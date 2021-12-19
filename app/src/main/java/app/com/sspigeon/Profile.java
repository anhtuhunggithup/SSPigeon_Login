package app.com.sspigeon;

import android.app.Activity;
import android.media.Image;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

import androidx.appcompat.app.AppCompatActivity;

public class Profile extends AppCompatActivity {

    AutoCompleteTextView month, gender;
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
        month = (AutoCompleteTextView) findViewById(R.id.Month);
        gender = (AutoCompleteTextView) findViewById(R.id.Gender);
    }

    private void CreateMonth() {
        months = getResources().getStringArray(R.array.Months);
        ArrayAdapter<String> monthAdapter = new ArrayAdapter<>(Profile.this, R.layout.support_simple_spinner_dropdown_item, months);
        month.setDropDownHeight(400);
        month.setAdapter(monthAdapter);
    }

    private void CreateGender() {
        genders = getResources().getStringArray(R.array.Genders);
        ArrayAdapter<String> monthAdapter = new ArrayAdapter<>(Profile.this, R.layout.support_simple_spinner_dropdown_item, genders);
        gender.setAdapter(monthAdapter);
    }
}
