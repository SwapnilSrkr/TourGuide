package com.example.android.tourguide;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;

public class ContentAdapter extends ArrayAdapter<Content> {

    public ContentAdapter(Context context, ArrayList<Content> contents) {
        super(context, 0, contents);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_content, parent, false);
        }

        Content currentContent = getItem(position);

        TextView contentNameTextView = listItemView.findViewById(R.id.content_name);
        contentNameTextView.setText(currentContent.getContentName());

        ImageView imageView =  listItemView.findViewById(R.id.content_image);
        imageView.setImageResource(currentContent.getContentImageId());

        if (currentContent.hasImage()) {
            imageView.setImageResource(currentContent.getContentImageId());
            imageView.setVisibility(View.VISIBLE);
        } else {
            imageView.setVisibility(View.GONE);
        }
        return listItemView;
    }
}