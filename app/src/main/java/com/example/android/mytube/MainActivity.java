package com.example.android.mytube;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecycleviewAdapter recycleviewAdapter;
    private List<Model> list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recycleview);
        list = new ArrayList<>();
        list.add(new Model(R.drawable.naruto , "Naruto Uzumaki character video" ,
                "https://statusguide.com/anykreeg/2021/04/Naruto-kurama-AMV__edit-_-whatsapp-status.mp4"));
        list.add(new Model(R.drawable.luffy , "Monkey.D.Luffy edit video" ,
                "https://statusguide.com/anykreeg/2021/12/yt1s.com-Luffy-" +
                        "I-can-defeat-you-onepiece-luffy-whatsappstatus_1080p.mp4"));
        list.add(new Model(R.drawable.ken_kaneki , "Ken Kanaki status" ,
                "https://statusguide.com/anykreeg/2021/06/%F0%9D%99%BA%F0%9D%99%B4%F0%9D%99%BD" +
                        "-%F0%9D%99%BA%F0%9D%99%B0%F0%9D%99%BD%F0%9D%99%B4%F0%9D%99%BA%F0%9D%99%B8-%F0%9D%9A%86%F0%9D%99%B7%F0%9D%99%B0%F0%9D%9A%83%F0%9D%9A%82%F0%9D%99%B0%F0%9D%99%BF%F0%9D%99%BF-%F0%9D%9A%82%F0%9D%9A%83%F0%9D%99%B0%F0%9D%9A%83%F0%9D%9A%84%F0%9D%9A%82.mp4"));
        list.add(new Model(R.drawable.your_name , "Your-Name Kimi no na wa Stereo Hearts-Anime" ,
                "https://statusguide.com/anykreeg/2021/06/yt1s.com-Your-Name-Kimi-no-na-wa-Stereo-Hearts-Anime-whatsapp-status_720p.mp4"));
        list.add(new Model(R.drawable.saitama , "One-Punch-Man-Fitness-test status" ,
                "https://statusguide.com/anykreeg/2021/05/One-Punch-Man-Fitness-test.mp4"));
        list.add(new Model(R.drawable.deku , "My-hero-academia Deku fearless scene" ,
                "https://statusguide.com/anykreeg/2021/05/Fearless-WhatsApp-Status-_-My-hero-academia.mp4"));
        list.add(new Model(R.drawable.pain , "Pain-whatsapp-status" ,
                "https://statusguide.com/anykreeg/2021/04/videoplayback-23.mp4"));
        list.add(new Model(R.drawable.itachi_uchiha , "Itachi-Uchiha-whatsapp-status" ,
                "https://statusguide.com/anykreeg/2021/04/Status-WhatsApp-Naruto-Itachi.mp4"));

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        RecycleviewAdapter adapter = new RecycleviewAdapter(this , list);
        recyclerView.setAdapter(adapter);
    }
}