package com.example.android.tourguide;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import java.util.ArrayList;

public class EventFragment extends Fragment {


    public EventFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_content, container, false);

        final ArrayList<Content> contentList = new ArrayList<Content>();

        contentList.add(new Content(getString(R.string.holi), R.drawable.holi));
        contentList.add(new Content(getString(R.string.diwali), R.drawable.diwali));
        contentList.add(new Content(getString(R.string.durgapuja), R.drawable.durgapuja));
        contentList.add(new Content(getString(R.string.ganesh), R.drawable.ganesh));

        ContentAdapter adapter = new ContentAdapter(getActivity(), contentList);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);
        return rootView;
    }
}

