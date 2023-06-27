package com.example.note_app;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.view.View;

import com.example.note_app.databinding.ActivityAddNoteBinding;

import java.util.Objects;

public class AddNoteActivity extends AppCompatActivity {
ActivityAddNoteBinding binding;
    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LAYOUT_STABLE | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN);
            getWindow().setStatusBarColor(Color.TRANSPARENT);
        }
        binding = ActivityAddNoteBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        String type =  getIntent().getStringExtra("type");

        if (type.equals("update")) {
            setTitle("Update");
            binding.edtTitle.setText(getIntent().getStringExtra("title").toString());
            binding.edtDesc.setText(getIntent().getStringExtra("desc").toString());
            int id = getIntent().getIntExtra("id", 0);
            binding.addBtn.setText("Update Note");
            binding.heading.setText("Update Your \nNote");

            binding.addBtn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent();
                    intent.putExtra("title", Objects.requireNonNull(binding.edtTitle.getText()).toString());
                    intent.putExtra("desc", Objects.requireNonNull(binding.edtDesc.getText()).toString());
                    intent.putExtra("id", id);
                    setResult(RESULT_OK, intent);
                    finish();
                }
            });

        } else {
            setTitle("Add Mode");
            binding.addBtn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent();
                    intent.putExtra("title", Objects.requireNonNull(binding.edtTitle.getText()).toString());
                    intent.putExtra("desc", Objects.requireNonNull(binding.edtDesc.getText()).toString());
                    setResult(RESULT_OK, intent);
                    finish();
                }
            });
        }


    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Intent intent = new Intent(AddNoteActivity.this, MainActivity.class);
        startActivity(intent);
    }
}