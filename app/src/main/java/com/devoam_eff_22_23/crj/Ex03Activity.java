package com.devoam_eff_22_23.crj;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

public class Ex03Activity extends AppCompatActivity {
    ImageView ivEx03;
    ImageButton ibEx03Previous, ibEx03Next;
    TextView tvEx03Name;
    ArrayList<Map.Entry<Integer, String>> imagesInfos = new ArrayList<>();
    Integer index = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ex03);

        // View Binding
        ivEx03 = findViewById(R.id.ivEx03);
        ibEx03Previous = findViewById(R.id.ibEx03Previous);
        ibEx03Next = findViewById(R.id.ibEx03Next);
        tvEx03Name = findViewById(R.id.tvEx03Name);

        imagesInfos.add(new AbstractMap.SimpleEntry<>(R.drawable.alps, "Alps"));
        imagesInfos.add(new AbstractMap.SimpleEntry<>(R.drawable.cactus, "Cactus"));
        imagesInfos.add(new AbstractMap.SimpleEntry<>(R.drawable.grass, "Grass"));

        ibEx03Previous.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (index > 0)
                    index--;

                ivEx03.setImageResource(imagesInfos.get(index).getKey());
                tvEx03Name.setText(imagesInfos.get(index).getValue());
            }
        });

        ibEx03Next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (index < imagesInfos.size() - 1)
                    index++;

                ivEx03.setImageResource(imagesInfos.get(index).getKey());
                tvEx03Name.setText(imagesInfos.get(index).getValue());
            }
        });
    }
}