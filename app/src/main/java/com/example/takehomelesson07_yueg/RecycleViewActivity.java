package com.example.takehomelesson07_yueg;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class RecycleViewActivity extends AppCompatActivity {
    private List<Person> persons;
    private PersonsAdapter personsAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycle_view);
        setTitle("President List");

        initialData();

        RecyclerView recycleView = findViewById(R.id.recycle_view);
        recycleView.setHasFixedSize(true);
        recycleView.setLayoutManager(new LinearLayoutManager(this));
        personsAdapter = new PersonsAdapter(persons, this);
        recycleView.setAdapter(personsAdapter);
    }

    private void initialData() {
        persons = new ArrayList<>();
        persons.add(new Person("Bill Clinton", "1993-2001", R.drawable.clinton));
        persons.add(new Person("George W. Bush", "2001-2009", R.drawable.bush));
        persons.add(new Person("Barack Obama", "2009-2017", R.drawable.obama));
    }


    public Person getRandomPerson() {
        int num = (int) (Math.random() * 3);
        if (num == 0)
            return new Person("Bill Clinton", "1993-2001", R.drawable.clinton);
        else if (num == 1) {
            return new Person("George W. Bush", "2001-2009", R.drawable.bush);
        } else {
            return new Person("Barack Obama", "2009-2017", R.drawable.obama);
        }
    }

    public void addPerson(View view){
        persons.add(getRandomPerson());
        personsAdapter.notifyDataSetChanged();
    }
}
