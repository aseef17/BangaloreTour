package com.example.aseef.tour;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class HighlightsFragment extends Fragment {


    public HighlightsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.item, container, false);

        final ArrayList<item> items=new ArrayList<item>();
        items.add(new item(R.string.highlights_1_header, R.string.highlights_1_phone, R.string.highlights_1_address, R.string.highlights_1_website, R.string.highlights_1_description, R.drawable.highlights_1, R.drawable.ic_call_black_24dp, R.drawable.ic_directions_black_24dp,R.drawable.ic_http_black_24dp));
        items.add(new item(R.string.highlights_2_header, R.string.highlights_2_address, R.string.highlights_2_description, R.drawable.highlights_2,  R.drawable.ic_directions_black_24dp));
        items.add(new item(R.string.highlights_3_header, R.string.highlights_3_address, R.string.highlights_3_description, R.drawable.highlights_3, R.drawable.ic_directions_black_24dp));
        items.add(new item(R.string.highlights_4_header, R.string.highlights_4_phone, R.string.highlights_4_address, R.string.highlights_4_website, R.string.highlights_4_description, R.drawable.highlights_4, R.drawable.ic_call_black_24dp, R.drawable.ic_directions_black_24dp,R.drawable.ic_http_black_24dp));
        items.add(new item(R.string.highlights_5_header, R.string.highlights_5_phone, R.string.highlights_5_address, R.string.highlights_5_website, R.string.highlights_5_description, R.drawable.highlights_5, R.drawable.ic_call_black_24dp, R.drawable.ic_directions_black_24dp,R.drawable.ic_http_black_24dp));



        ItemAdapter adapter = new ItemAdapter(getActivity(), items);
        ListView listView = (ListView)rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }

}
