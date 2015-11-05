package com.google.cloud.samples.campusconnect;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by RK on 04/11/2015.
 */
public class ProfileMenuActivity extends ActionBarActivity {

    RecyclerView menu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_menu);

        menu = (RecyclerView) findViewById(R.id.recycler_menu_options);
        menu.setHasFixedSize(true);
        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        menu.setLayoutManager(llm);
        menu.setItemAnimator(new DefaultItemAnimator());
        MenuAdapterActivity menu_items = new MenuAdapterActivity(
                createList_menu(6));
        menu.addItemDecoration(new DividerItemDecoration(this, LinearLayoutManager.VERTICAL));
        menu.setAdapter(menu_items);
    }

    private List<Menu_infoActivity> createList_menu(int size) {
        List<Menu_infoActivity> result = new ArrayList<Menu_infoActivity>();
        for (int i = 1; i <= size; i++) {
            Menu_infoActivity ci = new Menu_infoActivity();

            result.add(ci);
        }
        return result;
    }
}
