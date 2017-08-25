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
public class ParksFragment extends Fragment {


    public ParksFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.item, container, false);

        final ArrayList<item> items = new ArrayList<item>();
        items.add(new item(R.string.parks_1_header, R.string.parks_1_phone, R.string.parks_1_address, R.string.parks_1_website, R.string.parks_1_description, R.drawable.park_1, R.drawable.ic_call_black_24dp, R.drawable.ic_directions_black_24dp,R.drawable.ic_http_black_24dp));
        items.add(new item(R.string.parks_2_header, R.string.parks_2_phone, R.string.parks_2_address, R.string.parks_2_website, R.string.parks_2_description, R.drawable.park_2, R.drawable.ic_call_black_24dp, R.drawable.ic_directions_black_24dp,R.drawable.ic_http_black_24dp));
        items.add(new item(R.string.parks_3_header, R.string.parks_3_phone, R.string.parks_3_address, R.string.parks_3_description, R.drawable.park_3, R.drawable.ic_call_black_24dp, R.drawable.ic_directions_black_24dp));
        items.add(new item(R.string.parks_4_header, R.string.parks_4_phone, R.string.parks_4_address, R.string.parks_4_website, R.string.parks_4_description, R.drawable.park_4, R.drawable.ic_call_black_24dp, R.drawable.ic_directions_black_24dp,R.drawable.ic_http_black_24dp));
        items.add(new item(R.string.parks_5_header, R.string.parks_5_phone, R.string.parks_5_address, R.string.parks_5_website, R.string.parks_5_description, R.drawable.park_5, R.drawable.ic_call_black_24dp, R.drawable.ic_directions_black_24dp,R.drawable.ic_http_black_24dp));


        ItemAdapter adapter = new ItemAdapter(getActivity(), items);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }
}
