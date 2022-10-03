package com.example.android.mytube;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RecycleviewAdapter extends RecyclerView.Adapter<RecycleviewAdapter.ViewHolder> {

    private final List<Model> listData;
    private final Context context;

    public static class ViewHolder extends RecyclerView.ViewHolder {
        private final TextView textView;
        private final ImageView imageView;

        public ViewHolder(View view) {
            super(view);

            textView = (TextView) view.findViewById(R.id.video_text);
            imageView = (ImageView) view.findViewById(R.id.video_image);
        }
    }

    public RecycleviewAdapter(Context context, List<Model> list){
        this.listData = list;
        this.context = context;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item , parent , false);
        return new ViewHolder(view);

    }

    @Override
    public void onBindViewHolder(ViewHolder holder, final int position) {
        int image = listData.get(position).getImageView();
        String text = listData.get(position).getTextview();
        String video = listData.get(position).getVideoview();

        holder.imageView.setImageResource(image);
        holder.textView.setText(text);

        holder.imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context , VideoPlay.class );
                intent.putExtra("Video" , video);
                intent.putExtra("VideoName" , text);
                context.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return listData.size();
    }
}
