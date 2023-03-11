package com.devoam_eff_22_23.crj;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class Ex01Activity extends AppCompatActivity {
    ImageView ivEx01Digit;
    EditText etEx01Digit;
    Integer[] imagesIds = new Integer[]{
            R.drawable.zero, R.drawable.one, R.drawable.two,
            R.drawable.three, R.drawable.four, R.drawable.five,
            R.drawable.six, R.drawable.seven, R.drawable.eight,
            R.drawable.nine
    };

    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ex01);
        setTitle("");
        ivEx01Digit = findViewById(R.id.ivEx01Digit);
        etEx01Digit = findViewById(R.id.etEx01Digit);

        etEx01Digit.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                try {
                    Integer digit = Integer.parseInt(s.toString());

                    if (! (digit >= 0 & digit <= 9))
                        throw new Exception();
                    else
                        ivEx01Digit.setImageResource(imagesIds[digit]);
                } catch (Exception e) {
                    ivEx01Digit.setImageResource(R.drawable.error);
                }
            }
        });
    }
}
