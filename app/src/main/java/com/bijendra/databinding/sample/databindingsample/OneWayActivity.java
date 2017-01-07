package com.bijendra.databinding.sample.databindingsample;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import com.bijendra.databinding.sample.databindingsample.databinding.ActivityOneWayBinding;
public class OneWayActivity extends AppCompatActivity {

   private ActivityOneWayBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding= DataBindingUtil.setContentView(this,R.layout.activity_one_way);

        Student student=new Student("Name:Bijendra","Age:35","Course:P.G",null);
        binding.setStudent(student);
    }
}
