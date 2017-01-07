package com.bijendra.databinding.sample.databindingsample;


import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import com.bijendra.databinding.sample.databindingsample.BR;

/**
 * Created by Newdream on 06-Jan-17.
 */

public class StudentRecyclerAdapter extends RecyclerView.Adapter<StudentRecyclerAdapter.BindingHolder>{

    private ArrayList<Student> mStudents;
    public StudentRecyclerAdapter( ArrayList<Student> mStudents)
    {
        this.mStudents=mStudents;
    }
    @Override
    public BindingHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.row_student_item,parent,false);
        BindingHolder bindingHolder=new BindingHolder(view);
        return bindingHolder;
    }

    @Override
    public void onBindViewHolder(BindingHolder holder, int position) {

      Student student=mStudents.get(position);
       holder.getBinding().setVariable(BR.student,student);
       holder.getBinding().executePendingBindings();
    }

    @Override
    public int getItemCount() {
        return  this.mStudents.size();
    }

    public static class BindingHolder extends RecyclerView.ViewHolder
   {

       private ViewDataBinding binding;
       public BindingHolder(View itemView) {
           super(itemView);
           binding= DataBindingUtil.bind(itemView);
       }
       public ViewDataBinding getBinding()
       {
           return binding;
       }
   }
}
