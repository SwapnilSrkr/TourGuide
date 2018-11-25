package com.example.android.tourguide;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import java.util.ArrayList;

public class HistoricalFragment extends Fragment {

    public HistoricalFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_content, container, false);

        final ArrayList<Content> contentList = new ArrayList<Content>();

        contentList.add(new Content(getString(R.string.tajmahal), R.drawable.tajmahal));
        contentList.add(new Content(getString(R.string.agrafort), R.drawable.agrafort));
        contentList.add(new Content(getString(R.string.hawamahal), R.drawable.hawamahal));

        ContentAdapter adapter = new ContentAdapter(getActivity(), contentList);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);
        return rootView;
    }
}