package com.blackbirds.shakil.viewbindingexample;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatEditText;

import android.os.Bundle;

import com.blackbirds.shakil.viewbindingexample.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    AppCompatEditText edtEmail;

    private ActivityMainBinding binding;
    private String email;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        email = binding.edtEmail.getText().toString();
    }
}