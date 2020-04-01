package com.jwala.recyclerviewbasicexample;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    private List<EmployeeModel> employeeModelListtttt;
    private RecyclerViewAdapter recyclerViewAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);

        employeeModelListtttt = new ArrayList<>();

//        employeeModelListtttt.add(new EmployeeModel(100));
//        employeeModelListtttt.add(new EmployeeModel(100));
//        employeeModelListtttt.add(new EmployeeModel(100));


//        employeeModelListtttt.add(new EmployeeModel(100,"jwala"));
//        employeeModelListtttt.add(new EmployeeModel(100,"jwala"));
//        employeeModelListtttt.add(new EmployeeModel(100,"jwala"));
//        employeeModelListtttt.add(new EmployeeModel(100,"jwala"));


        employeeModelListtttt.add(new EmployeeModel(100, "Jwala Kumar", R.drawable.images));
        employeeModelListtttt.add(new EmployeeModel(100, "Jwala Kumar", R.drawable.ic_launcher_background));
        employeeModelListtttt.add(new EmployeeModel(100, "Jwala Kumar", R.drawable.images));
        employeeModelListtttt.add(new EmployeeModel(100, "Jwala Kumar", R.drawable.backgtound_png));
        employeeModelListtttt.add(new EmployeeModel(100, "Jwala Kumar", R.drawable.dd));
        employeeModelListtttt.add(new EmployeeModel(100, "Jwala Kumar", R.drawable.github));
        employeeModelListtttt.add(new EmployeeModel(100, "Jwala Kumar", R.drawable.images));
        employeeModelListtttt.add(new EmployeeModel(100, "Jwala Kumar", R.drawable.backgtound_png));
        employeeModelListtttt.add(new EmployeeModel(100, "Jwala Kumar", R.drawable.images));
        employeeModelListtttt.add(new EmployeeModel(100, "Jwala Kumar", R.drawable.github));
        employeeModelListtttt.add(new EmployeeModel(100, "Jwala Kumar", R.drawable.images));
        employeeModelListtttt.add(new EmployeeModel(100, "Jwala Kumar", R.drawable.backgtound_png));
        employeeModelListtttt.add(new EmployeeModel(100, "Jwala Kumar", R.drawable.images));

        recyclerViewAdapter = new RecyclerViewAdapter(MainActivity.this, employeeModelListtttt);

        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());

        recyclerView.setAdapter(recyclerViewAdapter);

    }
}
