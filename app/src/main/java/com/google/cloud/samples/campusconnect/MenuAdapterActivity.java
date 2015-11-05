package com.google.cloud.samples.campusconnect;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;


/**
 * Created by RK on 10-09-2015.
 */
public class MenuAdapterActivity extends
        RecyclerView.Adapter<MenuAdapterActivity.MenuViewHolder> {

    private List<Menu_infoActivity> MenuItemsList;
    CharSequence items[]={"Settings","Report an issue","Rate us!","Invite a friend","About us","Log Out"};

    public MenuAdapterActivity(List<Menu_infoActivity> MenuItemsList) {
        this.MenuItemsList = MenuItemsList;
    }

    @Override
    public int getItemCount() {
        return MenuItemsList.size();
    }

    @Override
    public void onBindViewHolder(MenuViewHolder groupViewHolder, int i) {
        groupViewHolder.menu_item.setText(items[i]);
    }


    @Override
    public MenuViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {

            View itemView = LayoutInflater.from(viewGroup.getContext()).inflate(
                    R.layout.activity_card_layout_menu_item, viewGroup, false);
        return new MenuViewHolder(itemView);
    }

    public static class MenuViewHolder extends RecyclerView.ViewHolder {
        TextView menu_item;
        public MenuViewHolder(View v) {
            super(v);
            menu_item = (TextView)v.findViewById(R.id.tv_item);

        }

    }


}