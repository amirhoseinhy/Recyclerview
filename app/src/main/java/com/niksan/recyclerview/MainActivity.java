package com.niksan.recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    private String[] name = {"امیر حسین", "علیرضا", "محمد", "امید", "حسین", "حسن",
            "پروانه", "پریا", "سارا", "مریم", "شبنم", "فرهاد"};
    private String[] family = {"حیدری", "علوی", "غلامی", "حسینی", "شهیدی", "مودت",
            "احسانی", "کارا", "فرزین", "شاهی", "غلامپور", "ولیپور"};
    private int[] images = {R.drawable.a, R.drawable.a, R.drawable.a, R.drawable.a
            , R.drawable.a, R.drawable.a, R.drawable.a, R.drawable.a, R.drawable.a
            , R.drawable.a, R.drawable.a, R.drawable.a};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = (RecyclerView) findViewById(R.id.recyclerview);

        List<User> sampleuser = new ArrayList<>();
        RecyclerAdapter adapter = new RecyclerAdapter(getBaseContext(),sampleuser);

        for (int i = 0; i < name.length; i++) {
            User user = new User();
            user.setUsername(name[i]) ;
            user.setFamily(family[i]);
            user.setImg(images[i]);
            sampleuser.add(user);
        }

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);

        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setHasFixedSize(true);


        recyclerView.setAdapter(adapter);

    }
}
