package com.example.suman.volleydemo.Adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.suman.volleydemo.Pojo.DataModel;
import com.example.suman.volleydemo.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by bapi on 4/1/17.
 */

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.viewHolder> {

    View view;
    Context context;
    List<DataModel> mDataList = new ArrayList<>();

    public CustomAdapter(Context context, List<DataModel> mDataList){

        this.context = context;
        this.mDataList = mDataList;
    }

    @Override
    public viewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        view = LayoutInflater.from(context).inflate(R.layout.single_row,parent,false);
        viewHolder vh = new viewHolder(view);
        return vh;
    }

    @Override
    public void onBindViewHolder(viewHolder holder, int position) {

        holder.tvName.setText(mDataList.get(position).getName());

    }

    @Override
    public int getItemCount() {
        return mDataList.size();
    }

    public static class viewHolder extends RecyclerView.ViewHolder{

        TextView tvName;
        View mContainer;
        ImageView imageView;

        public viewHolder(View itemView) {
            super(itemView);
            tvName = (TextView) itemView.findViewById(R.id.name);
            imageView = (ImageView) itemView.findViewById(R.id.imageView);
            mContainer = itemView.findViewById(R.id.container);

        }
    }
}
