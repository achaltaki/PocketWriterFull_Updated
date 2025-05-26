package com.example.pocketwriter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class FeedViewAdapter extends RecyclerView.Adapter<FeedViewAdapter.ViewHolder> {
    private List<String> data;

    public FeedViewAdapter(List<String> data) {
        this.data = data;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public TextView title;
        public ViewHolder(View view) {
            super(view);
            title = view.findViewById(R.id.articleTitle);
        }
    }

    @Override
    public FeedViewAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                     .inflate(R.layout.article_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.title.setText(data.get(position));
    }

    @Override
    public int getItemCount() {
        return data.size();
    }
}
