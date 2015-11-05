package com.google.cloud.samples.campusconnect;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.PorterDuff;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.appspot.campus_connect_2015.clubs.Clubs;
import com.appspot.campus_connect_2015.clubs.model.ModelsClubListResponse;
import com.appspot.campus_connect_2015.clubs.model.ModelsClubRetrievalMiniForm;
import com.appspot.campus_connect_2015.clubs.model.ModelsColleges;
import com.appspot.campus_connect_2015.clubs.model.ModelsGetCollege;
import com.google.api.client.googleapis.extensions.android.gms.auth.GoogleAccountCredential;
import com.google.cloud.samples.campusconnect.LoginActivity.CollegeListAdapterActivity;
import com.google.cloud.samples.campusconnect.LoginActivity.CollegeList_infoActivity;
import com.google.common.base.Strings;

import java.io.IOException;
import java.security.acl.Group;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class GroupPageActivity extends ActionBarActivity {

    RecyclerView group_page;
    public static FloatingActionButton fab_post_from_group_page;
    int flag_coming_from_group_page=1;
    GroupPageAdapterActivity gp;
    private static final String LOG_TAG="GroupPageActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_group_page);

        group_page = (RecyclerView) findViewById(R.id.recycler_group_page);
        fab_post_from_group_page = (FloatingActionButton) findViewById(R.id.fab_post);

        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        group_page.setLayoutManager(llm);
        group_page.setHasFixedSize(true);
        group_page.setItemAnimator(new DefaultItemAnimator());

        gp = new GroupPageAdapterActivity(
                createList_group_page(6));

        fab_post_from_group_page.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                flag_coming_from_group_page = 1;
                Bundle bun = new Bundle();
                bun.putString("G_NAME", gp.get_group_name());
                bun.putInt("FLAG",flag_coming_from_group_page);
                Intent intent_temp = new Intent(v.getContext(), CreatePostActivity.class);
                intent_temp.putExtras(bun);
                startActivity(intent_temp);

            }
        });

        group_page.setAdapter(gp);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
    private List<GroupPage_infoActivity> createList_group_page(int size) {

        List<GroupPage_infoActivity> result = new ArrayList<GroupPage_infoActivity>();
        for (int i = 1; i <= size; i++) {
            GroupPage_infoActivity ci = new GroupPage_infoActivity();

            result.add(ci);

        }

        return result;
    }

}
