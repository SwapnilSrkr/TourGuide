package com.example.android.tourguide;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import java.util.ArrayList;

public class InfoFragment extends Fragment {

    public InfoFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_content, container, false);

        final ArrayList<Content> contentList = new ArrayList<Content>();

        contentList.add(new Content(getString(R.string.flag), R.drawable.india_flag));
        contentList.add(new Content(getString(R.string.india_description), R.drawable.india_map));

        ContentAdapter adapter = new ContentAdapter(getActivity(), contentList);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);
        return rootView;
    }
}