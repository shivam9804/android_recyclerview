package com.example.recyclerview_practice;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;

import java.util.ArrayList;

import static com.example.recyclerview_practice.R.id.my_recycle_view;

public class MainActivity extends AppCompatActivity {

    private ArrayList<String> image = new ArrayList<>();
    private ArrayList<String> name  = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DataForHolder();
    }

    private void DataForHolder(){
        image.add("https://upload.wikimedia.org/wikipedia/en/thumb/3/30/Java_programming_language_logo.svg/549px-Java_programming_language_logo.svg.png");
        name.add("Java");

        image.add("http://allisnow.com/images/themes/logos/computer-programming-languages/w/php-logo.png");
        name.add("PHP");

        image.add("https://cdn3-www.mandatory.com/assets/uploads/2018/09/C_Language.jpg");
        name.add("C#");

        image.add("https://ih0.redbubble.net/image.316760149.5828/ap,550x550,12x12,1,transparent,t.png");
        name.add("Java Script");

        image.add("https://thumb1.shutterstock.com/display_pic_with_logo/4414507/695290207/stock-vector-logo-c-programming-language-icon-vector-illustration-on-topic-of-popular-high-level-coding-695290207.jpg");
        name.add("C++");

        image.add("https://res.cloudinary.com/teepublic/image/private/s--TwCcIoc_--/t_Resized%20Artwork/c_fit,g_north_west,h_954,w_954/co_000000,e_outline:48/co_000000,e_outline:inner_fill:48/co_ffffff,e_outline:48/co_ffffff,e_outline:inner_fill:48/co_bbbbbb,e_outline:3:1000/c_mpad,g_center,h_1260,w_1260/b_rgb:eeeeee/c_limit,f_jpg,h_630,q_90,w_630/v1520050660/production/designs/2416585_0.jpg");
        name.add("Python");

        initRecyclerView();
    }

    private void initRecyclerView(){
        RecyclerView recyclerView = findViewById(my_recycle_view);
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(image, name, this);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

}