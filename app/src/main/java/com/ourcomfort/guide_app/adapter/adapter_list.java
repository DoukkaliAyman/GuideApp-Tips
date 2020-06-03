package com.ourcomfort.guide_app.adapter;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.ourcomfort.guide_app.Details;
import com.ourcomfort.guide_app.R;
import com.ourcomfort.guide_app.R.layout.*;
import com.ourcomfort.guide_app.model.list_item;

import java.util.List;

public class adapter_list extends RecyclerView.Adapter <adapter_list.viewHolder> {

    private Context context;
    private List<list_item> list;

    public adapter_list(Context context,List<list_item> list){
        this.context = context;
        this.list = list;
    }


    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.demo_item,viewGroup,false);
        return new viewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull adapter_list.viewHolder viewHolder, int i) {
        list_item listItem = list.get(i);
        viewHolder.textView.setText(listItem.getTitle());
        viewHolder.imageView.setImageResource(listItem.getImage());
     viewHolder.date_txt.setText(listItem.getDate_item());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        private TextView textView, date_txt;
        private ImageView imageView;
        public viewHolder(@NonNull View itemView) {
            super(itemView);
            itemView.setOnClickListener(this);
            date_txt = itemView.findViewById(R.id.date_poste);
            textView = itemView.findViewById(R.id.title_item);
            imageView = itemView.findViewById(R.id.img_item);
        }

        @Override
        public void onClick(View v) {
            int position = getAdapterPosition();
            list_item lists = list.get(position);
           Intent intent = new Intent(context, Details.class);
            intent.putExtra("image",lists.getImage());
            intent.putExtra("descr",lists.getDescription());
            intent.putExtra("title",lists.getTitle());
            intent.putExtra("date",lists.getDate_item());
            context.startActivity(intent);
        }
    }
}
