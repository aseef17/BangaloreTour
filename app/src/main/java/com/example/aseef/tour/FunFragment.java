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
public class FunFragment extends Fragment {


    public FunFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.item, container, false);

        final ArrayList<item> items=new ArrayList<item>();
        items.add(new item(R.string.fun_1_header, R.string.fun_1_phone, R.string.fun_1_address, R.string.fun_1_website, R.string.fun_1_description, R.drawable.fun_1, R.drawable.ic_call_black_24dp, R.drawable.ic_directions_black_24dp,R.drawable.ic_http_black_24dp));
        items.add(new item(R.string.fun_2_header, R.string.fun_2_phone, R.string.fun_2_address, R.string.fun_2_website, R.string.fun_2_description, R.drawable.fun_2, R.drawable.ic_call_black_24dp, R.drawable.ic_directions_black_24dp,R.drawable.ic_http_black_24dp));
        items.add(new item(R.string.fun_3_header, R.string.fun_3_phone, R.string.fun_3_address, R.string.fun_3_website, R.string.fun_3_description, R.drawable.fun_3, R.drawable.ic_call_black_24dp, R.drawable.ic_directions_black_24dp,R.drawable.ic_http_black_24dp));
        items.add(new item(R.string.fun_4_header, R.string.fun_4_phone, R.string.fun_4_address, R.string.fun_4_website, R.string.fun_4_description, R.drawable.fun_4, R.drawable.ic_call_black_24dp, R.drawable.ic_directions_black_24dp,R.drawable.ic_http_black_24dp));
        items.add(new item(R.string.fun_5_header, R.string.fun_5_phone, R.string.fun_5_address, R.string.fun_5_website, R.string.fun_5_description, R.drawable.fun_5, R.drawable.ic_call_black_24dp, R.drawable.ic_directions_black_24dp,R.drawable.ic_http_black_24dp));



        ItemAdapter adapter = new ItemAdapter(getActivity(), items);
        ListView listView = (ListView)rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }

}
