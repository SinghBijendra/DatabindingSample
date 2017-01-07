package com.bijendra.databinding.sample.databindingsample;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.bijendra.databinding.sample.databindingsample.databinding.ActivitySimpleDatabindingBinding;

public class SimpleDatabindingActivity extends AppCompatActivity implements View.OnClickListener {

    private ActivitySimpleDatabindingBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding= DataBindingUtil.setContentView(this,R.layout.activity_simple_databinding);
        //setContentView(R.layout.activity_simple_databinding);
        binding.tvLabel.setAllCaps(true);
        binding.tvLabel.setText(getString(R.string.sample_text));
        binding.butSample.setText(getString(R.string.click_me));
        binding.butSample.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        if(view.getId()==binding.butSample.getId())
            Toast.makeText(this,"Button Clicked",Toast.LENGTH_SHORT).show();

    }
}
