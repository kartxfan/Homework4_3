package com.example.homework4_3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class SecondActivity extends AppCompatActivity {

    // создание коллекции контейнера для данных класса Animal
    List<Animal> animals = new ArrayList<Animal>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        // инициализируем контейнер
        setInitialData();

        // создадим объект RecyclerView и привяжем к нему соответствующий id
        RecyclerView recyclerView = findViewById(R.id.list_animal);

        // создадим адаптер и загрузим в него контейнер с данными
        AnimalAdapter adapter = new AnimalAdapter(this, animals);

        // на recyclerView подадим адаптер
        recyclerView.setAdapter(adapter);
    }

    // метод setInitialData() устанавливает начальный набор данных (а именно изображения из папки res/drawables)
    private void setInitialData() {
        // добавление в контейнер animals объектов сущности Animal
        animals.add( new Animal("Люди", "это в первую очередь бандиты, разбойники, и те, чьим планам мешают ведьмаки",
                R.drawable.people, "Численность: большая"));
        animals.add( new Animal("Животные", "волки, медведи и прочие. Поведение некоторых из зверей зависит от времени суток – в дневное время они безопасны и не агрессивны, а в ночное время нападут на вас;",
                R.drawable.animals, "Численность: средняя"));
        animals.add( new Animal("Монстры", "существа, сущность которых так или иначе извратила магия. Их в мире ведьмака огромное количество. Собственно ведьмаков и создали для того, чтобы они чистили мир от этой нечестии. Практически в каждой деревне Геральту расскажут про какое-либо чудище, которое мешает людям жить;",
                R.drawable.monsters, "Численность: большая"));
        animals.add( new Animal("Именные монстры", "это особые монстры, которые существуют только в единичным экземпляре. У каждого из них – своя предыстория, своя манера поведения, свои сильные и слабые стороны. В каждой локации существует минимум один именной монстр, и если общаться с жителями – вам обязательно про него расскажут. Этот тип монстров очень силен, и прежде чем сразиться с ним, нужно выяснить его слабые стороны и хорошенько подготовиться к бою;",
                R.drawable.named_monsters, "Численность: очень маленькая"));
    }
}