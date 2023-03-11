package com.devoam_eff_22_23.crj;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.ImageView;

public class Ex02Activity extends AppCompatActivity {
    ImageView ivEx02Tens, ivEx02Units;
    EditText etEx02Number;
    Integer[] imagesIds = new Integer[]{
            R.drawable.zero, R.drawable.one, R.drawable.two,
            R.drawable.three, R.drawable.four, R.drawable.five,
            R.drawable.six, R.drawable.seven, R.drawable.eight,
            R.drawable.nine
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ex02);

        ivEx02Tens = findViewById(R.id.ivEx02Tens);
        ivEx02Units = findViewById(R.id.ivEx02Units);
        etEx02Number = findViewById(R.id.etEx02Number);

        etEx02Number.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                try {
                    Integer number = Integer.parseInt(s.toString());
                    if (number >= 0 & number <= 99) {
                        Integer tens = number / 10,
                                units = number % 10;

                        ivEx02Tens.setImageResource(imagesIds[tens]);
                        ivEx02Units.setImageResource(imagesIds[units]);
                    } else throw new NumberFormatException();
                } catch (NumberFormatException e) {
                    ivEx02Tens.setImageResource(R.drawable.error);
                    ivEx02Units.setImageResource(R.drawable.error);
                }
            }
        });
    }
}