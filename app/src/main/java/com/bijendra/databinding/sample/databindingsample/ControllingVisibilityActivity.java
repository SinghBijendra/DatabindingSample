package com.bijendra.databinding.sample.databindingsample;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.bijendra.databinding.sample.databindingsample.databinding.ActivityControllingVisibilityBinding;
import com.bijendra.databinding.sample.databindingsample.databinding.ActivityOneWayBinding;

public class ControllingVisibilityActivity extends AppCompatActivity {

    private ActivityControllingVisibilityBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding= DataBindingUtil.setContentView(this,R.layout.activity_controlling_visibility);
        Student student=new Student("Name:Bijendra",null,"Course:P.G",null);
        binding.setStudent(student);

    }
}
