package com.bijendra.databinding.sample.databindingsample;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.bijendra.databinding.sample.databindingsample.databinding.ActivityMainBinding;


public class MainActivity extends AppCompatActivity implements View.OnClickListener{


    ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding= DataBindingUtil.setContentView(this,R.layout.activity_main);
        binding.butSimple.setOnClickListener(this);
        binding.butOneWay.setOnClickListener(this);
        binding.butControllingVisibility.setOnClickListener(this);
        binding.butRecycleView.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if(view.getId()==binding.butSimple.getId())
            startActivity(new Intent(this,SimpleDatabindingActivity.class));
        else if(view.getId()==binding.butOneWay.getId())
            startActivity(new Intent(this,OneWayActivity.class));
        else if(view.getId()==binding.butControllingVisibility.getId())
            startActivity(new Intent(this,ControllingVisibilityActivity.class));
        else if(view.getId()==binding.butRecycleView.getId())
            startActivity(new Intent(this,RecycleViewSampleActivity.class));

    }
}
