package com.google.cloud.samples.campusconnect;

import android.app.Activity;
import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.ToggleButton;

import java.util.List;

/**
 * Created by RK on 07-10-2015.
 */
public class GroupPageAdapterActivity extends
        RecyclerView.Adapter<GroupPageAdapterActivity.GroupPageHolder> {

    private List<GroupPage_infoActivity> GroupPageList;
    String g_name;
    Integer g_icon,m_count,f_count;
    int yes_dialog_box_click_count=0;

    public TextView dialog_info;
    public ImageView iv_member;

    GroupInfoViewHolder holder1;
    ExtraGroupInfoListHolder holder2;
    CharSequence GroupInfoAttributes[]={"About","Members","Upcoming Events","News Posts","Previous Events"};

    public GroupPageAdapterActivity(List<GroupPage_infoActivity> GroupsJoinedList) {
        this.GroupPageList = GroupsJoinedList;
    }

    @Override
    public int getItemCount() {
        return GroupPageList.size();
    }

    @Override
    public void onBindViewHolder(GroupPageHolder groupViewHolder, int i) {
        if(getItemViewType(i)==0) {
            holder1 = (GroupInfoViewHolder) groupViewHolder;
            holder1.group_name.setText(g_name);
            holder1.group_icon.setImageResource(g_icon);
            holder1.members_count.setText(m_count.toString());
            holder1.followers_count.setText(f_count.toString());
        }
        else {
            holder2 = (ExtraGroupInfoListHolder) groupViewHolder;
            holder2.g_name_joined.setText(GroupInfoAttributes[i-1]);
        }

    }

    @Override
    public int getItemViewType(int position) {
        int viewType;
        if(position==0)
            viewType = 0;
        else
            viewType=1;

        return viewType;
    }

    public String get_group_name(){
        return g_name;
    }

    @Override
    public GroupPageHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        GroupPageHolder holder;
        if(i==0)
        {
            View itemView = LayoutInflater.from(viewGroup.getContext()).inflate(
                    R.layout.activity_card_layout_group_info, viewGroup, false);
            holder = new GroupInfoViewHolder(itemView);
        }
        else
        {
            View itemView = LayoutInflater.from(viewGroup.getContext()).inflate(
                    R.layout.activity_card_layout_extra_group_info, viewGroup, false);
            holder = new ExtraGroupInfoListHolder(itemView);
        }

        return holder;
    }

    public static class GroupPageHolder extends RecyclerView.ViewHolder {

        public GroupPageHolder(View v) {
            super(v);
        }

    }
    public class GroupInfoViewHolder extends GroupPageAdapterActivity.GroupPageHolder{

        TextView group_name,members_count,followers_count;
        CircularImageView group_icon;
        ToggleButton tbtn_follow;
        public GroupInfoViewHolder(View itemView) {
            super(itemView);
            group_name = (TextView)itemView.findViewById(R.id.group_name);
            members_count = (TextView)itemView.findViewById(R.id.tv_members_count);
            followers_count = (TextView)itemView.findViewById(R.id.tv_followers_count);
            group_icon = (CircularImageView)itemView.findViewById(R.id.group_image);
            tbtn_follow = (ToggleButton)itemView.findViewById(R.id.tb_followers);
            iv_member = (ImageView)itemView.findViewById(R.id.iv_members);

            Bundle bundle =((Activity)itemView.getContext()).getIntent().getExtras();
            g_name = bundle.getString("G_NAME");
            g_icon = bundle.getInt("G_ICON");
            m_count = bundle.getInt("M_COUNT");
            f_count = bundle.getInt("F_COUNT");


            tbtn_follow.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                }
            });
            iv_member.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        MemberConfirmationDialog confirmDialog = new MemberConfirmationDialog((Activity) v.getContext());
                        Window window = confirmDialog.getWindow();
                        window.setLayout(450, ViewGroup.LayoutParams.WRAP_CONTENT);
                        confirmDialog.show();
                    }
                });

        }
    }

    public class ExtraGroupInfoListHolder extends GroupPageAdapterActivity.GroupPageHolder{

        TextView g_name_joined;
        CardView cv_group_attributes;
        public ExtraGroupInfoListHolder(View itemView) {
            super(itemView);
            g_name_joined = (TextView)itemView.findViewById(R.id.tv_group_joined_name);
            cv_group_attributes = (CardView)itemView.findViewById(R.id.group_attributes_card);


                cv_group_attributes.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if(getPosition()==1) {
                            Intent intent_temp = new Intent(v.getContext(), AboutGroupActivity.class);
                            v.getContext().startActivity(intent_temp);
                        }
                        else if(getPosition()==2) {
                            Intent intent_temp = new Intent(v.getContext(), GroupMembersByGroupActivity.class);
                            v.getContext().startActivity(intent_temp);
                        }
                        else if(getPosition()==3) {
                            Intent intent_temp = new Intent(v.getContext(), UpcomingEventsActivity.class);
                            v.getContext().startActivity(intent_temp);
                        }
                        else if(getPosition()==4) {
                            Intent intent_temp = new Intent(v.getContext(), NewsPostsByGroupActivity.class);
                            v.getContext().startActivity(intent_temp);
                        }
                        else if(getPosition()==5) {
                            Intent intent_temp = new Intent(v.getContext(), PreviousEventsActivity.class);
                            v.getContext().startActivity(intent_temp);
                        }
                        else{

                        }
                    }
                });
        }
    }

    public class MemberConfirmationDialog extends Dialog implements
            android.view.View.OnClickListener {

        public Activity c;
        public Dialog d;
        public TextView yes, no;



        public MemberConfirmationDialog(Activity a) {
            super(a);
            // TODO Auto-generated constructor stub
            this.c = a;
        }

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            requestWindowFeature(Window.FEATURE_NO_TITLE);
            setContentView(R.layout.member_confirmation_dialog);
            yes = (TextView) findViewById(R.id.btn_yes);
            no = (TextView) findViewById(R.id.btn_no);
            dialog_info = (TextView) findViewById(R.id.tv_dialog_info);
            if(yes_dialog_box_click_count%2!=0) {
                dialog_info.setText("Are you sure you want to leave the group?");
            }
            else{
                dialog_info.setText("Become a member of "+g_name);
            }

            yes.setOnClickListener(this);
            no.setOnClickListener(this);

        }

        @Override
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.btn_yes: {
                    yes_dialog_box_click_count++;
                    dismiss();
                    break;
                }
                case R.id.btn_no:
                    dismiss();
                    break;
                default:
                    break;
            }
            if(yes_dialog_box_click_count%2!=0) {
                iv_member.setImageResource(R.drawable.members_selected);
            }
            else{
                iv_member.setImageResource(R.drawable.members);
        }

        }

    }


}

