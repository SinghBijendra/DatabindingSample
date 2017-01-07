package com.bijendra.databinding.sample.databindingsample;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;

import com.bijendra.databinding.sample.databindingsample.databinding.ActivityRecycleViewSampleBinding;

import java.util.ArrayList;
import java.util.List;

public class RecycleViewSampleActivity extends AppCompatActivity {
   private ActivityRecycleViewSampleBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       // setContentView(R.layout.activity_recycle_view_sample);
        binding= DataBindingUtil.setContentView(this,R.layout.activity_recycle_view_sample);
        binding.rvStudent.setLayoutManager(new LinearLayoutManager(this));
        binding.rvStudent.setAdapter(new StudentRecyclerAdapter(getStudentList()));
    }

    private ArrayList<Student> getStudentList()
    {
        ArrayList<Student> list=new ArrayList<>();
        list.add(new Student("Name:Kamal","Age:15","Class:10",Student.IMAGE_URL[0]));
        list.add(new Student("Name:Ram","Age:15","Class:10",Student.IMAGE_URL[1]));
        list.add(new Student("Name:Harish","Age:18","Class:B.E",Student.IMAGE_URL[2]));
        list.add(new Student("Name:Prakash","Age:21","Class:M.C.A",Student.IMAGE_URL[3]));
        list.add(new Student("Name:Ajay","Age:22","Class:P.G",Student.IMAGE_URL[4]));
        list.add(new Student("Name:Rahul","Age:23","Class:M.B.A",Student.IMAGE_URL[5]));

       return list;
    }
}
